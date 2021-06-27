package testCase_GeneralStudies_Science;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_Science.ElectricityAndElectronics;
public class ElectricityAndElectronics_TestCase extends CommonFunction {

	public void ElectricityAndElectronicsFunction() {
		PageFactory.initElements(driver, ElectricityAndElectronics.class);
		ElectricityAndElectronics.ElectricityAndElectronics.click();
		LOG.info("Electricity And Electronics clicked");
		
		ElectricityAndElectronics.Subscribe.click();
		LOG.info("subscribe clicked");
		
	}
	
	@Test
	public void ElectricityAndElectronics() {
		
		LOG.info("Electricity And Electronics function running");
		ElectricityAndElectronicsFunction();
		LOG.info("Electricity And Electronics function finished");
		
		driver.navigate().back();
	}
}
