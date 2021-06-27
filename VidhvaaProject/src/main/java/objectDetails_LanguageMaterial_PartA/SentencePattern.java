package objectDetails_LanguageMaterial_PartA;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SentencePattern {

	
	@FindBy(xpath="//*[@id='why-us']/div/div/div[11]/div/div/div[1]/a/button")
	public static WebElement ClickSentencePattern;
	
	@FindBy(xpath="//div[@id='fade-wrapper']/div/div/button[3]")
	public static WebElement ClickSampleMaterial;
}
