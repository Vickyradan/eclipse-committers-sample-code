package testCase_GeneralStudies_Politics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_Politics.Elections;
public class Elections_TestCase extends CommonFunction{

	
	public void Electionsfunction() {
		
		PageFactory.initElements(driver, Elections.class);
		Elections.ClickElections.click();
		LOG.info("Elections clicked");
		
		WebElement element =Elections.ClickSampleMaterial;
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		LOG.info("Sample Material clicked");
		
	}
	@Test
	public void  Elections() throws InterruptedException {

		LOG.info("Elections function running");
		Electionsfunction();
		LOG.info("Elections function finished");
		
		driver.navigate().back();
	}
}
