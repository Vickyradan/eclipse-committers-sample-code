package testCase_GeneralStudies_Science;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_Science.BloodandBloodCirculaton;
public class BloodandBloodCirculaton_TestCase extends CommonFunction{

	public void BloodandBloodCirculatonFunction() {
		PageFactory.initElements(driver, BloodandBloodCirculaton.class);
		BloodandBloodCirculaton.ClickBloodandBloodCirculaton.click();
		LOG.info("Blood and Blood Circulaton clicked");
		
		BloodandBloodCirculaton.Subscribe.click();
		LOG.info("subscribe clicked");
		
	}
	
	@Test
	public void BloodandBloodCirculaton() {
		
		LOG.info("Blood and Blood Circulaton function running");
		BloodandBloodCirculatonFunction();
		LOG.info("Blood and Blood Circulaton function finished");
		
		driver.navigate().back();
	}
}
