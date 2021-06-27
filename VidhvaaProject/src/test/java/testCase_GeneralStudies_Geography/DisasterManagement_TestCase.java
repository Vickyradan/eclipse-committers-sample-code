package testCase_GeneralStudies_Geography;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_Geography.DisasterManagement;
public class DisasterManagement_TestCase extends CommonFunction{

	
	public void DisasterManagementfunction() {
		
		PageFactory.initElements(driver, DisasterManagement.class);
		DisasterManagement.ClickDisasterManagement.click();
		LOG.info("Disaster Management clicked");
		
		WebElement element =DisasterManagement.ClickSampleMaterial;
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		LOG.info("Sample Material clicked");
	}
	@Test
	public void DisasterManagement() {
		
		LOG.info("Disaster Management function running");
		DisasterManagementfunction();
		LOG.info("Disaster Management function finished");
		
		driver.navigate().back();

	}
}
