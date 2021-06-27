package testCase_GeneralStudies_History;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_History.Marathas;
public class Marathas_TestCase extends CommonFunction{

	public void MarathasFunction() {
		
		PageFactory.initElements(driver, Marathas.class);
		Marathas.clickMarathas.click();
		LOG.info("Marathas clicked");
		
		Marathas.ClickSubscribe.click();
		LOG.info("Subscribe clicked");
		
	}
	
	
	@Test(priority=17)
	public void Marathas(){
		
		LOG.info("Marathas function running");
		MarathasFunction();
		LOG.info("Marathas function finished");
		
		driver.navigate().back();
	}
}
