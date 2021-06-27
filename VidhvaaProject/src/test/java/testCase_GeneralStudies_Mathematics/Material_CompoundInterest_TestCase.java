package testCase_GeneralStudies_Mathematics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import commonFunctions.Login;
import objectDetails_GeneralStudies_Mathematics.Material_CompoundInterest;

public class Material_CompoundInterest_TestCase extends CommonFunction {


	public void LoginFunction(){

		PageFactory.initElements(driver, Login.class);

		Login.ClickLogin.click();
		Login.Moblie.sendKeys(property.getProperty("MobileNumber"));
		Login.email.sendKeys(property.getProperty("Email"));
		Login.Submit.click();

	}



	public void Material_CompoundInterest() throws InterruptedException {
		PageFactory.initElements(driver, Material_CompoundInterest.class);

		Material_CompoundInterest.ClickGeneralStudies.click();
		LOG.info("General Studies clicked");
		Material_CompoundInterest.ClickMathematics_Mateials.click();
		LOG.info("Mathematics clicked");
		Material_CompoundInterest.Clickmaterial_CompoundInterest.click();
		LOG.info("Compound Interest clicked");

		WebElement element = Material_CompoundInterest.ClickSubscribe;
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()", element); 
		LOG.info("Subscribe clicked");

	}

	@Test
	public void CompoundInterest() throws InterruptedException {

		LoginFunction();
		LOG.info("Compound Interest function running");
		Material_CompoundInterest();
		LOG.info("Compound Interest function finished");
		driver.navigate().back();


	}



}
