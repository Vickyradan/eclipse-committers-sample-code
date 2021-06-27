package testCase_CurrentAffairMaterials;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_CurrentAffairMaterials.Material_December2020;

public class Material_December2020_TestCase extends CommonFunction{

	public void Material_December2020Function() {
		PageFactory.initElements(driver, Material_December2020.class);


		WebElement element1=Material_December2020.ClickMaterial;
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click()", element1);
		
		LOG.info("December2020 Material clicked");

		WebElement element=Material_December2020.Clickclosepopup;

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);

		LOG.info("Subscription Popup Closed");
	}


	@Test
	public void December2020_Material() throws InterruptedException {
		LOG.info("December2020 Material function running");
		Material_December2020Function();
		LOG.info("December2020 Material function finished");

	}
}
