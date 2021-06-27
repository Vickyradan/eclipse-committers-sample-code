package testCase_LanguageMaterial_PartA;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_LanguageMaterial_PartA.Selectthecorrectsentence;

public class Selectthecorrectsentence_TestCase extends CommonFunction{

	
	public void Selectthecorrectsentencefunction(){
		PageFactory.initElements(driver, Selectthecorrectsentence.class);
		Selectthecorrectsentence.ClickSelectthecorrectsentence.click();
		LOG.info("Select the correct sentence clicked");

		WebElement element = Selectthecorrectsentence.ClickSampleMaterial;

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		LOG.info("Sample Material clicked");

	}


	@Test
	public void Selectthecorrectsentence()  {
		
		LOG.info("Select the correct sentence function running");
		Selectthecorrectsentencefunction();
		LOG.info("Select the correct sentence function finished");
		driver.navigate().back();
	}
}
