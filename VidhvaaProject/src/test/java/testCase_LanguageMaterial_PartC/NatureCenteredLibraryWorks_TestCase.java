package testCase_LanguageMaterial_PartC;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_LanguageMaterial_PartC.NatureCenteredLibraryWorks;

public class NatureCenteredLibraryWorks_TestCase extends CommonFunction{

	
	public void NatureCenteredLibraryWorksfunction(){
		PageFactory.initElements(driver, NatureCenteredLibraryWorks.class);
		NatureCenteredLibraryWorks.ClickNatureCenteredLibraryWorks.click();
		LOG.info("Nature Centered Library Works clicked");
		
		WebElement element = NatureCenteredLibraryWorks.ClickSampleMaterial;
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		LOG.info("Sample Material clicked");
		
	}
	
	
	@Test
	public void NatureCenteredLibraryWorks()  {

		LOG.info("Nature Centered Library Works function running");
		NatureCenteredLibraryWorksfunction();
		LOG.info("Nature Centered Library Works function finished");
		
		driver.navigate().back();

	}
}
