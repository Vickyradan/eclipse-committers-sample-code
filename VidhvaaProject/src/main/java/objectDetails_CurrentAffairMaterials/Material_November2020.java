package objectDetails_CurrentAffairMaterials;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Material_November2020 {
	
	@FindBy(xpath="//*[@id='hid4']/h3/a")
	public static WebElement ClickCurrtenAffair;
	
	@FindBy(xpath="//*[@id='tab-10']/div/div/div/div[1]/div[2]/a")
	public static WebElement ClickMaterial;
	
	@FindBy(xpath="//*[@id='cookiesPopup']/button[1]")
	public static WebElement Clickclosepopup;//*[@id="cookiesPopup"]/button[2]
	//*[@id="cookiesPopup"]/button[1]
}
