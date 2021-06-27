package testCase_GeneralStudies_History;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_History.NorthIndianKingdoms;
public class NorthIndianKingdoms_TestCase extends CommonFunction{

	public void NorthIndianKingdomsFunction() {
		
		PageFactory.initElements(driver, NorthIndianKingdoms.class);
		NorthIndianKingdoms.clickNorthIndianKingdoms.click();
		LOG.info("North Indian Kingdoms clicked");
		
		NorthIndianKingdoms.ClickSubscribe.click();
		LOG.info("Subscribe clicked");
	}
	
	
	@Test(priority=11)
	public void NorthIndianKingdoms(){
		
		LOG.info("North Indian Kingdoms function running");
		NorthIndianKingdomsFunction();
		LOG.info("North Indian Kingdoms function finished");
		
		driver.navigate().back();
	}
	
}
