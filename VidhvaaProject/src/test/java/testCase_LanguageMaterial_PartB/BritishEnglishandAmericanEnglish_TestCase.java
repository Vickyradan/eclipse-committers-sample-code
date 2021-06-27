package testCase_LanguageMaterial_PartB;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import commonFunctions.PageReturn;
import objectDetails_LanguageMaterial_PartB.BritishEnglishandAmericanEnglish;
public class BritishEnglishandAmericanEnglish_TestCase extends CommonFunction{

	public  void BritishEnglishandAmericanEnglishfunction() {
		
		PageFactory.initElements(driver, BritishEnglishandAmericanEnglish.class);
		BritishEnglishandAmericanEnglish.ClickBritishEnglishandAmericanEnglish.click();
		
		LOG.info("British English and American English clicked");
		WebElement element = BritishEnglishandAmericanEnglish.ClickSampleMaterial;
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		LOG.info("sample material clicked");
	}
	
	public void Pageback() throws InterruptedException {

		PageFactory.initElements(driver, PageReturn.class);
		PageReturn.CliclLogo.click();
		Thread.sleep(3000);
		PageReturn.ClickTNPSC.click();
	}
	
	@Test
	public void  BritishEnglishandAmericanEnglish() throws InterruptedException  {

		
		LOG.info("British English and American English function running");
		BritishEnglishandAmericanEnglishfunction();
		LOG.info("British English and American English function finished");
		driver.navigate().back();
		Pageback();
	}
}
