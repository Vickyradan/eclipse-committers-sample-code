package testCase_GeneralStudies_Science;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_Science.NationalScientificLaboratories;
public class NationalScientificLaboratories_TestCase extends CommonFunction {

	private void NationalScientificLaboratoriesFunction() {
		
		PageFactory.initElements(driver, NationalScientificLaboratories.class);
		NationalScientificLaboratories.nationalscientificLaboratories.click();
		LOG.info("National Scientific Laboratories clicked");
		
		NationalScientificLaboratories.Subscribe.click();
		LOG.info("subscribe clicked");
		
	}
	
	
	@Test
	public void NationalScientificLaboratories() {
		
		LOG.info("National Scientific Laboratories function running");
		NationalScientificLaboratoriesFunction();
		LOG.info("National Scientific Laboratories function finished");
		
		driver.navigate().back();
	}
}
