package testCase_LanguageMaterial_PartC;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_LanguageMaterial_PartC.Matchthecharacterswithrelevantstorytitle;

public class Matchthecharacterswithrelevantstorytitle_TestCase extends CommonFunction{

	
	
	public void Matchthecharacterswithrelevantstorytitlefunction(){
		PageFactory.initElements(driver, Matchthecharacterswithrelevantstorytitle.class);
		Matchthecharacterswithrelevantstorytitle.ClickMatchthecharacterswithrelevantstorytitle.click();
		LOG.info("Match the characters with relevant story title clicked");
			
		WebElement element = Matchthecharacterswithrelevantstorytitle.ClickSampleMaterial;
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		LOG.info("Sample Material clicked");
		
	}
	
	
	@Test
	public void Matchthecharacterswithrelevantstorytitle()  {

		LOG.info("Match the characters with relevant story title function running");
		Matchthecharacterswithrelevantstorytitlefunction();
		LOG.info("Match the characters with relevant story title function finished");
		
		driver.navigate().back();

	}
}
