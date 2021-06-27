package testCase_GeneralStudies_History;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_History.CulturalFeaturesofIndia;
public class CulturalFeaturesofIndia_TestCase extends CommonFunction{

	public void CulturalFeaturesofIndiaFunction() {
		
		PageFactory.initElements(driver, CulturalFeaturesofIndia.class);
		CulturalFeaturesofIndia.clickCulturalFeaturesofIndia.click();
		LOG.info("Cultural Features of India clicked");
		CulturalFeaturesofIndia.ClickSubscribe.click();
		LOG.info("Subscribe clicked");
		
	}
	
	
	@Test(priority=26)
	public void  CulturalFeaturesofIndia(){
		
		LOG.info("Cultural Features of India function running");
		CulturalFeaturesofIndiaFunction();
		LOG.info("Cultural Features of India function finished");
		
		driver.navigate().back();
	}
}
