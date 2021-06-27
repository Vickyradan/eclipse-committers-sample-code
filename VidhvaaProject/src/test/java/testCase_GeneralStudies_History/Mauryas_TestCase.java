package testCase_GeneralStudies_History;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_History.Mauryas;
public class Mauryas_TestCase extends CommonFunction{

	public void MauryasFunction() {
		PageFactory.initElements(driver, Mauryas.class);
		Mauryas.clickMauryas.click();
		LOG.info("Mauryas clicked");
		
		Mauryas.ClickSubscribe.click();
		LOG.info("Subscribe clicked");
	}
	
	@Test(priority=5)
	public void Mauryas(){
		
		LOG.info("Mauryas function running");
		MauryasFunction();
		LOG.info("Mauryas function finished");
		
		driver.navigate().back();
	}
}
