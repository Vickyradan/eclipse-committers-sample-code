package testCase_GeneralStudies_Science;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import objectDetails_GeneralStudies_Science.Mechanics_PropertiesofMatter_PhysicalQuantities_StandardsandUnit;
import commonFunctions.CommonFunction;

public class Mechanics_PropertiesofMatter_PhysicalQuantities_StandardsandUnit_TestCase extends CommonFunction{

	public void Mechanics_PropertiesofMatter_PhysicalQuantities_StandardsandUnitFunction() {
		
		PageFactory.initElements(driver, Mechanics_PropertiesofMatter_PhysicalQuantities_StandardsandUnit.class);
		Mechanics_PropertiesofMatter_PhysicalQuantities_StandardsandUnit.
		                                            Mechanics_PropertiesofMatter_PhysicalQuantities_StandardsandUnit.click();
		LOG.info("MECHANICS PROPERTIES OF MATTER - PHYSICAL QUANTITIES ,STANDRADS AND UNITS clicked");
		
		Mechanics_PropertiesofMatter_PhysicalQuantities_StandardsandUnit.Subscribe.click();
		LOG.info("subscribe clicked");
		
	}

	@Test
	public void Mechanics_PropertiesofMatter_PhysicalQuantities_StandardsandUnit() {
		
		LOG.info("MECHANICS PROPERTIES OF MATTER - PHYSICAL QUANTITIES ,STANDRADS AND UNITS function running");
		Mechanics_PropertiesofMatter_PhysicalQuantities_StandardsandUnitFunction();
		LOG.info("MECHANICS PROPERTIES OF MATTER - PHYSICAL QUANTITIES ,STANDRADS AND UNITS function finished");
		
		driver.navigate().back();
	}

}
