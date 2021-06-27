package testCase_LanguageMaterial_PartB;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_LanguageMaterial_PartB.Comprehensionquestionsfromthedescriptionofplaces;
public class Comprehensionquestionsfromthedescriptionofplaces_TestCase extends CommonFunction{

	public void Comprehensionquestionsfromthedescriptionofplacesfunction() {
		
		PageFactory.initElements(driver, Comprehensionquestionsfromthedescriptionofplaces.class);
		Comprehensionquestionsfromthedescriptionofplaces.ClickComprehensionquestionsfromthedescriptionofplaces.click();
		LOG.info("Comprehension questions from the description of places clicked");
		
		WebElement element = Comprehensionquestionsfromthedescriptionofplaces.ClickSampleMaterial;
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		LOG.info("sample material clicked");
		
	}
	
	@Test
	public void  Comprehensionquestionsfromthedescriptionofplaces()  {

		LOG.info("Comprehension questions from the description of places function running");
		Comprehensionquestionsfromthedescriptionofplacesfunction();
		LOG.info("Comprehension questions from the description of places function finished");
		driver.navigate().back();
	}
}
