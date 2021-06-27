package testCase_GeneralStudies_Mathematics;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_Mathematics.Material_PuzzleTest;

public class Material_PuzzleTest_TestCase extends CommonFunction {

	public void PuzzleTestFunctions() {
		PageFactory.initElements(driver, Material_PuzzleTest.class);
		Material_PuzzleTest.PuzzleTest.click();
		LOG.info("Puzzle Test clicked");
		
		Material_PuzzleTest.ClickSubscribe.click();
		LOG.info("Subscribe clicked");
		
	}
	
	@Test
	public void PuzzleTest() {

		LOG.info("Puzzle Test function running");
		PuzzleTestFunctions();
		LOG.info("Puzzle Test function finished");
		
		driver.navigate().back();
	}
}
