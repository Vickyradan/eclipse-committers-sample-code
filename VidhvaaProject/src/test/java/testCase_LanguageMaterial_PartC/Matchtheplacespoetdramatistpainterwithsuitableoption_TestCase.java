package testCase_LanguageMaterial_PartC;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_LanguageMaterial_PartC.Matchtheplacespoetdramatistpainterwithsuitableoption;

public class Matchtheplacespoetdramatistpainterwithsuitableoption_TestCase extends CommonFunction{

	
	public void Matchtheplacespoetdramatistpainterwithsuitableoptionfunction(){
		PageFactory.initElements(driver, Matchtheplacespoetdramatistpainterwithsuitableoption.class);
		Matchtheplacespoetdramatistpainterwithsuitableoption.ClickMatchtheplacespoetdramatistpainterwithsuitableoption.click();
		LOG.info("Match the places, poet, dramatist painter with suitable option clicked");
		
		WebElement element = Matchtheplacespoetdramatistpainterwithsuitableoption.ClickSampleMaterial;
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		LOG.info("Sample Material clicked");
		
	}
	
	
	@Test
	public void Matchtheplacespoetdramatistpainterwithsuitableoption()  {

		LOG.info("Match the places, poet, dramatist painter with suitable option function running");
		Matchtheplacespoetdramatistpainterwithsuitableoptionfunction();
		LOG.info("Match the places, poet, dramatist painter with suitable option function finished");
		
		driver.navigate().back();

	}
}
