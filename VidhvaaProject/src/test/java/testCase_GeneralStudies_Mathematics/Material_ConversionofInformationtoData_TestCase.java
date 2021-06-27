package testCase_GeneralStudies_Mathematics;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_Mathematics.Material_ConversionofInformationtoData;

public class Material_ConversionofInformationtoData_TestCase extends CommonFunction {

	public void ConversionofInformationtoDataFunction() {
		
		PageFactory.initElements(driver, Material_ConversionofInformationtoData.class);
		Material_ConversionofInformationtoData.ConversionofInformationtoData.click();
		LOG.info("Conversion of Information to Data clicked");
		
		Material_ConversionofInformationtoData.ClickSubscribe.click();
		LOG.info("Subscribe clicked");
		
	}
	
	@Test
	public void ConversionofInformationtoData() {

		LOG.info("Conversion of Information to Data function running");
		ConversionofInformationtoDataFunction();
		LOG.info("Conversion of Information to Data function finished");
		
		driver.navigate().back();
	}
}
