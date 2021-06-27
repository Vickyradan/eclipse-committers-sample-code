package testCase_GeneralStudies_History;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_History.Guptas;
public class Guptas_TestCase extends CommonFunction{

	public void GuptasFunction() {
		PageFactory.initElements(driver, Guptas.class);
		Guptas.clickGuptas.click();
		LOG.info("Guptas clicked");
		
		Guptas.ClickSubscribe.click();
		LOG.info("Subscribe clicked");
	}
	
	
	@Test(priority=9)
	public void Guptas(){
		
		LOG.info("Guptas function running");
		GuptasFunction();
		LOG.info("Guptas function finished");
		
		driver.navigate().back();
	}
}
