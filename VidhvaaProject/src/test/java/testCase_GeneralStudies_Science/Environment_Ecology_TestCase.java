package testCase_GeneralStudies_Science;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_Science.Environment_Ecology;
public class Environment_Ecology_TestCase extends CommonFunction {

	public void Environment_EcologyFunction() {
		PageFactory.initElements(driver, Environment_Ecology.class);
		Environment_Ecology.ClickEnvironment_Ecology.click();
		LOG.info("Environment, Ecology clicked");
		
		Environment_Ecology.Subscribe.click();
		LOG.info("subscribe clicked");
		
	}
	
	@Test
	public void Environment_Ecology() {
		
		LOG.info("Environment, Ecology function running");
		Environment_EcologyFunction();
		LOG.info("Environment, Ecology function finished");
		
		driver.navigate().back();
	}
}
