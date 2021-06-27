package objectDetails_LanguageMaterial_PartB;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PracticeQuestion {

	
	@FindBy(xpath="//*[@id='hid3']/h3/a")
	public static WebElement ClickLanguageMaterial;
	
	@FindBy(xpath="//*[@id='tab-9']/div/div[1]/div[2]/div/div/div/div[2]/a")
	public static WebElement clickPracticeQuestion;
	
	@FindBy(xpath="//div[@id='fade-wrapper']/div/div/button[1]")
	public static WebElement Clickclosepopup;
}
