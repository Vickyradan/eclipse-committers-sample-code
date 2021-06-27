package testCase_GeneralStudies_History;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_History.SocialTransformationinTamilnadu;
public class SocialTransformationinTamilnadu_TestCase extends CommonFunction{

	public void SocialTransformationinTamilnaduFunction() {
		
		PageFactory.initElements(driver, SocialTransformationinTamilnadu.class);
		SocialTransformationinTamilnadu.clickSocialTransformationinTamilnadu.click();
		LOG.info("Social Transformation in Tamilnadu clicked");
		
		SocialTransformationinTamilnadu.ClickSubscribe.click();
		LOG.info("Subscribe clicked");
		
	}
	
	@Test(priority=32)
	public void  SocialTransformationinTamilnadu(){
		
		LOG.info("Social Transformation in Tamilnadu function running");
		SocialTransformationinTamilnaduFunction();
		LOG.info("Social Transformation in Tamilnadu function finished");
		
		driver.navigate().back();
	}
	
}
