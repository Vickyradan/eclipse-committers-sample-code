package testCase_LanguageMaterial_PartC;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_LanguageMaterial_PartC.Whatisthethemesobservedintheliteraryworks;

public class Whatisthethemesobservedintheliteraryworks_TestCase extends CommonFunction{

	
	public void Whatisthethemesobservedintheliteraryworksfunction(){
		PageFactory.initElements(driver, Whatisthethemesobservedintheliteraryworks.class);
		Whatisthethemesobservedintheliteraryworks.ClickWhatisthethemesobservedintheliteraryworks.click();
		LOG.info("What is the themes observed in the literary works? clicked");
		
		WebElement element = Whatisthethemesobservedintheliteraryworks.ClickSampleMaterial;
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		LOG.info("Sample Material clicked");
		
	}
	
	
	@Test
	public void Whatisthethemesobservedintheliteraryworks()  {

		LOG.info("What is the themes observed in the literary works? function running");
		Whatisthethemesobservedintheliteraryworksfunction();
		LOG.info("What is the themes observed in the literary works? function finished");
		
		driver.navigate().back();

	}
}
