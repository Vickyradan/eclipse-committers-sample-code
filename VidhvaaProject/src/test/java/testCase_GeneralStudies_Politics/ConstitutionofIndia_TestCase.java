package testCase_GeneralStudies_Politics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import commonFunctions.Login;
import objectDetails_GeneralStudies_Politics.ConstitutionofIndia;
public class ConstitutionofIndia_TestCase extends CommonFunction{

	
	public void LoginFunction(){
	
		PageFactory.initElements(driver, Login.class);

		Login.ClickLogin.click();
		Login.Moblie.sendKeys(property.getProperty("MobileNumber"));
		Login.email.sendKeys(property.getProperty("Email"));
		Login.Submit.click();
		
	}
	
	public void ConstitutionofIndiafunction() {
		
		PageFactory.initElements(driver, ConstitutionofIndia.class);
		ConstitutionofIndia.ClickGeneralStudies.click();
		LOG.info("General Studies clicked");
		ConstitutionofIndia.ClcikPolitics.click();
		LOG.info("Politics clicked");
		ConstitutionofIndia.ClickConstitutionofIndia.click();
		LOG.info("Constitution of India clicked");
		WebElement element = ConstitutionofIndia.ClickSampleMaterial;
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		LOG.info("Sample Material clicked");
	}
	
	
	
	@Test
	public void ConstitutionofIndia() throws InterruptedException {

		LoginFunction();
		LOG.info("Constitution of India function running");
		ConstitutionofIndiafunction();
		LOG.info("Constitution of India function finished");
		driver.navigate().back();

	}
}
