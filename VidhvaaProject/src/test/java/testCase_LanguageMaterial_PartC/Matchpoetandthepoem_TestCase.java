package testCase_LanguageMaterial_PartC;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_LanguageMaterial_PartC.Matchpoetandthepoem;

public class Matchpoetandthepoem_TestCase extends CommonFunction{

	
	public void Matchpoetandthepoemfunction(){
		PageFactory.initElements(driver, Matchpoetandthepoem.class);
		Matchpoetandthepoem.ClickMatchpoetandthepoem.click();
		LOG.info("Match poet and the poem  clicked");
		
		WebElement element = Matchpoetandthepoem.ClickSampleMaterial;
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		LOG.info("Sample Material clicked");
		
	}
	
	
	@Test
	public void Matchpoetandthepoem()  {

		LOG.info("Match poet and the poem function running");
		Matchpoetandthepoemfunction();
		LOG.info("Match poet and the poem function finished");
		driver.navigate().back();

	}

}
