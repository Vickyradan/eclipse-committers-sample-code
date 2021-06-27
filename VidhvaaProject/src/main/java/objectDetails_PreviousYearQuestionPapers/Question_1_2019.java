package objectDetails_PreviousYearQuestionPapers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Question_1_2019 {

	@FindBy(xpath="//*[@id='hid7']/h3/a")
	public static WebElement PreviousYearQuestionPapers;
	
	@FindBy(xpath="//*[@id='tab-13']/div/div/div/div[2]/div[2]/a")
	public static WebElement question1;
	
	@FindBy(xpath="//*[@id='cookiesPopup']/button[1]")
	public static WebElement Clickclosepopup;

}
