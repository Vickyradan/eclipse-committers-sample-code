package testCase_LanguageMaterial_PartB;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_LanguageMaterial_PartB.QuestionontheBiography;
public class QuestionontheBiography_TestCase extends CommonFunction{

	
	public void QuestionontheBiographyfunction() {
		
		PageFactory.initElements(driver, QuestionontheBiography.class);
		QuestionontheBiography.ClickQuestionontheBiography.click();
		LOG.info("Questionon the Biography clicked");
		
		WebElement element=QuestionontheBiography.ClickSampleMaterial;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		LOG.info("sample material clicked");
		
	}
	
	@Test
	public void QuestionontheBiography()  {

		LOG.info("Questionon the Biography function running");
		QuestionontheBiographyfunction();
		LOG.info("Questionon the Biography function finished");
		driver.navigate().back();

	}
}
