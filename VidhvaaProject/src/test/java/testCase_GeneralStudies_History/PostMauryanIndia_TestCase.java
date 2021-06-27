package testCase_GeneralStudies_History;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_History.PostMauryanIndia;
public class PostMauryanIndia_TestCase extends CommonFunction{

	public void PostMauryanIndiaFunction() {
		PageFactory.initElements(driver, PostMauryanIndia.class);
		PostMauryanIndia.clickPostMauryanIndia.click();
		LOG.info("Post Mauryan India clicked");
		
		PostMauryanIndia.ClickSubscribe.click();
		LOG.info("Subscribe clicked");
	}
	
	
	@Test(priority=8)
	public void PostMauryanIndia(){
		
		LOG.info("Post Mauryan India function running");
		PostMauryanIndiaFunction();
		LOG.info("Post Mauryan India function finished");
		
		driver.navigate().back();
	}
}
