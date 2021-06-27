package testCase_LanguageMaterial_PartC;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_LanguageMaterial_PartC.WhichNationalitythestorybelongsto;

public class WhichNationalitythestorybelongsto_TestCase extends CommonFunction{

	
	public void WhichNationalitythestorybelongstofunction(){
		PageFactory.initElements(driver, WhichNationalitythestorybelongsto.class);
		WhichNationalitythestorybelongsto.ClickWhichNationalitythestorybelongsto.click();
		LOG.info("Which Nationality the story belongs to? clicked");
		
		WebElement element = WhichNationalitythestorybelongsto.ClickSampleMaterial;
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		LOG.info("Sample Material clicked");
		
	}
	
	
	@Test
	public void WhichNationalitythestorybelongsto()  {

		LOG.info("Which Nationality the story belongs to? function running");
		WhichNationalitythestorybelongstofunction();
		LOG.info("Which Nationality the story belongs to? function finished");
		driver.navigate().back();

	}
}
