package testCase_GeneralStudies_Science;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import  objectDetails_GeneralStudies_Science.Force;
import commonFunctions.CommonFunction;

public class Force_TestCase extends CommonFunction{

	public void ForceFunction() {
		PageFactory.initElements(driver, Force.class);
		Force.Force.click();
		LOG.info("force clicked");
		
		Force.Subscribe.click();
		LOG.info("subscribe clicked");
		
	}
	
	@Test
	public void Force() {
		
		LOG.info("force function running");
		ForceFunction();
		LOG.info("force function finished");
		
		driver.navigate().back();
	}
}
