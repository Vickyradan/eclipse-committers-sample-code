package testCase_GeneralStudies_Science;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;

public class General_Scientific_Laws_TestCase extends CommonFunction {

	public void General_Scientific_LawsFunction() {
		
		PageFactory.initElements(driver,objectDetails_GeneralStudies_Science.General_Scientific_Laws.class);
		objectDetails_GeneralStudies_Science.General_Scientific_Laws.General_Scientific_Laws.click();
		LOG.info("General Scientific Laws clicked");
		
		objectDetails_GeneralStudies_Science.General_Scientific_Laws.Subscribe.click();
		LOG.info("subscribe clicked");
		
	}
	
	
	
	@Test
	public void General_Scientific_Laws() {
		
		LOG.info("General Scientific Laws function running");
		General_Scientific_LawsFunction();
		LOG.info("General Scientific Laws function finished");
		
		driver.navigate().back();
	}
}
