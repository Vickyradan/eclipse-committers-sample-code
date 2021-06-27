package testCase_LanguageMaterial_PartC;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_LanguageMaterial_PartC.Whichnationalitythepoetbelongsto;

public class Whichnationalitythepoetbelongsto_TestCase extends CommonFunction{

	
	public void Whichnationalitythepoetbelongstofunction(){
		PageFactory.initElements(driver, Whichnationalitythepoetbelongsto.class);
		Whichnationalitythepoetbelongsto.ClickWhichnationalitythepoetbelongsto.click();
		LOG.info("Which nationality the poet belongs to? clicked");
		
		WebElement element = Whichnationalitythepoetbelongsto.ClickSampleMaterial;
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		LOG.info("Sample Material clicked");
		
	}
	
	
	@Test
	public void Whichnationalitythepoetbelongsto()  {

		LOG.info("Which nationality the poet belongs to? function running");
		Whichnationalitythepoetbelongstofunction();
		LOG.info("Which nationality the poet belongs to? function finished");
		
		driver.navigate().back();

	}
}
