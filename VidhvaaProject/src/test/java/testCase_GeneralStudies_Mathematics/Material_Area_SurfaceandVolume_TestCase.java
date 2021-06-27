package testCase_GeneralStudies_Mathematics;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_Mathematics.Material_Area_SurfaceandVolume;

public class Material_Area_SurfaceandVolume_TestCase extends CommonFunction {

	public void Area_SurfaceandVolumeFunction() {
		PageFactory.initElements(driver, Material_Area_SurfaceandVolume.class);
		Material_Area_SurfaceandVolume.Area_SurfaceandVolume.click();
		
		LOG.info("Area, Surface and Volume clicked");
		Material_Area_SurfaceandVolume.ClickSubscribe.click();
		LOG.info("Subscribe clicked");
	}
	
	@Test
	public void Area_SurfaceandVolume() {

		LOG.info("Area, Surface and Volume function running");
		Area_SurfaceandVolumeFunction();
		LOG.info("Area, Surface and Volume function finished");
		
		driver.navigate().back();
	}
}
