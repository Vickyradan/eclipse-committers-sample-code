package testCase_GeneralStudies_Science;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_Science.ClassificationoflivingOrganism;
public class ClassificationoflivingOrganism_TestCase extends CommonFunction {

	public void ClassificationoflivingOrganismFunction() {
		PageFactory.initElements(driver, ClassificationoflivingOrganism.class);
		ClassificationoflivingOrganism.ClickClassificationoflivingOrganism.click();
		LOG.info("Classification of living Organism clicked");
		
		ClassificationoflivingOrganism.Subscribe.click();
		LOG.info("subscribe clicked");
		
	}
	
	
	@Test
	public void ClassificationoflivingOrganism() {
		
		LOG.info("Classification of living Organism function running");
		ClassificationoflivingOrganismFunction();
		LOG.info("Classification of living Organism function finished");
		
		driver.navigate().back();
		
	}
}
