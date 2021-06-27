package objectDetails_GeneralStudies_Geography;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Earth {

	@FindBy(xpath="//*[@id='why-us']/div/div/div[10]/div/div/div[1]/a/button")
	public static WebElement ClickEarth;
	
	@FindBy(xpath="//div[@id='fade-wrapper']/div/div/button[3]")
	public static WebElement ClickSampleMaterial;
}
