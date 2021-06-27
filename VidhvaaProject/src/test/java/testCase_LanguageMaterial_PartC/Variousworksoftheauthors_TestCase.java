package testCase_LanguageMaterial_PartC;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_LanguageMaterial_PartC.Variousworksoftheauthors;

public class Variousworksoftheauthors_TestCase extends CommonFunction{

	
	public void Variousworksoftheauthorsfunction(){
		PageFactory.initElements(driver, Variousworksoftheauthors.class);
		Variousworksoftheauthors.ClickVariousworksoftheauthors.click();
		LOG.info("Various works of the authors clicked");
		
		WebElement element = Variousworksoftheauthors.ClickSampleMaterial;
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		LOG.info("Sample Material clicked");
		
	}
	
	
	@Test
	public void Mentionthepoeminwhichtheselinesoccur()  {

		LOG.info("Various works of the authors function running");
		Variousworksoftheauthorsfunction();
		LOG.info("Various works of the authors function finished");
		
		driver.navigate().back();

	}
}
