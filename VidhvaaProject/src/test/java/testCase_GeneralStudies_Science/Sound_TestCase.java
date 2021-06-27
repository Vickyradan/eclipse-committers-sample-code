package testCase_GeneralStudies_Science;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_Science.Sound;
public class Sound_TestCase extends CommonFunction{

	public void SoundFunction() {
		PageFactory.initElements(driver, Sound.class);
		Sound.ClickSound.click();
		LOG.info("Sound clicked");
		
		Sound.Subscribe.click();
		LOG.info("subscribe clicked");
	}
	
	@Test
	public void Sound() {
		
		LOG.info("Sound function running");
		SoundFunction();
		LOG.info("Sound function finished");
		
		driver.navigate().back();
	}
}
