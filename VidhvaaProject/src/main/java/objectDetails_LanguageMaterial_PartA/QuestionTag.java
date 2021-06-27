package objectDetails_LanguageMaterial_PartA;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QuestionTag {

	
	@FindBy(xpath="//*[@id='why-us']/div/div/div[7]/div/div/div[1]/a/button")
	public static WebElement ClickQuestionTag;
	
	@FindBy(xpath="//div[@id='fade-wrapper']/div/div/button[3]")
	public static WebElement ClickSampleMaterial;
}
