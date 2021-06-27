package testCase_GeneralStudies_Geography;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import  objectDetails_GeneralStudies_Geography.PopulationDensityandDistribution;
public class PopulationDensityandDistribution_TestCase extends CommonFunction{

	public void PopulationDensityandDistributionfunction() {
		
		PageFactory.initElements(driver, PopulationDensityandDistribution.class);
		PopulationDensityandDistribution.ClickPopulationDensityandDistribution.click();
		LOG.info("Population Density and Distribution clicked");
		
		WebElement element = PopulationDensityandDistribution.ClickSampleMaterial;
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		LOG.info("Sample Material clicked");
	}
	
	@Test
	public void PopulationDensityandDistribution() {
		
		LOG.info("Population Density and Distribution function running");
		PopulationDensityandDistributionfunction();
		LOG.info("Population Density and Distribution function finished");
		
		driver.navigate().back();

	}
}
