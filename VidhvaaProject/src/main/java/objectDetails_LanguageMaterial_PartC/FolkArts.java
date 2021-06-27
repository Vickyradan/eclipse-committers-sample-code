package objectDetails_LanguageMaterial_PartC;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FolkArts {

	@FindBy(xpath="//*[@id='why-us']/div/div/div[9]/div/div/div[1]/a/button")
	public static WebElement ClickFolkArts;
	
	@FindBy(xpath="//div[@id='fade-wrapper']/div/div/button[3]")
	public static WebElement ClickSampleMaterial;
}
