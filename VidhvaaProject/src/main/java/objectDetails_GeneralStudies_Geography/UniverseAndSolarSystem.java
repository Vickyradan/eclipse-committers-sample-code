package objectDetails_GeneralStudies_Geography;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UniverseAndSolarSystem {

	
	@FindBy(xpath="//*[@id='hid2']")
	public static WebElement ClickGeneralStudies;
	
	@FindBy(xpath="//button[@id='myBtn']/following::button[3]")
	public static WebElement ClcikGeograpy;
	
	@FindBy(xpath="//*[@id='why-us']/div/div/div[1]/div/div/div[1]/a/button")
	public static WebElement ClickUniverseAndSolarSystem;
	
	@FindBy(xpath="//div[@id='fade-wrapper']/div/div/button[3]")
	public static WebElement ClickSampleMaterial;
}
