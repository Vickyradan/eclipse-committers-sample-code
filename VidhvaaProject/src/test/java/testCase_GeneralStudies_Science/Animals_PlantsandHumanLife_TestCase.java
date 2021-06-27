package testCase_GeneralStudies_Science;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import commonFunctions.PageReturn;
import objectDetails_GeneralStudies_Science.Animals_PlantsandHumanLife;
public class Animals_PlantsandHumanLife_TestCase extends CommonFunction {

	public void Animals_PlantsandHumanLifeFunction() {
		PageFactory.initElements(driver, Animals_PlantsandHumanLife.class);
		Animals_PlantsandHumanLife.ClickAnimals_PlantsandHumanLife.click();
		LOG.info("Animals, Plants and human Life clicked");
		
		Animals_PlantsandHumanLife.Subscribe.click();
		LOG.info("subscribe clicked");
		
	}
	
	
	public void PageBack() throws InterruptedException {
		PageFactory.initElements(driver, PageReturn.class);
		PageReturn.CliclLogo.click();
		Thread.sleep(3000);
		PageReturn.ClickTNPSC.click();
	}
	
	
	@Test
	public void Animals_PlantsandHumanLife() throws InterruptedException {
		
		LOG.info("Animals, Plants and human Life function running");
		Animals_PlantsandHumanLifeFunction();
		LOG.info("Animals, Plants and human Life function finished");
		driver.navigate().back();
		PageBack();
	}
}
