package testCase_CurrentAffairMaterials;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_CurrentAffairMaterials.PracticeQuestion_December2020;

public class PracticeQuestion_December2020_TestCase extends CommonFunction{

	public void PracticeQuestion_December2020Function() {
		
		PageFactory.initElements(driver, PracticeQuestion_December2020.class);
		
		WebElement element1=PracticeQuestion_December2020.Clickquestion;
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click()", element1);
		
		LOG.info("December2020 PracticeQuestion clicked");
		
		WebElement element=PracticeQuestion_December2020.Clickclosepopup;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		
		LOG.info("Subscription Popup Closed");
		
	}
	

	@Test
	public void PracticeQuestion_December2020() throws InterruptedException {
		
		LOG.info("December2020 PracticeQuestion function running");
		PracticeQuestion_December2020Function();
		LOG.info("December2020 PracticeQuestion function finished");
		
	}
}
