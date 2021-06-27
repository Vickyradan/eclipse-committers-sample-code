package objectDetails_LanguageMaterial_PartB;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QuestionontheBiography {

	
	@FindBy(xpath="//*[@id='why-us']/div/div/div[4]/div/div/div[1]/a/button")
	public static WebElement ClickQuestionontheBiography;
	
	@FindBy(xpath="//div[@id='fade-wrapper']/div/div/button[3]")
	public static WebElement ClickSampleMaterial;
}
