package objectDetails_VidhvaasModelQuestions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ModelQuestions_1 {
	
	@FindBy(xpath="//*[@id='hid5']/h3/a")
	public static WebElement VidhvaaModelQuestion;
	
	@FindBy(xpath="//*[@id='tab-11']/div/div/div/div[1]/div[2]/a")
	public static WebElement question1;
	
	@FindBy(xpath="//*[@id='cookiesPopup']/button[1]")
	public static WebElement Clickclosepopup;

}
