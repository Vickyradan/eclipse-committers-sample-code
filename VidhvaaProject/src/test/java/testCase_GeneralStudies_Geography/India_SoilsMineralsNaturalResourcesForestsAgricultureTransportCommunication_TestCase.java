package testCase_GeneralStudies_Geography;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_Geography.India_SoilsMineralsNaturalResourcesForestsAgricultureTransportCommunication;
public class India_SoilsMineralsNaturalResourcesForestsAgricultureTransportCommunication_TestCase extends CommonFunction{

	
	public void India_SoilsMineralsNaturalResourcesForestsAgricultureTransportCommunicationfunction() {
		
		PageFactory.initElements(driver, India_SoilsMineralsNaturalResourcesForestsAgricultureTransportCommunication.class);
		
		India_SoilsMineralsNaturalResourcesForestsAgricultureTransportCommunication.
	                                     ClickIndia_SoilsMineralsNaturalResourcesForestsAgricultureTransportCommunication.click();
		LOG.info("India - Soils, Minerals, Natural Resources, Forests, Agriculture, Transport, Communication clicked");
		
		WebElement element =India_SoilsMineralsNaturalResourcesForestsAgricultureTransportCommunication.ClickSampleMaterial;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		LOG.info("Sample Material clicked");
	}
	
	@Test
	public void India_SoilsMineralsNaturalResourcesForestsAgricultureTransportCommunication() {
		
		LOG.info("India - Soils, Minerals, Natural Resources, Forests, Agriculture, Transport, Communication function running");
		India_SoilsMineralsNaturalResourcesForestsAgricultureTransportCommunicationfunction();
		LOG.info("India - Soils, Minerals, Natural Resources, Forests, Agriculture, Transport, Communication function finished");
		
		driver.navigate().back();

	}
}
