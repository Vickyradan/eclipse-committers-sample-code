package testCase_LanguageMaterial_PartB;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_LanguageMaterial_PartB.KarlPaulnacks;
public class KarlPaulnacks_TestCase extends CommonFunction{

	public void  KarlPaulnacksfunction() {
		
		PageFactory.initElements(driver, KarlPaulnacks.class);
		KarlPaulnacks.ClickKarlPaulnacks.click();
		LOG.info("Dr.KarlPaulnack's clicked");
		
		WebElement element =KarlPaulnacks.ClickSampleMaterial;
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		LOG.info("sample material clicked");
	}
	
	@Test
	public void  KarlPaulnacks()  {

		LOG.info("Dr.KarlPaulnack's function running");
		KarlPaulnacksfunction();
		LOG.info("Dr.KarlPaulnack's function finished");
		driver.navigate().back();
	}
}
