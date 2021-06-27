package testCase_LanguageMaterial_PartB;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_LanguageMaterial_PartB.Appreciationsquestionsfrompoetry;
public class Appreciationsquestionsfrompoetry_TestCase extends CommonFunction{

	public void Appreciationsquestionsfrompoetryfunction() {
		
		PageFactory.initElements(driver, Appreciationsquestionsfrompoetry.class);
		
		Appreciationsquestionsfrompoetry.ClickAppreciationsquestionsfrompoetry.click();
		LOG.info("Appreciations questions from poetry  clicked");
		WebElement element = Appreciationsquestionsfrompoetry.ClickSampleMaterial;
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		LOG.info("Sample Material clicked");
	}
	
	
	@Test
	public void Appreciationsquestionsfrompoetry()  {

		LOG.info("Appreciations questions from poetry function running");
		Appreciationsquestionsfrompoetryfunction();
		LOG.info("Appreciations questions from poetry function finished");
		driver.navigate().back();


	}
}
