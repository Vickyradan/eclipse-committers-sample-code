package objectDetails_GeneralStudies_History;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdventofEuropeans {

	
	@FindBy(xpath="//*[@id='why-us']/div/div/div[18]/div/div/div[1]/a/button")
	public static WebElement clickAdventofEuropeans;
	
	
	@FindBy(xpath="//div[@id='cookiesPopup']/child::button[2]")
	public static WebElement ClickSubscribe;
}
