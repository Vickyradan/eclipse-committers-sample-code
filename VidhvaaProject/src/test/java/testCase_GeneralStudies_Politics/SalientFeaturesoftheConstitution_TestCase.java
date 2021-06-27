package testCase_GeneralStudies_Politics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_Politics.SalientFeaturesoftheConstitution;
public class SalientFeaturesoftheConstitution_TestCase extends CommonFunction{

	
	public void SalientFeaturesoftheConstitutionfunction() {
		
		PageFactory.initElements(driver, SalientFeaturesoftheConstitution.class);
		SalientFeaturesoftheConstitution.ClickSalientFeaturesoftheConstitution.click();
		LOG.info("Salient Features of the Constitution clicked");
		
		WebElement element =SalientFeaturesoftheConstitution.ClickSalientFeaturesoftheConstitution;
	
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);			
		LOG.info("Sample Material clicked");
	
	}
	
	@Test
	public void SalientFeaturesoftheConstitution() throws InterruptedException {

		LOG.info("Salient Features of the Constitution function running");
		SalientFeaturesoftheConstitutionfunction();
		LOG.info("Salient Features of the Constitution function finished");
		driver.navigate().back();

	}
}
