package testCase_GeneralStudies_Mathematics;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_Mathematics.Material_RatioandProportion;

public class Material_RatioandProportion_TestCase extends CommonFunction {

	public void RatioandProportionFunction() {

		PageFactory.initElements(driver, Material_RatioandProportion.class);
		Material_RatioandProportion.RatioandProportion.click();
		LOG.info("Ratio and Proportion clicked");
		
		Material_RatioandProportion.ClickSubscribe.click();
		LOG.info("Subscribe clicked");
	}

	@Test
	public void RatioandProportion() {

		LOG.info("Ratio and Proportion function running");
		RatioandProportionFunction();
		
		LOG.info("Ratio and Proportion function finished");
		driver.navigate().back();
	}
}
