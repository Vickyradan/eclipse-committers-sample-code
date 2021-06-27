package testCase_GeneralStudies_Science;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_Science.Reproductivesystem;
public class Reproductivesystem_TestCase extends CommonFunction{

	public void ReproductivesystemFunction() {
		PageFactory.initElements(driver, Reproductivesystem.class);
		Reproductivesystem.ClickBloodandBloodCirculaton.click();
		LOG.info("Reproductive system clicked");
		
		Reproductivesystem.Subscribe.click();
		LOG.info("subscribe clicked");
		
	}
	@Test
	public void Reproductivesystem() {
		
		LOG.info("Reproductive system function running");
		ReproductivesystemFunction();
		LOG.info("Reproductive system function finished");
		
		driver.navigate().back();
	}
}
