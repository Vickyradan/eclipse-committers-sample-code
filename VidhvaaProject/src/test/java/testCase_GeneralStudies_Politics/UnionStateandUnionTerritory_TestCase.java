package testCase_GeneralStudies_Politics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_Politics.UnionStateandUnionTerritory;
public class UnionStateandUnionTerritory_TestCase extends CommonFunction{

	
	public void UnionStateandUnionTerritoryfunction() throws InterruptedException {
		
		PageFactory.initElements(driver, UnionStateandUnionTerritory.class);
		
		WebElement element1 =UnionStateandUnionTerritory.ClickUnionStateandUnionTerritory;
		
		JavascriptExecutor js1= (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click()", element1);
		LOG.info("Union, State and Union Territory clicked");
		
		WebElement element = UnionStateandUnionTerritory.ClickSampleMaterial;
				
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		LOG.info("Sample Material clicked");
	}
	
	@Test
	public void UnionStateandUnionTerritory() throws InterruptedException {

		LOG.info("Union, State and Union Territory function running");
		UnionStateandUnionTerritoryfunction();
		LOG.info("Union, State and Union Territory function finished");
		
		driver.navigate().back();

	}
}
