package testCase_CurrentAffairMaterials;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_CurrentAffairMaterials.Material_January2021;
public class Material_January2021_TestCase extends CommonFunction{

	
	public void Material_January2021Function() {
		PageFactory.initElements(driver, Material_January2021.class);
		
		WebElement element1=Material_January2021.ClickMaterial;
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click()", element1);
		
		LOG.info("January2021 Material clicked");
		
		WebElement element=Material_January2021.Clickclosepopup;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		
		LOG.info("Subscription Popup Closed");
	}
	

	@Test
	public void Material_January2021() throws InterruptedException {
		
		LOG.info("January2021 Material function running");
		Material_January2021Function();
		LOG.info("January2021 Material function finished");
		
	}
}
