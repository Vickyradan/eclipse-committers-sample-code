package testCase_GeneralStudies_History;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_History.CarnaticWars;
public class CarnaticWars_TestCase extends CommonFunction{

	
	public void CarnaticWarsFunction() {
		
		PageFactory.initElements(driver,CarnaticWars.class);
		CarnaticWars.clickCarnaticWars.click();
		LOG.info("Carnatic Wars clicked");
		
		CarnaticWars.ClickSubscribe.click();
		LOG.info("Subscribe clicked");
		
	}
	
	@Test(priority=19)
	public void CarnaticWars(){
		
		LOG.info("Carnatic Wars function running");
		CarnaticWarsFunction();
		LOG.info("Carnatic Wars function finished");
		
		driver.navigate().back();
	}
}
