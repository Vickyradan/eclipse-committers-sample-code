package testCase_GeneralStudies_Mathematics;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_Mathematics.Material_TimeandDistance;

public class Material_TimeandDistance_Testcase extends CommonFunction{
   
	
	public void TimeandDistanceFunction() {
		
		PageFactory.initElements(driver, Material_TimeandDistance.class);
		Material_TimeandDistance.ClickTimeandDistance.click();
		LOG.info("Time & Distance clicked");
		
		Material_TimeandDistance.ClickSubscribe.click();
		LOG.info("Subscribe clicked");
	}
	
	@Test
	public void TimeandDistance() {
		
		LOG.info("Time & Distance function running");
		TimeandDistanceFunction();
		LOG.info("Time & Distance function finished");
		
		driver.navigate().back();
		
	}
}
