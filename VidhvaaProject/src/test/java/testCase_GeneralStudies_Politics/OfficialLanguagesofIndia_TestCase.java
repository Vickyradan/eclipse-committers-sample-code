package testCase_GeneralStudies_Politics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_Politics.OfficialLanguagesofIndia;
public class OfficialLanguagesofIndia_TestCase extends CommonFunction{

	public void OfficialLanguagesofIndiafunction() {
		PageFactory.initElements(driver, OfficialLanguagesofIndia.class);
		OfficialLanguagesofIndia.ClickOfficialLanguagesofIndia.click();
		LOG.info("Official Languages of India clicked");
		
		WebElement element = OfficialLanguagesofIndia.ClickSampleMaterial;
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		LOG.info("Sample Material clicked");
	}
	
	@Test
	public void  OfficialLanguagesofIndia() throws InterruptedException {

		LOG.info("Official Languages of India function running");
		OfficialLanguagesofIndiafunction();
		LOG.info("Official Languages of India function finished");
		
		driver.navigate().back();
	}
}
