package testCase_GeneralStudies_History;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_History.Palayakkas_RebellioninTamilnadu;
public class Palayakkas_RebellioninTamilnadu_TestCase extends CommonFunction{

	public  void Palayakkas_RebellioninTamilnaduFunction() {
		
		PageFactory.initElements(driver, Palayakkas_RebellioninTamilnadu.class);
		Palayakkas_RebellioninTamilnadu.clickPalayakkas_RebellioninTamilnadu.click();
		LOG.info("Palayakkar's Rebellion in Tamilnadu clicked");
		
		Palayakkas_RebellioninTamilnadu.ClickSubscribe.click();
		LOG.info("Subscribe clicked");
		
	}
	
	
	@Test(priority=31)
	public void  Palayakkas_RebellioninTamilnadu(){
		
		LOG.info("Palayakkar's Rebellion in Tamilnadu function running");
		Palayakkas_RebellioninTamilnaduFunction();
		LOG.info("Palayakkar's Rebellion in Tamilnadu function finished");
		
		driver.navigate().back();
	}
}
