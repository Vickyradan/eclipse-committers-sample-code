package testCase_LanguageMaterial_PartA;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_LanguageMaterial_PartA.Findtheoddwords;

public class Findtheoddwords_TestCase extends CommonFunction{

	
	public void Findtheoddwordsfunction(){
		PageFactory.initElements(driver, Findtheoddwords.class);
		Findtheoddwords.ClickFindtheoddwords.click();
		LOG.info("Find the odd words clicked");

		WebElement element = Findtheoddwords.ClickSampleMaterial;

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		LOG.info("Sample Material clicked");

	}


	@Test
	public void Findtheoddwords()  {
		
		LOG.info("Find the odd words function running");
		Findtheoddwordsfunction();
		LOG.info("Find the odd words function finished");
		driver.navigate().back();
	}
}
