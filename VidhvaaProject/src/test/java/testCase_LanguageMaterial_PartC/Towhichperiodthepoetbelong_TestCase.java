package testCase_LanguageMaterial_PartC;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_LanguageMaterial_PartC.Towhichperiodthepoetbelong;

public class Towhichperiodthepoetbelong_TestCase extends CommonFunction{

	
	public void Towhichperiodthepoetbelongfunction(){
		PageFactory.initElements(driver, Towhichperiodthepoetbelong.class);
		Towhichperiodthepoetbelong.ClickTowhichperiodthepoetbelong.click();
		LOG.info("To which period the poet belong clicked");
				
		WebElement element = Towhichperiodthepoetbelong.ClickSampleMaterial;
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		LOG.info("Sample Material clicked");
		
	}
	
	
	@Test
	public void Towhichperiodthepoetbelong()  {

		LOG.info("To which period the poet belong function running");
		Towhichperiodthepoetbelongfunction();
		LOG.info("To which period the poet belong function finished");
		
		driver.navigate().back();

	}
}
