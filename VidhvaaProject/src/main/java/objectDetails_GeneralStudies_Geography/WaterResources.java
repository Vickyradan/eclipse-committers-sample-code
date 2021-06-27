package objectDetails_GeneralStudies_Geography;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WaterResources {

	
	@FindBy(xpath="//*[@id='why-us']/div/div/div[3]/div/div/div[1]/a/button")
	public static WebElement ClickWaterResources;
	
	@FindBy(xpath="//div[@id='fade-wrapper']/div/div/button[3]")
	public static WebElement ClickSampleMaterial;
}
