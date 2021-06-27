package testCase_LanguageMaterial_PartC;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_LanguageMaterial_PartC.Matchtheauthorrelevanttitlecharacter;

public class Matchtheauthorrelevanttitlecharacter_TestCase extends CommonFunction{

	
	public void Matchtheauthorrelevanttitlecharacterfunction(){
		PageFactory.initElements(driver, Matchtheauthorrelevanttitlecharacter.class);
		Matchtheauthorrelevanttitlecharacter.ClickMatchtheauthorrelevanttitlecharacter.click();
		LOG.info("Match the author relevant title character clicked");
		
		WebElement element = Matchtheauthorrelevanttitlecharacter.ClickSampleMaterial;
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		LOG.info("Sample Material clicked");
		
	}
	
	
	@Test
	public void Matchtheauthorrelevanttitlecharacter()  {

		LOG.info("Match the author relevant title character function running");
		Matchtheauthorrelevanttitlecharacterfunction();
		LOG.info("Match the author relevant title character function finished");
		
		driver.navigate().back();

	}
}
