package objectDetails_GeneralStudies_Science;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NationalScientificLaboratories {


	@FindBy(xpath="//*[@id='why-us']/div/div/div[4]/div/div/div[1]/a/button")
	public static WebElement nationalscientificLaboratories;
	
	@FindBy(xpath="//div[@id='cookiesPopup']/child::button[2]")
	public static WebElement Subscribe;
}
