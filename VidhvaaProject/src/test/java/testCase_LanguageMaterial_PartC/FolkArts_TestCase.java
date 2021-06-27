package testCase_LanguageMaterial_PartC;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_LanguageMaterial_PartC.FolkArts;

public class FolkArts_TestCase extends CommonFunction{

	
	public void FolkArtsfunction(){
		PageFactory.initElements(driver, FolkArts.class);
		FolkArts.ClickFolkArts.click();
		LOG.info("Folk Arts clicked");
		
		WebElement element = FolkArts.ClickSampleMaterial;
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		LOG.info("Sample Material clicked");
		
	}
	
	
	@Test
	public void FolkArts()  {

		LOG.info("Folk Arts function running");
		FolkArtsfunction();
		LOG.info("Folk Arts function finished");
		
		driver.navigate().back();

	}
}
