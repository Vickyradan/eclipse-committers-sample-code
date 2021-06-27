package testCase_GeneralStudies_Science;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_Science.Light;
public class Light_TestCase extends CommonFunction {

	
	public void LightFunction() {
		
		PageFactory.initElements(driver,Light.class);
		Light.ClickLight.click();
		LOG.info("Light clicked");
		
		Light.Subscribe.click();
		LOG.info("subscribe clicked");
		
	}
	

	@Test
	public void Light() {
		
		LOG.info("Light function running");
		LightFunction();
		LOG.info("Light function finished");
		
		driver.navigate().back();
	}
}
