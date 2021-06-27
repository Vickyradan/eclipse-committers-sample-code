package testCase_LanguageMaterial_PartC;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_LanguageMaterial_PartC.Aboutthedramatist;

public class Aboutthedramatist_TestCase extends CommonFunction{

	
	public void Aboutthedramatistfunction(){
		PageFactory.initElements(driver, Aboutthedramatist.class);
		Aboutthedramatist.ClickAboutthedramatist.click();
		LOG.info("About the dramatist clicked");
		
		WebElement element = Aboutthedramatist.ClickSampleMaterial;
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		LOG.info("Sample Material clicked");
		
	}
	
	
	@Test
	public void Aboutthedramatist()  {

		LOG.info("About the dramatist function running");
		Aboutthedramatistfunction();
		LOG.info("About the dramatist function finished");
		
		driver.navigate().back();

	}
}
