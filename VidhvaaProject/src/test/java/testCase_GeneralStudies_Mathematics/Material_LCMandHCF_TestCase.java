package testCase_GeneralStudies_Mathematics;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_Mathematics.Material_LCMandHCF;

public class Material_LCMandHCF_TestCase extends CommonFunction{

	
	public void LCMandHCF_Function(){
		
		PageFactory.initElements(driver, Material_LCMandHCF.class);
		Material_LCMandHCF.ClickTimeandDistance.click();
		LOG.info("L.C.M and H.C.F clicked");
		Material_LCMandHCF.ClickSubscribe.click();
		LOG.info("Subscribe clicked");
		
	}
	
	@Test
	public void LCMandHCF() {
		
		LOG.info("L.C.M and H.C.F function running");
		LCMandHCF_Function();
		LOG.info("L.C.M and H.C.F function finished");
		driver.navigate().back();
	}
	
}
