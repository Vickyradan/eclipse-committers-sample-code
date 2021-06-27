package testCase_GeneralStudies_Mathematics;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_Mathematics.Material_Numberseries;

public class Material_Numberseries_TestCase extends CommonFunction{

	
	public void NumberseriesFunction() {
		PageFactory.initElements(driver, Material_Numberseries.class);
		Material_Numberseries.Numberseries.click();
		LOG.info("Number series clicked");
		
		Material_Numberseries.ClickSubscribe.click();
		LOG.info("Subscribe clicked");
		
	}
	@Test
	public void Numberseries() {
		
		LOG.info("Number series function running");
		NumberseriesFunction();
		LOG.info("Number series function finished");
		
		driver.navigate().back();
		
	}
}
