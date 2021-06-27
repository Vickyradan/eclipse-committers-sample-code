package testCase_LanguageMaterial_PartA;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_LanguageMaterial_PartA.FindOuttheError;

public class FindOuttheError_TestCase extends CommonFunction{

	public void FindOuttheErrorfunction(){
		PageFactory.initElements(driver, FindOuttheError.class);
		FindOuttheError.ClickFindOuttheError.click();
		LOG.info("Find Out the Error clicked");

		WebElement element = FindOuttheError.ClickSampleMaterial;

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		LOG.info("Sample Material clicked");

	}


	@Test
	public void FindOuttheError()  {
		
		LOG.info("Find Out the Error function running");
		FindOuttheErrorfunction();
		LOG.info("Find Out the Error function finished");
		driver.navigate().back();
	}
}
