package objectDetails_GeneralStudies_Politics;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PracticeQuestion {

	
	@FindBy(xpath="//*[@id='hid2']")
	public static WebElement ClickGeneralStudies;
	
	@FindBy(xpath="//*[@id='tab-8']/div/div/div/div[5]/div[3]/a")
	public static WebElement clickPracticeQuestion;
	
	@FindBy(xpath="//div[@id='fade-wrapper']/div/div/button[1]")
	public static WebElement Clickclosepopup;
}
