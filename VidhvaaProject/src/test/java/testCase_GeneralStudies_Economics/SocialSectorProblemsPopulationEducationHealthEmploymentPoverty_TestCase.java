package testCase_GeneralStudies_Economics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_GeneralStudies_Economics.SocialSectorProblemsPopulationEducationHealthEmploymentPoverty;
public class SocialSectorProblemsPopulationEducationHealthEmploymentPoverty_TestCase extends CommonFunction{

	public void SocialSectorProblemsPopulationEducationHealthEmploymentPovertyfuction() {
		
		PageFactory.initElements(driver, SocialSectorProblemsPopulationEducationHealthEmploymentPoverty.class);
		SocialSectorProblemsPopulationEducationHealthEmploymentPoverty.
		                                 ClickSocialSectorProblemsPopulationEducationHealthEmploymentPoverty.click();
		LOG.info("Social Sector Problems, Population, Education, Health, Employment, Poverty clicked");
		
		WebElement element =SocialSectorProblemsPopulationEducationHealthEmploymentPoverty.ClickSampleMaterial;
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		LOG.info("Sample Material clicked");
	}
	
	
	@Test
	public void SocialSectorProblemsPopulationEducationHealthEmploymentPoverty() throws InterruptedException {

		LOG.info("Social Sector Problems, Population, Education, Health, Employment, Poverty function running");
		SocialSectorProblemsPopulationEducationHealthEmploymentPovertyfuction();
		LOG.info("Social Sector Problems, Population, Education, Health, Employment, Poverty function finished");
		
		driver.navigate().back();
	}
}
