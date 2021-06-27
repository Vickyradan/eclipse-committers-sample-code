package testCase_GeneralStudies_Politics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import commonFunctions.PageReturn;
import objectDetails_GeneralStudies_Politics.AmendmentsinIndianConstitution;
public class AmendmentsinIndianConstitution_TestCase extends CommonFunction{

	
	public void AmendmentsinIndianConstitutionfunction() {
		PageFactory.initElements(driver, AmendmentsinIndianConstitution.class);
		AmendmentsinIndianConstitution.ClickAmendmentsinIndianConstitution.click();
		LOG.info("Amendments in Indian Constitution (1 to 103) clicked");
		
		WebElement element = AmendmentsinIndianConstitution.ClickSampleMaterial;
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		LOG.info("Sample Material clicked");
	}
	
	public void Pageback() throws InterruptedException {

		PageFactory.initElements(driver, PageReturn.class);
		PageReturn.CliclLogo.click();
		Thread.sleep(3000);
		PageReturn.ClickTNPSC.click();
	}
	
	@Test
	public void  AmendmentsinIndianConstitution() throws InterruptedException {
		
		LOG.info("Amendments in Indian Constitution (1 to 103) function running");
		AmendmentsinIndianConstitutionfunction();
		LOG.info("Amendments in Indian Constitution (1 to 103) function finished");
		
		Pageback();
	}
}
