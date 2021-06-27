package testCase_GeneralStudies_Politics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_Politics.HumanRightsCharterUnitedNationsAssembly;
public class HumanRightsCharterUnitedNationsAssembly_TestCase extends CommonFunction{

	
	public  void HumanRightsCharterUnitedNationsAssemblyfunction() {
		
		PageFactory.initElements(driver, HumanRightsCharterUnitedNationsAssembly.class);
		HumanRightsCharterUnitedNationsAssembly.ClickHumanRightsCharterUnitedNationsAssembly.click();
		LOG.info("Human Rights Charter, United Nations Assembly clicked");
		
		WebElement element = HumanRightsCharterUnitedNationsAssembly.ClickSampleMaterial;
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		LOG.info("Sample Material clicked");
	}
	
	@Test
	public void HumanRightsCharterUnitedNationsAssembly() throws InterruptedException {

		LOG.info("Human Rights Charter, United Nations Assembly function running");
		HumanRightsCharterUnitedNationsAssemblyfunction();
		LOG.info("Human Rights Charter, United Nations Assembly function finished");
		
		driver.navigate().back();
	}
}
