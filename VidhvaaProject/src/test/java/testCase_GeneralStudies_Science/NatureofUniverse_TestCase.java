package testCase_GeneralStudies_Science;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import commonFunctions.Login;
import objectDetails_GeneralStudies_Science.NatureofUniverse;

public class NatureofUniverse_TestCase extends CommonFunction {

	public void LoginFunction(){

		PageFactory.initElements(driver, Login.class);

		Login.ClickLogin.click();
		Login.Moblie.sendKeys(property.getProperty("MobileNumber"));
		Login.email.sendKeys(property.getProperty("Email"));
		Login.Submit.click();
	}
	
	
	public void NatureofUniverseFunction() throws InterruptedException {
		
		PageFactory.initElements(driver, NatureofUniverse.class);
		NatureofUniverse.ClickGeneralStudies.click();
		LOG.info("General Studies clicked");
		
		NatureofUniverse.Material.click();
		LOG.info("Science clicked");
		NatureofUniverse.Natureofuniverse.click();
		LOG.info("Nature of Universe clicked");
		Thread.sleep(3000);
		NatureofUniverse.viewsample.click();
		
		LOG.info("subscribe clicked");
	}
	
	@Test
	public void NatureofUniverse() throws InterruptedException {
		LoginFunction();
		LOG.info("Nature of Universe function running");
		NatureofUniverseFunction();
		LOG.info("Nature of Universe function finished");
		
		driver.navigate().back();
	}
}
