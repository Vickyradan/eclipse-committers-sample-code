package objectDetails_BookbackQuestion;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Science_6th_Standard {

	@FindBy(xpath="//*[@id='hid6']/h3/a")
	public static WebElement BookBack;
	
	@FindBy(xpath="//*[@id='tab-12']/div/div/div/div[1]/div[2]/a")
	public static WebElement science;
	
	@FindBy(xpath="//div[@id='fade-wrapper']/div/div/button[1]")
	public static WebElement Clickclosepopup;
}
