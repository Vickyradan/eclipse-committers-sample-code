package testCase_GeneralStudies_Economics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import commonFunctions.PageReturn;
import  objectDetails_GeneralStudies_Economics.EconomicTrendsinTamilnadu;
public class EconomicTrendsinTamilnadu_TestCase extends CommonFunction{

	
	public void EconomicTrendsinTamilnadufunction() {
		PageFactory.initElements(driver, EconomicTrendsinTamilnadu.class);
		EconomicTrendsinTamilnadu.ClickEconomicTrendsinTamilnadu.click();
		LOG.info("Economic Trends in Tamilnadu clicked");
		
		WebElement element = EconomicTrendsinTamilnadu.ClickSampleMaterial;
		
		
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
	public void EconomicTrendsinTamilnadu() throws InterruptedException {

		LOG.info("Economic Trends in Tamilnadu function running");
		EconomicTrendsinTamilnadufunction();
		LOG.info("Economic Trends in Tamilnadu function finished");
		
		Pageback();
	}
}
