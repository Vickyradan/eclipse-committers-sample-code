package testCase_LanguageMaterial_PartC;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_LanguageMaterial_PartC.FamousQuotes_Whosaidthis;

public class FamousQuotes_Whosaidthis_TestCase extends CommonFunction{

	
	public void FamousQuotes_Whosaidthisfunction(){
		PageFactory.initElements(driver, FamousQuotes_Whosaidthis.class);
		FamousQuotes_Whosaidthis.ClickFamousQuotes_Whosaidthis.click();
		LOG.info("Famous Quotes - Who said this? clicked");
		
		WebElement element = FamousQuotes_Whosaidthis.ClickSampleMaterial;
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		LOG.info("Sample Material clicked");
		
	}
	
	
	@Test
	public void FamousQuotes_Whosaidthis()  {

		LOG.info("Famous Quotes - Who said this? function running");
		FamousQuotes_Whosaidthisfunction();
		LOG.info("Famous Quotes - Who said this? function finished");
		
		driver.navigate().back();

	}
}
