package testCase_LanguageMaterial_PartA;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_LanguageMaterial_PartA.ActivevoiceandPassivevoice;

public class ActivevoiceandPassivevoice_TestCase extends CommonFunction{

	
	public void ActivevoiceandPassivevoicefunction(){
		PageFactory.initElements(driver, ActivevoiceandPassivevoice.class);
		ActivevoiceandPassivevoice.ClickActivevoiceandPassivevoice.click();
		LOG.info("Activevoice and Passivevoice clicked");

		WebElement element = ActivevoiceandPassivevoice.ClickSampleMaterial;

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		LOG.info("Sample Material clicked");

	}


	@Test
	public void ActivevoiceandPassivevoice()  {
		
		LOG.info("Activevoice and Passivevoice function running");
		ActivevoiceandPassivevoicefunction();
		LOG.info("Activevoice and Passivevoice function finished");
		driver.navigate().back();
	}
}
