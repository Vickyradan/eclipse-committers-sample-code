package commonFunctions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class CommonFunction {
	
	public static Properties property;
	public static WebDriver driver;
	public static Logger LOG = LogManager.getLogger(CommonFunction.class);
	
	public Properties Propertyfile() throws IOException{
		
		FileInputStream inputStream = new FileInputStream("src/main/resources/Config.properties");
		 property = new Properties();
		 property.load(inputStream);
		 
		 return property;
	}
	
	
	@BeforeSuite
	public void OpenBrowser() throws IOException{
		PropertyConfigurator.configure("log4j2.properties");
		Propertyfile();
		LOG.info("Property file Loaded");
		String Browser = property.getProperty("browser");
		String url =property.getProperty("url");
		String driverLocation = property.getProperty("driverlocation");
		
		if (Browser.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", driverLocation);
			driver = new ChromeDriver();
		
		} else {
			System.setProperty("webdriver.gecko.driver", driverLocation);
			driver = new FirefoxDriver();
		}
		LOG.info("Browser Opened");
		
		driver.navigate().to(url);
		LOG.info("getting url");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	@AfterSuite
	public void CloseBrowser(){
		driver.quit();
		
		LOG.info("Browser closed");
	}

}
