package testCase_LanguageMaterial_PartA;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import commonFunctions.Login;
import objectDetails_LanguageMaterial_PartA.Preposition;

public class Preposition_TestCase extends CommonFunction{

	
	public void LoginFunction(){
		LOG.info("LoginFunction Started");
		PageFactory.initElements(driver, Login.class);

		Login.ClickLogin.click();
		Login.Moblie.sendKeys(property.getProperty("MobileNumber"));
		Login.email.sendKeys(property.getProperty("Email"));
		Login.Submit.click();
		
		LOG.info("LoginFunction Closed");

	}
	
	public void Prepositionfunction(){
		PageFactory.initElements(driver, Preposition.class);
		Preposition.ClickLanguageMaterial.click();
		LOG.info("LanguageMaterial clicked");
		Preposition.ClickPartA.click();
		LOG.info("Part A clicked");
		Preposition.ClickPreposition.click();
		LOG.info("Preposition clicked");
		
		WebElement element = Preposition.ClickSampleMaterial;
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		LOG.info("Sample Material clicked");
		
		Preposition.Clickdownload.click();
		LOG.info("download clicked");
	}
	
	
	@Test
	public void Preposition()  {

		LoginFunction();
		
		LOG.info("Preposition function running");
		Prepositionfunction();
		LOG.info("Preposition function finished");
		
		driver.navigate().back();
}
}