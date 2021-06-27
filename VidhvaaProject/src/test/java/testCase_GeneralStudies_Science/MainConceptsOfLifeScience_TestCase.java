package testCase_GeneralStudies_Science;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_Science.MainConceptsOfLifeScience;
public class MainConceptsOfLifeScience_TestCase extends CommonFunction {

	public void MainConceptsOfLifeScienceFunction() {
		PageFactory.initElements(driver, MainConceptsOfLifeScience.class);
		MainConceptsOfLifeScience.ClickMainConceptsOfLifeScience.click();
		LOG.info("Main Concepts Of Life Science clicked");
		
		MainConceptsOfLifeScience.Subscribe.click();
		LOG.info("subscribe clicked");
	}
	
	@Test
	public void MainConceptsOfLifeScience() {
		
		LOG.info("Main Concepts Of Life Science function running");
		MainConceptsOfLifeScienceFunction();
		LOG.info("Main Concepts Of Life Science function finished");
		
		driver.navigate().back();
		
	}
}
