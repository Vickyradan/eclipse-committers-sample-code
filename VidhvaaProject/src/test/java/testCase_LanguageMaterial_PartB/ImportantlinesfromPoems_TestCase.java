package testCase_LanguageMaterial_PartB;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_LanguageMaterial_PartB.ImportantlinesfromPoems;
public class ImportantlinesfromPoems_TestCase extends CommonFunction{

	public void ImportantlinesfromPoemsfunction() {
		
		PageFactory.initElements(driver, ImportantlinesfromPoems.class);
		
		ImportantlinesfromPoems.ClickImportantlinesfromPoems.click();
		LOG.info("Important lines from Poems clicked");
		
		WebElement element = ImportantlinesfromPoems.ClickSampleMaterial;
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		LOG.info("sample material clicked");
	}
	
	@Test
	public void ImportantlinesfromPoems()  {

		LOG.info("Important lines from Poems function running");
		ImportantlinesfromPoemsfunction();
		LOG.info("Important lines from Poems function finished");
		driver.navigate().back();

	}
}
