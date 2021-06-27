package testCase_LanguageMaterial_PartB;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_LanguageMaterial_PartB.QuestionsonShakespeare;
public class QuestionsonShakespeare_TestCase extends CommonFunction{

	public void QuestionsonShakespearefunction() {
		
		PageFactory.initElements(driver, QuestionsonShakespeare.class);
		QuestionsonShakespeare.ClickQuestionsonShakespeare.click();
		LOG.info("Questions on Shakespeare clicked");
		
		WebElement element =QuestionsonShakespeare.ClickSampleMaterial;
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		
		LOG.info("sample material clicked");
	}
	
	@Test
	public void QuestionsonShakespeare()  {

		LOG.info("Questions on Shakespeare function running");
		QuestionsonShakespearefunction();
		LOG.info("Questions on Shakespeare function finished");
		driver.navigate().back();

	}
}
