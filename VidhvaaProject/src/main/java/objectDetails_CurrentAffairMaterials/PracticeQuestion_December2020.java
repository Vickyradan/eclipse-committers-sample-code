package objectDetails_CurrentAffairMaterials;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PracticeQuestion_December2020 {

	@FindBy(xpath="//*[@id='hid4']/h3/a")
	public static WebElement ClickCurrtenAffair;
	
	@FindBy(xpath="//*[@id='tab-10']/div/div/div/div[2]/div[3]/a")
	public static WebElement Clickquestion;
	
	@FindBy(xpath="//*[@id='cookiesPopup']/button[1]")
	public static WebElement Clickclosepopup;
}
