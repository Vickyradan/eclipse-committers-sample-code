package testCase_LanguageMaterial_PartC;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_LanguageMaterial_PartC.WhoseAutobiographyandBiographyisthis;

public class WhoseAutobiographyandBiographyisthis_TestCase extends CommonFunction{

	
	public void WhoseAutobiographyandBiographyisthisfunction(){
		PageFactory.initElements(driver, WhoseAutobiographyandBiographyisthis.class);
		WhoseAutobiographyandBiographyisthis.ClickWhoseAutobiographyandBiographyisthis.click();
		LOG.info("Whose Auto biography and Biography is this? clicked");
		
		WebElement element = WhoseAutobiographyandBiographyisthis.ClickSampleMaterial;
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		LOG.info("Sample Material clicked");
	}
	
	
	@Test
	public void WhoseAutobiographyandBiographyisthis()  {

		LOG.info("Whose Auto biography and Biography is this? function running");
		WhoseAutobiographyandBiographyisthisfunction();
		LOG.info("Whose Auto biography and Biography is this? function finished");
		driver.navigate().back();

	}
}
