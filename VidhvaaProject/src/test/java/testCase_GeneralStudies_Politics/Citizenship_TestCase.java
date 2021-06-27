package testCase_GeneralStudies_Politics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_Politics.Citizenship;
public class Citizenship_TestCase extends CommonFunction{

	
	public void Citizenshipfunction() {
	
		PageFactory.initElements(driver, Citizenship.class);
		Citizenship.ClickCitizenship.click();
		LOG.info("Citizenship clicked");
		
		WebElement element = Citizenship.ClickSampleMaterial;
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);	
		LOG.info("Sample Material clicked");
	}
	
	
	@Test
	public void Citizenship() throws InterruptedException {

		LOG.info("Citizenship function running");
		Citizenshipfunction();
		LOG.info("Citizenship function finished");
		
		driver.navigate().back();

	}
}
