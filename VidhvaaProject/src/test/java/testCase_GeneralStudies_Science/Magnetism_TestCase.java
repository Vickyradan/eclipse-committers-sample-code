package testCase_GeneralStudies_Science;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_Science.Magnetism;
public class Magnetism_TestCase extends CommonFunction{
	
	public void MagnetismFunction() {
		
		PageFactory.initElements(driver, Magnetism.class);
		Magnetism.Magnetism.click();
		LOG.info("Magnetism clicked");
		
		Magnetism.Subscribe.click();
		LOG.info("subscribe clicked");
	}
	
	@Test
	public void Magnetism() {
		
		LOG.info("Magnetism function running");
		MagnetismFunction();
		LOG.info("Magnetism function finished");
		
		driver.navigate().back();
	}

}
