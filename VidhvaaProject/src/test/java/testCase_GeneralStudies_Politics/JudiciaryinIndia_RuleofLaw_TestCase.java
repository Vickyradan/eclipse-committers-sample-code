package testCase_GeneralStudies_Politics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_Politics.JudiciaryinIndia_RuleofLaw;

public class JudiciaryinIndia_RuleofLaw_TestCase extends CommonFunction{

	public void JudiciaryinIndiafunction() {
		
		PageFactory.initElements(driver, JudiciaryinIndia_RuleofLaw.class);
		JudiciaryinIndia_RuleofLaw.ClickJudiciaryinIndia.click();
		LOG.info("Judiciary in India - Rule of Law clicked");
		
		WebElement element =JudiciaryinIndia_RuleofLaw.ClickSampleMaterial;
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);

		LOG.info("Sample Material clicked");
	}
	
	@Test
	public void  JudiciaryinIndia() throws InterruptedException {

		LOG.info("Judiciary in India - Rule of Law function running");
		JudiciaryinIndiafunction();
		LOG.info("Judiciary in India - Rule of Law function finished");
		
		driver.navigate().back();
	}
}
