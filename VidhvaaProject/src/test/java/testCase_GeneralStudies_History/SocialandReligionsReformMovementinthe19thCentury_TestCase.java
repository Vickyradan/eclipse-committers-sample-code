package testCase_GeneralStudies_History;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_History.SocialandReligionsReformMovementinthe19thCentury;
public class SocialandReligionsReformMovementinthe19thCentury_TestCase extends CommonFunction{

	public void SocialandReligionsReformMovementinthe19thCenturyFunction() {
		PageFactory.initElements(driver, SocialandReligionsReformMovementinthe19thCentury.class);
		SocialandReligionsReformMovementinthe19thCentury.clickSocialandReligionsReformMovementinthe19thCentury.click();
		LOG.info("Social and Religions Reform Movement in the 19th Century clicked");
		
		SocialandReligionsReformMovementinthe19thCentury.ClickSubscribe.click();
		LOG.info("Subscribe clicked");
		
	}
	
	@Test(priority=21)
	public void SocialandReligionsReformMovementinthe19thCentury(){
		
		LOG.info("Social and Religions Reform Movement in the 19th Century function running");
		SocialandReligionsReformMovementinthe19thCenturyFunction();
		LOG.info("Social and Religions Reform Movement in the 19th Century function finished");
		driver.navigate().back();
	}
}
