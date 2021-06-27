package testCase_GeneralStudies_Science;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import objectDetails_GeneralStudies_Science.MotionandEnergy;
import commonFunctions.CommonFunction;

public class MotionandEnergy_TestCase extends CommonFunction {

	private void MotionandEnergyFunction() {
		PageFactory.initElements(driver, MotionandEnergy.class);
		MotionandEnergy.MotionandEnergy.click();
		LOG.info("motion and Energy clicked");
		
		
		MotionandEnergy.Subscribe.click();
		LOG.info("subscribe clicked");
		
	}
	
	@Test
	public void MotionandEnergy() {
		
		LOG.info("motion and Energy function running");
		MotionandEnergyFunction();
		LOG.info("motion and Energy function finished");
		
		driver.navigate().back();
	}
}
