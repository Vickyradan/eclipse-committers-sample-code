package testCase_GeneralStudies_History;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_History.Buddhism;
public class Buddhism_TestCase extends CommonFunction {

	public void BuddhismFunction() {
		PageFactory.initElements(driver, Buddhism.class);
		Buddhism.clickBuddhism.click();
		LOG.info("Buddhism clicked");
		
		Buddhism.ClickSubscribe.click();
		LOG.info("Subscribe clicked");
		
	}
	
	@Test(priority=6)
	public void Buddhism(){
		
		LOG.info("Buddhism function running");
		BuddhismFunction();
		LOG.info("Buddhism function finished");
		
		driver.navigate().back();
	}
}
