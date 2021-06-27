package testCase_LanguageMaterial_PartC;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;
import objectDetails_LanguageMaterial_PartC.Mentionthepoeminwhichtheselinesoccur;

public class Mentionthepoeminwhichtheselinesoccur_TestCase extends CommonFunction{

	
	public void Mentionthepoeminwhichtheselinesoccurfunction(){
		PageFactory.initElements(driver, Mentionthepoeminwhichtheselinesoccur.class);
		Mentionthepoeminwhichtheselinesoccur.ClickMentionthepoeminwhichtheselinesoccur.click();
		LOG.info("Mention the poem in which these lines occur clicked");
				
		WebElement element = Mentionthepoeminwhichtheselinesoccur.ClickSampleMaterial;
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		LOG.info("Sample Material clicked");
		
	}
	
	
	@Test
	public void Mentionthepoeminwhichtheselinesoccur()  {

		LOG.info("Mention the poem in which these lines occur function running");
		Mentionthepoeminwhichtheselinesoccurfunction();
		LOG.info("Mention the poem in which these lines occur function finished");
		
		driver.navigate().back();

	}
}
