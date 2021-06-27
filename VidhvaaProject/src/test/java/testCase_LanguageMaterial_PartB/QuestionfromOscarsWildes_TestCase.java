package testCase_LanguageMaterial_PartB;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_LanguageMaterial_PartB.QuestionfromOscarsWildes;
public class QuestionfromOscarsWildes_TestCase extends CommonFunction{

	public void QuestionfromOscarsWildesfunction() {
		
		PageFactory.initElements(driver, QuestionfromOscarsWildes.class);
		
		QuestionfromOscarsWildes.ClickQuestionfromOscarsWildes.click();
		LOG.info("Question from Oscars Wildes clicked");
		WebElement element =QuestionfromOscarsWildes.ClickSampleMaterial;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		LOG.info("sample material clicked");
	}
	
	@Test
	public void QuestionfromOscarsWildes()  {

		LOG.info("Question from Oscars Wildes function running");
		QuestionfromOscarsWildesfunction();
		LOG.info("Question from Oscars Wildes function finished");
		driver.navigate().back();

	}
}
