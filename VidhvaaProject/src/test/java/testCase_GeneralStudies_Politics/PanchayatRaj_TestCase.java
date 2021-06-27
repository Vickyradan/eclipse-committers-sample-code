package testCase_GeneralStudies_Politics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_Politics.PanchayatRaj;
public class PanchayatRaj_TestCase extends CommonFunction{

	
	public void PanchayatRajfunction() {
		
		PageFactory.initElements(driver, PanchayatRaj.class);
		PanchayatRaj.ClickPanchayatRaj.click();
		LOG.info("Panchayat Raj clicked");
		
		WebElement element = PanchayatRaj.ClickSampleMaterial;
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		LOG.info("Sample Material clicked");
	}
	@Test
	public void  PanchayatRaj() throws InterruptedException {

		LOG.info("Panchayat Raj function running");
		PanchayatRajfunction();
		LOG.info("Panchayat Raj function finished");
		
		driver.navigate().back();
	}
}
