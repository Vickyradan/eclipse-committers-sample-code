package testCase_GeneralStudies_Geography;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_Geography.WeatherMonsoonRainfall;
public class WeatherMonsoonRainfall_TestCase extends CommonFunction{
	
	
	public void	 WeatherMonsoonRainfallfunction() {
		
		PageFactory.initElements(driver, WeatherMonsoonRainfall.class);
		WeatherMonsoonRainfall.ClickWeatherMonsoonRainfall.click();
		WebElement element = WeatherMonsoonRainfall.ClickSampleMaterial;
		LOG.info("Weather, Monsoon, Rainfall clicked");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		LOG.info("Sample Material clicked");
		
	}
	

	@Test
	public void WeatherMonsoonRainfall() {
		
		LOG.info("Weather, Monsoon, Rainfall function running");
		WeatherMonsoonRainfallfunction();
		LOG.info("Weather, Monsoon, Rainfall function finished");
		
		driver.navigate().back();

	}
	

}
