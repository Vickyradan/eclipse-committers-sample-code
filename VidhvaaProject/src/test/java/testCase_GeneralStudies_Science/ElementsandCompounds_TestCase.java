package testCase_GeneralStudies_Science;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_Science.ElementsandCompounds;
public class ElementsandCompounds_TestCase extends CommonFunction{

	public void ElementsandCompoundsFunction() {
		
		PageFactory.initElements(driver, ElementsandCompounds.class);
		ElementsandCompounds.ClickElementsandCompounds.click();
		LOG.info("Elements and Compounds clicked");
		
		ElementsandCompounds.Subscribe.click();
		LOG.info("subscribe clicked");

	}
	
	@Test
	public void ElementsandCompounds() {
		
		LOG.info("Elements and Compounds function running");
		ElementsandCompoundsFunction();
		LOG.info("Elements and Compounds function finished");
		
		driver.navigate().back();
	}
}
