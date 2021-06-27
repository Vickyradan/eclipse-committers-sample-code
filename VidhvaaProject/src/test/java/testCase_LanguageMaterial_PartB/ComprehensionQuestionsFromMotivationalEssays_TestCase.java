package testCase_LanguageMaterial_PartB;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_LanguageMaterial_PartB.ComprehensionQuestionsFromMotivationalEssays;
public class ComprehensionQuestionsFromMotivationalEssays_TestCase extends CommonFunction{

	public void ComprehensionQuestionsFromMotivationalEssaysfunction() {
		
		PageFactory.initElements(driver, ComprehensionQuestionsFromMotivationalEssays.class);
		ComprehensionQuestionsFromMotivationalEssays.ClickComprehensionQuestionsFromMotivationalEssays.click();
		LOG.info("Comprehension Questions From Motivational Essays clicked");
		
		WebElement element =ComprehensionQuestionsFromMotivationalEssays.ClickSampleMaterial;
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		LOG.info("sample material clicked");
		
	}
	
	@Test
	public void  ComprehensionQuestionsFromMotivationalEssays()  {

		LOG.info("Comprehension Questions From Motivational Essays function running");
		ComprehensionQuestionsFromMotivationalEssaysfunction();
		LOG.info("Comprehension Questions From Motivational Essays function finished");
		driver.navigate().back();
	}
}
