package testCase_GeneralStudies_Politics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import  objectDetails_GeneralStudies_Politics.UnionLegislatureandParliament;
public class UnionLegislatureandParliament_TestCase extends CommonFunction{

	public void UnionLegislatureandParliamentfunction() {
		
		PageFactory.initElements(driver, UnionLegislatureandParliament.class);
		UnionLegislatureandParliament.ClickUnionLegislatureandParliament.click();
		LOG.info("Union Legislature and Parliament clicked");
		WebElement element = UnionLegislatureandParliament.ClickSampleMaterial;
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		LOG.info("Sample Material clicked");
	}
	
	@Test
	public void UnionLegislatureandParliament() throws InterruptedException {

		LOG.info("Union Legislature and Parliament function running");
		UnionLegislatureandParliamentfunction();
		LOG.info("Union Legislature and Parliament function finished");
		
		driver.navigate().back();
	}
}
