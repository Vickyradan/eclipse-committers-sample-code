package testCase_CurrentAffairMaterials;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_CurrentAffairMaterials.PracticeQuestion_January2021;

public class PracticeQuestion_January2021_TestCase extends CommonFunction{

	public void PracticeQuestion_January2021Function() {
		
		PageFactory.initElements(driver, PracticeQuestion_January2021.class);
	
		WebElement element1=PracticeQuestion_January2021.Clickquestion;
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click()", element1);
		
		LOG.info("January2021 PracticeQuestion clicked");
		
		WebElement element=PracticeQuestion_January2021.Clickclosepopup;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		
		LOG.info("Subscription Popup Closed");
	
	}
	
	@Test
	public void PracticeQuestion_January2021() throws InterruptedException {
		
		LOG.info("January2021 PracticeQuestion function running");
		PracticeQuestion_January2021Function();
		LOG.info("January2021 PracticeQuestion function finished");
		
	}
}
