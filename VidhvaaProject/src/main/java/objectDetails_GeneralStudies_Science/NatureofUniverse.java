package objectDetails_GeneralStudies_Science;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NatureofUniverse {
	
	
	@FindBy(xpath="//*[@id='hid2']")
	public static WebElement ClickGeneralStudies;

	@FindBy(xpath="//button[@id='myBtn']/following::button[1]")
	public static WebElement Material;
	
	@FindBy(xpath="//*[@id='why-us']/div/div/div[1]/div/div/div[1]/a/button")
	public static WebElement Natureofuniverse;
	
	@FindBy(xpath="//div[@id='cookiesPopup']/child::button[2]")
	public static WebElement viewsample;
}
