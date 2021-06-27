package testCase_GeneralStudies_Mathematics;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_Mathematics.Material_TimeandWork;

public class Material_TimeandWork_TestCase extends CommonFunction {

	public void TimeandWorkFunction() {
		
		PageFactory.initElements(driver, Material_TimeandWork.class);
		Material_TimeandWork.TimeandWork.click();
		LOG.info("Time and Work clicked");
		
		Material_TimeandWork.ClickSubscribe.click();
		LOG.info("Subscribe clicked");
	}
	
	
	@Test
	public void TimeandWork() {

		LOG.info("Time and Work function running");
		TimeandWorkFunction();
		LOG.info("Time and Work function finished");
		
		driver.navigate().back();
	}
}
