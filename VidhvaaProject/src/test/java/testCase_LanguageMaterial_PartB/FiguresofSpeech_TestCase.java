package testCase_LanguageMaterial_PartB;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import commonFunctions.Login;
import objectDetails_LanguageMaterial_PartB.FiguresofSpeech;
public class FiguresofSpeech_TestCase extends CommonFunction{

	
	public void LoginFunction(){
		
		PageFactory.initElements(driver, Login.class);

		Login.ClickLogin.click();
		Login.Moblie.sendKeys(property.getProperty("MobileNumber"));
		Login.email.sendKeys(property.getProperty("Email"));
		Login.Submit.click();
		
	
	}
	
	public void FiguresofSpeechfunction() {
		PageFactory.initElements(driver, FiguresofSpeech.class);
		FiguresofSpeech.ClickLanguageMaterial.click();
		LOG.info("LanguageMaterial clicked");
		FiguresofSpeech.ClickPartB.click();
		LOG.info("Part B Clicked");
		FiguresofSpeech.ClickFiguresofSpeech.click();
		LOG.info("Figures of Speech clicked");
		
		WebElement element = FiguresofSpeech.ClickSampleMaterial;
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		LOG.info("sample material clicked");
		
		FiguresofSpeech.Clickdownload.click();
		LOG.info("File Downloaded");
		
		
	}
	
	
	@Test
	public void FiguresofSpeech() {

		LoginFunction();
		LOG.info("Figures of Speech function running");
		FiguresofSpeechfunction();
		LOG.info("Figures of Speech function finished");
		driver.navigate().back();


	}
}
