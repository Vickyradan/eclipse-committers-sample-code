package testCase_LanguageMaterial_PartA;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_LanguageMaterial_PartA.Articles;

public class Articles_TestCase extends CommonFunction{

	
	public void Articlesfunction(){
		PageFactory.initElements(driver, Articles.class);
		Articles.ClickArticles.click();
		LOG.info("Articles clicked");

		WebElement element = Articles.ClickSampleMaterial;

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		LOG.info("Sample Material clicked");

	}


	@Test
	public void Articles()  {
		
		LOG.info("Articles function running");
		Articlesfunction();
		LOG.info("Articles function finished");
		driver.navigate().back();
	}
}
