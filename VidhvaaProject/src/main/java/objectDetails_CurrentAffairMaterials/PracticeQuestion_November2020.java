package objectDetails_CurrentAffairMaterials;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PracticeQuestion_November2020 {

	@FindBy(xpath="//*[@id='hid4']/h3/a")
	public static WebElement ClickCurrtenAffair;
	
	@FindBy(xpath="//*[@id='tab-10']/div/div/div/div[1]/div[3]/a")
	public static WebElement Clickquestion;//*[@id="tab-10"]/div/div/div/div[1]/div[3]/a
	
	@FindBy(xpath="//*[@id='cookiesPopup']/button[1]")
	public static WebElement Clickclosepopup;
}
