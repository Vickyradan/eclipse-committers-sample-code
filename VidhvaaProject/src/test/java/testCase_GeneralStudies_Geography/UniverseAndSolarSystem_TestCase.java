package testCase_GeneralStudies_Geography;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import commonFunctions.Login;
import objectDetails_GeneralStudies_Geography.UniverseAndSolarSystem;
public class UniverseAndSolarSystem_TestCase extends CommonFunction{

	
	public void LoginFunction(){
		PageFactory.initElements(driver, Login.class);

		Login.ClickLogin.click();
		Login.Moblie.sendKeys(property.getProperty("MobileNumber"));
		Login.email.sendKeys(property.getProperty("Email"));
		Login.Submit.click();
	
	}
	
	
	public void UniverseAndSolarSystemfunction() {
		
		PageFactory.initElements(driver, UniverseAndSolarSystem.class);
		UniverseAndSolarSystem.ClickGeneralStudies.click();
		LOG.info("General Studies clicked");
		UniverseAndSolarSystem.ClcikGeograpy.click();
		LOG.info("Geograpy clicked");
		UniverseAndSolarSystem.ClickUniverseAndSolarSystem.click();
		LOG.info("Universe And Solar System clicked");
		
		WebElement element = UniverseAndSolarSystem.ClickSampleMaterial;
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		LOG.info("Sample Material clicked");
	}
	
	
	@Test
	public void UniverseAndSolarSystem() throws InterruptedException {

		LoginFunction();
		LOG.info("Universe And Solar System function running");
		UniverseAndSolarSystemfunction();
		LOG.info("Universe And Solar System function finished");
		
		driver.navigate().back();

	}
}
