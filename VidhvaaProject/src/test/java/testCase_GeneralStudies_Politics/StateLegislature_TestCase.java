package testCase_GeneralStudies_Politics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_Politics.StateLegislature;
public class StateLegislature_TestCase extends CommonFunction{

	
	public void  StateLegislaturefunction() {
		
		PageFactory.initElements(driver, StateLegislature.class);
		StateLegislature.ClickStateLegislature.click();
		LOG.info("State Legislature clicked");
		
		WebElement element = StateLegislature.ClickSampleMaterial;
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		LOG.info("Sample Material clicked");
	}
	
	@Test
	public void  StateLegislature() throws InterruptedException {

		LOG.info("State Legislature function running");
		StateLegislaturefunction();
		LOG.info("State Legislature function finished");
				
		driver.navigate().back();
	}
}
