package testCase_GeneralStudies_History;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_History.SangamAge;
public class SangamAge_TestCase extends CommonFunction{

	public void SangamAgeFunction() {
		
		PageFactory.initElements(driver, SangamAge.class);
		SangamAge.clickSangamAge.click();
		LOG.info("Sangam Age clicked");
		
		SangamAge.ClickSubscribe.click();
		LOG.info("Subscribe clicked");
		
	}
	
	
	@Test(priority=28)
	public void  SangamAge(){
		
		LOG.info("Sangam Age function running");
		SangamAgeFunction();
		LOG.info("Sangam Age function finished");
		
		driver.navigate().back();
	}
}
