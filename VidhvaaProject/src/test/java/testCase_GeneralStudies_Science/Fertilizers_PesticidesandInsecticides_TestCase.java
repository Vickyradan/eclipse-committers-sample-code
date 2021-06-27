package testCase_GeneralStudies_Science;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_Science.Fertilizers_PesticidesandInsecticides;
public class Fertilizers_PesticidesandInsecticides_TestCase extends CommonFunction{

	public void Fertilizers_PesticidesandInsecticidesFunction() {
		PageFactory.initElements(driver, Fertilizers_PesticidesandInsecticides.class);
		Fertilizers_PesticidesandInsecticides.ClickFertilizers_PesticidesandInsecticides.click();
		LOG.info("Fertilizers, Pesticides and Insecticides clicked");
		
		Fertilizers_PesticidesandInsecticides.Subscribe.click();
		LOG.info("subscribe clicked");
	}
	
	@Test
	public void Fertilizers_PesticidesandInsecticides() {
		
		LOG.info("Fertilizers, Pesticides and Insecticides function running");
		Fertilizers_PesticidesandInsecticidesFunction();
		LOG.info("Fertilizers, Pesticides and Insecticides function finished");
		
		driver.navigate().back();
	}
}
