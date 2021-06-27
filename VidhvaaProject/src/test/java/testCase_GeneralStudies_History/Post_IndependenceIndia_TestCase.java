package testCase_GeneralStudies_History;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_History.Post_IndependenceIndia;
public class Post_IndependenceIndia_TestCase extends CommonFunction{

	
	public void Post_IndependenceIndiaFunction() {
		PageFactory.initElements(driver, Post_IndependenceIndia.class);
		Post_IndependenceIndia.clickPost_IndependenceIndia.click();
		LOG.info("Post - Independence India clicked");
		
		Post_IndependenceIndia.ClickSubscribe.click();
		LOG.info("Subscribe clicked");
		
	}
	
	@Test(priority=25)
	public void  Post_IndependenceIndia(){
		
		LOG.info("Post - Independence India function running");
		Post_IndependenceIndiaFunction();
		LOG.info("Post - Independence India function finished");
		
		driver.navigate().back();
	}
}
