package testCase_LanguageMaterial_PartA;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_LanguageMaterial_PartA.Tenses;

public class Tenses_TestCase extends CommonFunction{

	
	public void Tensesfunction(){
		PageFactory.initElements(driver, Tenses.class);
		Tenses.ClickTenses.click();
		LOG.info("Tenses clicked");

		WebElement element = Tenses.ClickSampleMaterial;

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		
		LOG.info("Sample Material clicked");

	}


	@Test
	public void Tenses()  {
		
		LOG.info("Tenses function running");
		Tensesfunction();
		LOG.info("Tenses function running");
		driver.navigate().back();
	}
}
