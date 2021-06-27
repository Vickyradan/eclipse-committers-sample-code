package testCase_GeneralStudies_Mathematics;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_Mathematics.Material_AlphabeticalSeries;

public class Material_AlphabeticalSeries_TestCase extends CommonFunction {

	
	public void AlphabeticalSeriesFunction() {
		
		PageFactory.initElements(driver, Material_AlphabeticalSeries.class);
		
		Material_AlphabeticalSeries.AlphabeticalSeries.click();
		LOG.info("Alphabetical Series clicked");
		
		Material_AlphabeticalSeries.ClickSubscribe.click();
		LOG.info("Subscribe clicked");
		
	}
	@Test
	public void AlphabeticalSeries() {
		
		LOG.info("Alphabetical Series function running");
		AlphabeticalSeriesFunction();
		LOG.info("Alphabetical Series function finished");
		
		driver.navigate().back();
	}
	
}
