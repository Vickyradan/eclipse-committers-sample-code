package testCase_GeneralStudies_Mathematics;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_Mathematics.Material_Percentage;

public class Material_Percentage_TestCase extends CommonFunction{

	public void PercentageFunction() {
		PageFactory.initElements(driver,Material_Percentage.class);
		Material_Percentage.Percentage.click();
		LOG.info("Percentage clicked");
		
		Material_Percentage.ClickSubscribe.click();
		LOG.info("Subscribe clicked");
		
	}
	@Test
	public void Percentage() {
		
		LOG.info("Percentage function running");
		PercentageFunction();
		LOG.info("Percentage function finished");
		
		driver.navigate().back();
	}
}
