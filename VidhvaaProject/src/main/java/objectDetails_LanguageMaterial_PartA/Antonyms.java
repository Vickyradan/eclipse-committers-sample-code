package objectDetails_LanguageMaterial_PartA;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Antonyms {

	
	@FindBy(xpath="//*[@id='why-us']/div/div/div[4]/div/div/div[1]/a/button")
	public static WebElement ClickAntonyms;
	
	@FindBy(xpath="//div[@id='fade-wrapper']/div/div/button[3]")
	public static WebElement ClickSampleMaterial;
}
