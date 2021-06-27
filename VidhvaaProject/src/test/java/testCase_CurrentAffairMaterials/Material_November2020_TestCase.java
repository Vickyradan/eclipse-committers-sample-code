package testCase_CurrentAffairMaterials;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import commonFunctions.Login;
import objectDetails_CurrentAffairMaterials.Material_November2020;

public class Material_November2020_TestCase extends CommonFunction{


	public void LoginFunction(){

		PageFactory.initElements(driver, Login.class);

		Login.ClickLogin.click();
		Login.Moblie.sendKeys(property.getProperty("MobileNumber"));
		Login.email.sendKeys(property.getProperty("Email"));
		Login.Submit.click();

	}

	public void MaterialFunction() throws InterruptedException {
		PageFactory.initElements(driver, Material_November2020.class);
		Material_November2020.ClickCurrtenAffair.click();
		LOG.info("Current Affair clicked");
		Material_November2020.ClickMaterial.click();
		LOG.info("November2020 Material clicked");
		
		WebElement element=Material_November2020.Clickclosepopup;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		
		LOG.info("Subscription Popup Closed");
		
	}
	
	
	@Test
	public void Novermber2020_Material() throws InterruptedException {
		LoginFunction();
		LOG.info("November2020 Material function running");
		MaterialFunction();
		LOG.info("November2020 Material function finished");
		
	}
	

}
