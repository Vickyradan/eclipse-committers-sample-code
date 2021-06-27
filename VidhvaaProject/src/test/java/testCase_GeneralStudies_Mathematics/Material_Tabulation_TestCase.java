package testCase_GeneralStudies_Mathematics;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_Mathematics.Material_Tabulation;

public class Material_Tabulation_TestCase extends CommonFunction {

	
	
	public void TabulationFunction() {
		
		PageFactory.initElements(driver, Material_Tabulation.class);
		Material_Tabulation.Tabulation.click();
		LOG.info("Tabulation clicked");
		
		Material_Tabulation.ClickSubscribe.click();
		LOG.info("Subscribe clicked");
	}
	
	@Test
	public void Tabulation() {

		LOG.info("Tabulation function running");
		TabulationFunction();
		LOG.info("Tabulation function finished");
		driver.navigate().back();
	}
}
