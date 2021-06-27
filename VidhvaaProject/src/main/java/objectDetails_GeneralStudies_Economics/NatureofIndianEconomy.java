package objectDetails_GeneralStudies_Economics;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NatureofIndianEconomy {
	
	
	@FindBy(xpath="//*[@id='hid2']")
	public static WebElement ClickGeneralStudies;
	
	@FindBy(xpath="//button[@id='myBtn']/following::button[5]")
	public static WebElement ClcikEconomics;
	
	@FindBy(xpath="//*[@id='why-us']/div/div/div[1]/div/div/div[1]/a/button")
	public static WebElement ClickNatureofIndianEconomy;
	
	@FindBy(xpath="//div[@id='fade-wrapper']/div/div/button[3]")
	public static WebElement ClickSampleMaterial;

}
