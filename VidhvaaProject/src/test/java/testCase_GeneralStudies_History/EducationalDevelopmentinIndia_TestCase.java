package testCase_GeneralStudies_History;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_History.EducationalDevelopmentinIndia;
public class EducationalDevelopmentinIndia_TestCase extends CommonFunction{

	
	public void EducationalDevelopmentinIndiaFunctions() {
		
		PageFactory.initElements(driver, EducationalDevelopmentinIndia.class);
		EducationalDevelopmentinIndia.clickEducationalDevelopmentinIndia.click();
		LOG.info("Educational Development in India clicked");
		
		EducationalDevelopmentinIndia.ClickSubscribe.click();
		LOG.info("Subscribe clicked");
		
	}
	
	
	@Test(priority=22)
	public void EducationalDevelopmentinIndia(){
		
		LOG.info("Educational Development in India function running");
		EducationalDevelopmentinIndiaFunctions();
		LOG.info("Educational Development in India function finished");
		
		driver.navigate().back();
	}
}
