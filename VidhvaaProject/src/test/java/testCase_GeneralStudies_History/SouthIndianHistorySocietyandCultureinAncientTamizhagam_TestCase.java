package testCase_GeneralStudies_History;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_History.SouthIndianHistorySocietyandCultureinAncientTamizhagam;
public class SouthIndianHistorySocietyandCultureinAncientTamizhagam_TestCase extends CommonFunction {

	public void SouthIndianHistorySocietyandCultureinAncientTamizhagamFunction() {
		
		PageFactory.initElements(driver, SouthIndianHistorySocietyandCultureinAncientTamizhagam.class);
		SouthIndianHistorySocietyandCultureinAncientTamizhagam.
		                               clickSouthIndianHistorySocietyandCultureinAncientTamizhagam.click();
		LOG.info("South Indian History Society and Culture in Ancient Tamizhagam clicked");
		
		SouthIndianHistorySocietyandCultureinAncientTamizhagam.ClickSubscribe.click();
		LOG.info("Subscribe clicked");
		
	}
	
	
	
	@Test(priority=27)
	public void  SouthIndianHistorySocietyandCultureinAncientTamizhagam(){
		
		LOG.info("South Indian History Society and Culture in Ancient Tamizhagam function running");
		SouthIndianHistorySocietyandCultureinAncientTamizhagamFunction();
		LOG.info("South Indian History Society and Culture in Ancient Tamizhagam function finished");
		
		driver.navigate().back();
	}
	
}
