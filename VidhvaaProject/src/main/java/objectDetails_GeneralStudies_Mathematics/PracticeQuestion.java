package objectDetails_GeneralStudies_Mathematics;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PracticeQuestion {
	
	@FindBy(xpath="//*[@id='hid2']")
	public static WebElement ClickGeneralStudies;
	
	@FindBy(xpath="//*[@id='tab-8']/div/div/div/div[1]/div[3]/a")
	public static WebElement practicequestions;
	
	@FindBy(xpath="//*[@id='cookiesPopup']/button[2]")
	public static WebElement ClickSubscribe;

}
