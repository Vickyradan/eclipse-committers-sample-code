package testCase_GeneralStudies_Mathematics;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_Mathematics.Material_SimpleInterest;

public class Material_SimpleInterest_TestCase extends CommonFunction {
	
	
	public void Material_SimpleInteres() {
		
		PageFactory.initElements(driver, Material_SimpleInterest.class);
		Material_SimpleInterest.ClickSimpleInterest.click();
		LOG.info("Simple Interest clicked");
		
		Material_SimpleInterest.ClickSubscribe.click();
		
		LOG.info("Subscribe clicked");
		
	}
	
	
	@Test
	public void SimpleInterest() {
		
		LOG.info("Simple Interest function running");
		Material_SimpleInteres();
		LOG.info("Simple Interest function finished");
		driver.navigate().back();
	}
	

}
