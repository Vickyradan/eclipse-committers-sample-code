package objectDetails_LanguageMaterial_PartA;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Preposition {

	@FindBy(xpath="//*[@id='hid3']/h3/a")
	public static WebElement ClickLanguageMaterial;
	
	@FindBy(xpath="//div[@id='tab-9']/div/div/div/div[1]/div[2]/a/button[1]")
	public static WebElement ClickPartA;
	
	@FindBy(xpath="//*[@id='why-us']/div/div/div[1]/div/div/div[1]/a/button")
	public static WebElement ClickPreposition;
	
	@FindBy(xpath="//div[@id='fade-wrapper']/div/div/button[3]")
	public static WebElement ClickSampleMaterial;
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div[1]/a")
	public static WebElement Clickdownload;
}
