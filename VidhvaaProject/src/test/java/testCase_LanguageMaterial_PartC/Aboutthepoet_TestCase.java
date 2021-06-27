package testCase_LanguageMaterial_PartC;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_LanguageMaterial_PartC.Aboutthepoet;

public class Aboutthepoet_TestCase extends CommonFunction{

	public void Aboutthepoetfunction(){
		PageFactory.initElements(driver, Aboutthepoet.class);
		Aboutthepoet.ClickAboutthepoet.click();
		LOG.info("About the poet clicked");
		
		WebElement element = Aboutthepoet.ClickSampleMaterial;
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		LOG.info("Sample Material clicked");
		
	}
	
	
	@Test
	public void Aboutthepoet()  {

		LOG.info("About the poet function running");
		Aboutthepoetfunction();
		LOG.info("About the poet function finished");
		
		driver.navigate().back();

	}
}
