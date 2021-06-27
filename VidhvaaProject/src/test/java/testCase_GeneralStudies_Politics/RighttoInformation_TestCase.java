package testCase_GeneralStudies_Politics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_Politics.RighttoInformation;
public class RighttoInformation_TestCase extends CommonFunction{

	
	public void RighttoInformationfunction() {
		
		PageFactory.initElements(driver, RighttoInformation.class);
		RighttoInformation.ClickRighttoInformation.click();
		LOG.info("Right to Information clicked");
		
		WebElement element = RighttoInformation.ClickSampleMaterial;
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		LOG.info("Sample Material clicked");
		
	}
	@Test
	public void  RighttoInformation() throws InterruptedException {
		
		LOG.info("Right to Information function running");
		RighttoInformationfunction();
		LOG.info("Right to Information function finished");
		
		driver.navigate().back();
	}
}
