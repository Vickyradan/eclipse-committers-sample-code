package testCase_GeneralStudies_Science;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunction;

public class NewInnovationandDiscoveries_TestCase extends CommonFunction {

	public void NewInnovationandDiscoveriesFunction() {
		
		PageFactory.initElements(driver, objectDetails_GeneralStudies_Science.NewInnovationandDiscoveries.class);
		objectDetails_GeneralStudies_Science.NewInnovationandDiscoveries.newInnovationandDiscoveries.click();
		LOG.info("New Innovations and Discoveries clicked");
		
		objectDetails_GeneralStudies_Science.NewInnovationandDiscoveries.Subscribe.click();
		LOG.info("subscribe clicked");
		
	}
	
	@Test
	public void NewInnovationandDiscoveries() {
		
		LOG.info("New Innovations and Discoveries function running");
		NewInnovationandDiscoveriesFunction();
		LOG.info("New Innovations and Discoveries function finished");
		
		driver.navigate().back();
	}
}
