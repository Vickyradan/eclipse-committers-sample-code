package testCase_GeneralStudies_History;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_History.WomenEmpowermentinIndia;
public class WomenEmpowermentinIndia_TestCase extends CommonFunction {

	
	public void  WomenEmpowermentinIndiaFunction() {
		PageFactory.initElements(driver, WomenEmpowermentinIndia.class);
		WomenEmpowermentinIndia.clickWomenEmpowermentinIndia.click();
		LOG.info("Women Empowerment in India clicked");
		
		WomenEmpowermentinIndia.ClickSubscribe.click();
		LOG.info("Subscribe clicked");
		
	}
	
	@Test(priority=23)
	public void  WomenEmpowermentinIndia(){
		
		LOG.info("Women Empowerment in India function running");
		WomenEmpowermentinIndiaFunction();
		LOG.info("Women Empowerment in India function finished");
		
		driver.navigate().back();
	}
}
