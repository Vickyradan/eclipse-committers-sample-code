package testCase_GeneralStudies_Economics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_Economics.RuralWelfareOrientedProgrammes;
public class RuralWelfareOrientedProgrammes_TestCase extends CommonFunction{

	public void RuralWelfareOrientedProgrammesfunction() {
		
		PageFactory.initElements(driver, RuralWelfareOrientedProgrammes.class);
		RuralWelfareOrientedProgrammes.ClickRuralWelfareOrientedProgrammes.click();
		LOG.info("Rural Welfare Oriented Programmes clicked");
		
		WebElement element = RuralWelfareOrientedProgrammes.ClickSampleMaterial;
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		LOG.info("Sample Material clicked");
	}
	
	
	@Test
	public void RuralWelfareOrientedProgrammes() throws InterruptedException {

		LOG.info("Rural Welfare Oriented Programmes function running");
		RuralWelfareOrientedProgrammesfunction();
		LOG.info("Rural Welfare Oriented Programmes function finished");
		
		driver.navigate().back();
	}
}
