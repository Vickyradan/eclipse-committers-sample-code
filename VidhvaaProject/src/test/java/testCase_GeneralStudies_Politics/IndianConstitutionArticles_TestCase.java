package testCase_GeneralStudies_Politics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_Politics.IndianConstitutionArticles;
public class IndianConstitutionArticles_TestCase extends CommonFunction{

	public void IndianConstitutionArticlesfunction() {
		
		PageFactory.initElements(driver, IndianConstitutionArticles.class);
		IndianConstitutionArticles.ClickIndianConstitutionArticles.click();
		LOG.info("Indian Constitution - Articles clicked");
		WebElement element = IndianConstitutionArticles.ClickSampleMaterial;
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		LOG.info("Sample Material clicked");
	}
	
	@Test
	public void  IndianConstitutionArticles() throws InterruptedException {

		LOG.info("Indian Constitution - Articles function running");
		IndianConstitutionArticlesfunction();
		LOG.info("Indian Constitution - Articles function finished");
		
		driver.navigate().back();
	}
}
