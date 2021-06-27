package testCase_GeneralStudies_Economics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import commonFunctions.Login;
import objectDetails_GeneralStudies_Economics.NatureofIndianEconomy;
public class NatureofIndianEconomy_TestCase extends CommonFunction{

	public void LoginFunction(){
		
		PageFactory.initElements(driver, Login.class);

		Login.ClickLogin.click();
		Login.Moblie.sendKeys(property.getProperty("MobileNumber"));
		Login.email.sendKeys(property.getProperty("Email"));
		Login.Submit.click();
		
	}

	public void NatureofIndianEconomyFunction() {
		
		PageFactory.initElements(driver, NatureofIndianEconomy.class);
		NatureofIndianEconomy.ClickGeneralStudies.click();
		LOG.info("General Studies clicked");
		NatureofIndianEconomy.ClcikEconomics.click();
		LOG.info("Economics clicked");
		NatureofIndianEconomy.ClickNatureofIndianEconomy.click();
		LOG.info("Nature of Indian Economy clicked");
		WebElement element =NatureofIndianEconomy.ClickSampleMaterial;
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		LOG.info("Sample Material clicked");
	}
	
	
	@Test
	public void NatureofIndianEconomy() throws InterruptedException {

		LoginFunction();
		LOG.info("Nature of Indian Economy function running");
		NatureofIndianEconomyFunction();
		LOG.info("Nature of Indian Economy function finished");
		
		driver.navigate().back();


	}
	
}
