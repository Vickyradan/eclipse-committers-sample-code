package testCase_GeneralStudies_Science;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_Science.Human_Diseases_including_communicable_diseases_preventionandremedies;
public class Human_Diseases_including_communicable_diseases_preventionandremedies_TestCase extends CommonFunction {

	public void Human_Diseases_including_communicable_diseases_preventionandremediesFunction() {
		PageFactory.initElements(driver, Human_Diseases_including_communicable_diseases_preventionandremedies.class);
		Human_Diseases_including_communicable_diseases_preventionandremedies.
		                                 ClickHuman_Diseases_including_communicable_diseases_preventionandremedies.click();
		LOG.info("Human Diseases including communicable diseases prevention and remedies clicked");
		
		Human_Diseases_including_communicable_diseases_preventionandremedies.Subscribe.click();
		LOG.info("subscribe clicked");
		
	}



	@Test
	public void Human_Diseases_including_communicable_diseases_preventionandremedies() {

		LOG.info("Human Diseases including communicable diseases prevention and remedies function running");
		Human_Diseases_including_communicable_diseases_preventionandremediesFunction();
		LOG.info("Human Diseases including communicable diseases prevention and remedies function finished");
		
		driver.navigate().back();
	}
}
