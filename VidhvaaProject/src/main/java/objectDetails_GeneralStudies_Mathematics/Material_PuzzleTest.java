package objectDetails_GeneralStudies_Mathematics;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Material_PuzzleTest {

	
	@FindBy(xpath="//*[@id='why-us']/div/div/div[12]/div/div/div[1]/a/button")
	public static WebElement PuzzleTest;
	
	@FindBy(xpath="//button[@class='accept']")
	public static WebElement ClickSubscribe;
}
