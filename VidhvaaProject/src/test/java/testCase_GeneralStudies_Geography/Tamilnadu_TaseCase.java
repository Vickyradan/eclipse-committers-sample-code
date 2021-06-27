package testCase_GeneralStudies_Geography;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_Geography.Tamilnadu;
public class Tamilnadu_TaseCase extends CommonFunction{

	public void Tamilnadufunction() {
		PageFactory.initElements(driver, Tamilnadu.class);
		Tamilnadu.ClickTamilnadu.click();
		LOG.info("Tamilnadu clicked");
		
		WebElement element =Tamilnadu.ClickSampleMaterial;
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		LOG.info("Sample Material clicked");
	}
	
	@Test
	public void Tamilnadu() {
		
		LOG.info("Tamilnadu function running");
		Tamilnadufunction();
		LOG.info("Tamilnadu function finished");
		
		driver.navigate().back();

	}
}
