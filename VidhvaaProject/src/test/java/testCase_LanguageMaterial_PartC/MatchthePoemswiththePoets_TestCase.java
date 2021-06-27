package testCase_LanguageMaterial_PartC;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import commonFunctions.Login;
import objectDetails_LanguageMaterial_PartC.MatchthePoemswiththePoets;

public class MatchthePoemswiththePoets_TestCase extends CommonFunction{

	
	public void LoginFunction(){
		LOG.info("LoginFunction Started");
		PageFactory.initElements(driver, Login.class);

		Login.ClickLogin.click();
		Login.Moblie.sendKeys(property.getProperty("MobileNumber"));
		Login.email.sendKeys(property.getProperty("Email"));
		Login.Submit.click();
		
		LOG.info("LoginFunction Closed");

	}
	
	public void MatchthePoemswiththePoetsfunction(){
		PageFactory.initElements(driver, MatchthePoemswiththePoets.class);
		MatchthePoemswiththePoets.ClickLanguageMaterial.click();
		LOG.info("Language Material clicked");
		MatchthePoemswiththePoets.ClickPartC.click();
		LOG.info("Part C clicked");
		MatchthePoemswiththePoets.ClickMatchthePoemswiththePoets.click();
		LOG.info("Match the Poems with the Poets  clicked");
		
		WebElement element = MatchthePoemswiththePoets.ClickSampleMaterial;
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		LOG.info("Sample Material clicked");
		
	}
	
	
	@Test
	public void MatchthePoemswiththePoets()  {

		LoginFunction();
		LOG.info("Match the Poems with the Poets function running");
		MatchthePoemswiththePoetsfunction();
		LOG.info("Match the Poems with the Poets function finished");
		
		driver.navigate().back();

	}
}
