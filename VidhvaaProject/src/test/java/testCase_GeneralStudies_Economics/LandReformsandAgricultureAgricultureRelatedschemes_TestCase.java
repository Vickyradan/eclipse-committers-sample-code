package testCase_GeneralStudies_Economics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_Economics.LandReformsandAgricultureAgricultureRelatedschemes;
public class LandReformsandAgricultureAgricultureRelatedschemes_TestCase extends CommonFunction{

	
	public void LandReformsandAgricultureAgricultureRelatedschemesfunction() {
		PageFactory.initElements(driver, LandReformsandAgricultureAgricultureRelatedschemes.class);
		LandReformsandAgricultureAgricultureRelatedschemes.ClickLandReformsandAgricultureAgricultureRelatedschemes.click();
		WebElement element = LandReformsandAgricultureAgricultureRelatedschemes.ClickSampleMaterial;
		LOG.info("Land Reforms and Agriculture, Agriculture Related schemes clicked");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		LOG.info("Sample Material clicked");
	}

	@Test
	public void LandReformsandAgricultureAgricultureRelatedschemes() throws InterruptedException {

		LOG.info("Land Reforms and Agriculture, Agriculture Related schemes function running");
		LandReformsandAgricultureAgricultureRelatedschemesfunction();
		LOG.info("Land Reforms and Agriculture, Agriculture Related schemes function finished");
		
		driver.navigate().back();
	}
	
}
