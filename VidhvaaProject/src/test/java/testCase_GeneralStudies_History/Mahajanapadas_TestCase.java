package testCase_GeneralStudies_History;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import  objectDetails_GeneralStudies_History.Mahajanapadas;
public class Mahajanapadas_TestCase extends CommonFunction{

	public void MahajanapadasFunctions() {
		PageFactory.initElements(driver, Mahajanapadas.class);
		Mahajanapadas.clickMahajanapadas.click();
		LOG.info("Mahajanapadas clicked");
		
		Mahajanapadas.ClickSubscribe.click();
		LOG.info("Subscribe clicked");
	}
	
	
	@Test(priority=4)
	public void Mahajanapadas(){

		LOG.info("Mahajanapadas function running");
		MahajanapadasFunctions();
		LOG.info("Mahajanapadas function finished");
		driver.navigate().back();
	}
}
