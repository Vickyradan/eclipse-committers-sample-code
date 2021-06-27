package testCase_GeneralStudies_Mathematics;



import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_Mathematics.Material_Simplifications;

public class Material_Simplifications_TestCase extends CommonFunction {
	
	
	
	public void SimplificationsFunction(){
		PageFactory.initElements(driver, Material_Simplifications.class);
		Material_Simplifications.ClickSimplification.click();
		LOG.info("Simplifications clicked");
		
		Material_Simplifications.ClickSubscribe.click();
		LOG.info("Subscribe clicked");
	}
	
	@Test
	public void Simplifications() {
		
		LOG.info("Simplifications function running");
		SimplificationsFunction();
		LOG.info("Simplifications function finished");
		driver.navigate().back();
	}
}
