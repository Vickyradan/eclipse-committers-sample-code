package testCase_LanguageMaterial_PartC;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_LanguageMaterial_PartC.IdentifytheAuthorwiththeshortstory;

public class IdentifytheAuthorwiththeshortstory_TestCase extends CommonFunction{

	
	public void IdentifytheAuthorwiththeshortstoryfunction(){
		PageFactory.initElements(driver, IdentifytheAuthorwiththeshortstory.class);
		IdentifytheAuthorwiththeshortstory.ClickIdentifytheAuthorwiththeshortstory.click();
		LOG.info("Identify the Author with the short story clicked");
		
		WebElement element = IdentifytheAuthorwiththeshortstory.ClickSampleMaterial;
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		LOG.info("Sample Material clicked");
		
	}
	
	
	@Test
	public void IdentifytheAuthorwiththeshortstory()  {

		LOG.info("Identify the Author with the short story function running");
		IdentifytheAuthorwiththeshortstoryfunction();
		LOG.info("Identify the Author with the short story function finished");		
		driver.navigate().back();

	}
}
