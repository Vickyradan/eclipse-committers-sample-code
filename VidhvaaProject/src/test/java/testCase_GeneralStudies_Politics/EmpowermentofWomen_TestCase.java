package testCase_GeneralStudies_Politics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_Politics.EmpowermentofWomen;
public class EmpowermentofWomen_TestCase extends CommonFunction{

	public void EmpowermentofWomenfunction() {
		
		PageFactory.initElements(driver, EmpowermentofWomen.class);
		EmpowermentofWomen.ClickEmpowermentofWomen.click();
		LOG.info("Empowerment of Women clicked");
		WebElement element = EmpowermentofWomen.ClickSampleMaterial;
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		LOG.info("Sample Material clicked");
	}
	
	@Test
	public void  EmpowermentofWomen() throws InterruptedException {

		LOG.info("Empowerment of Women function running");
		EmpowermentofWomenfunction();
		LOG.info("Empowerment of Women function finished");
		
		driver.navigate().back();
	}
}
