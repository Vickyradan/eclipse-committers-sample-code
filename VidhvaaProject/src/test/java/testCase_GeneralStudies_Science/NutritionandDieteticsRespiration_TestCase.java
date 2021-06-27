package testCase_GeneralStudies_Science;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_Science.NutritionandDieteticsRespiration;
public class NutritionandDieteticsRespiration_TestCase extends CommonFunction {

	public void NutritionandDieteticsRespirationFunction() {
		PageFactory.initElements(driver, NutritionandDieteticsRespiration.class);
		NutritionandDieteticsRespiration.ClickNutritionandDieteticsRespiration.click();
		LOG.info("Nutrition and Dietetics Respiration clicked");
		
		NutritionandDieteticsRespiration.Subscribe.click();
		LOG.info("subscribe clicked");
		
	}
	
	@Test
	public void NutritionandDieteticsRespiration() {
		
		LOG.info("Nutrition and Dietetics Respiration function running");
		NutritionandDieteticsRespirationFunction();
		LOG.info("Nutrition and Dietetics Respiration function finished");
		
		driver.navigate().back();
	}
		
}
