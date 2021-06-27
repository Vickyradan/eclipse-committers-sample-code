package testCase_LanguageMaterial_PartA;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_LanguageMaterial_PartA.SelectthecorrectPluralforms;

public class SelectthecorrectPluralforms_TestCase extends CommonFunction{

	
	public void SelectthecorrectPluralformsfunction(){
		PageFactory.initElements(driver, SelectthecorrectPluralforms.class);
		SelectthecorrectPluralforms.ClickSelectthecorrectPluralforms.click();
		LOG.info("Select the correct Plural forms clicked");
		

		WebElement element = SelectthecorrectPluralforms.ClickSampleMaterial;

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		LOG.info("Sample Material clicked");

	}


	@Test
	public void SelectthecorrectPluralforms()  {
		
		LOG.info("Select the correct Plural forms function running");
		SelectthecorrectPluralformsfunction();
		LOG.info("Select the correct Plural forms function finished");
		driver.navigate().back();
	}
}
