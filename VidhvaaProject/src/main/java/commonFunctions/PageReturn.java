package commonFunctions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageReturn {
	
	@FindBy(xpath="/html/body/nav/div/a/img")
	public static WebElement CliclLogo;
	
	
	@FindBy(xpath="//*[@id='cr_tnpsc']/div/label")
	public static WebElement ClickTNPSC;

}
