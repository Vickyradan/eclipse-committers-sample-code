package objectDetails_GeneralStudies_Politics;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Citizenship {

	
	@FindBy(xpath="//*[@id='why-us']/div/div/div[5]/div/div/div[1]/a/button")
	public static WebElement ClickCitizenship;
	
	@FindBy(xpath="//div[@id='fade-wrapper']/div/div/button[3]")
	public static WebElement ClickSampleMaterial;
}
