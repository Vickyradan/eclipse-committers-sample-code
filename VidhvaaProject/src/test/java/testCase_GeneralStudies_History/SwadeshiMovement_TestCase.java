package testCase_GeneralStudies_History;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_History.SwadeshiMovement;
public class SwadeshiMovement_TestCase extends CommonFunction{

	public  void SwadeshiMovementfunction() {
		PageFactory.initElements(driver, SwadeshiMovement.class);
		SwadeshiMovement.clickSwadeshiMovement.click();
		LOG.info("Swadeshi Movement clicked");
		
		SwadeshiMovement.ClickSubscribe.click();
		LOG.info("Subscribe clicked");
		
	}
	
	@Test(priority=34)
	public void  SwadeshiMovement(){
		
		LOG.info("Swadeshi Movement function running");
		SwadeshiMovementfunction();
		LOG.info("Swadeshi Movement function finished");
		
		driver.navigate().back();
	}
}
