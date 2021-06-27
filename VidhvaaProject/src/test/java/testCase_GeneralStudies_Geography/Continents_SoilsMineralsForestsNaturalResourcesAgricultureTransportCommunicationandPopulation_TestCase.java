package testCase_GeneralStudies_Geography;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import commonFunctions.PageReturn;
import objectDetails_GeneralStudies_Geography.Continents_SoilsMineralsForestsNaturalResourcesAgricultureTransportCommunicationandPopulation;
public class Continents_SoilsMineralsForestsNaturalResourcesAgricultureTransportCommunicationandPopulation_TestCase extends CommonFunction{

	
	
	public void Continents_SoilsMineralsForestsNaturalResourcesAgricultureTransportCommunicationandPopulationfunction() {
		
		PageFactory.initElements(driver, Continents_SoilsMineralsForestsNaturalResourcesAgricultureTransportCommunicationandPopulation.class);
		Continents_SoilsMineralsForestsNaturalResourcesAgricultureTransportCommunicationandPopulation.
		                        ClickContinents_SoilsMineralsForestsNaturalResourcesAgricultureTransportCommunicationandPopulation.click();
		WebElement element=Continents_SoilsMineralsForestsNaturalResourcesAgricultureTransportCommunicationandPopulation.ClickSampleMaterial;
		LOG.info("Continents - Soils, Minerals, Forests, Natural Resources, Agriculture, Transport, Communication and Population clicked");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		LOG.info("Sample Material clicked");
		    
	}
	
	public void Pageback() throws InterruptedException {

		PageFactory.initElements(driver, PageReturn.class);
		PageReturn.CliclLogo.click();
		Thread.sleep(3000);
		PageReturn.ClickTNPSC.click();
	}
	
	@Test
	public void Continents_SoilsMineralsForestsNaturalResourcesAgricultureTransportCommunicationandPopulation() throws InterruptedException {
		
		LOG.info("Continents - Soils, Minerals, Forests, Natural Resources, Agriculture, Transport, Communication and Population function running");
		Continents_SoilsMineralsForestsNaturalResourcesAgricultureTransportCommunicationandPopulationfunction();
		LOG.info("Continents - Soils, Minerals, Forests, Natural Resources, Agriculture, Transport, Communication and Population function finished");

		Pageback();
	}
}
