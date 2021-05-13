package xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Flipkart {
	
	//WebDriver driver;
	//@BeforeTest
	
	//public void OpenBrowser(){
		//System.setProperty("webdriver.chrome.driver", "E://chrome Driver//chromeDriver.exe");
	   // driver = new ChromeDriver();
	    //driver.navigate().to("https://www.flipkart.com/");

	//}
	
	
	@Test(priority=1)
	public void BuynowMoblie(){
		
		System.setProperty("webdriver.chrome.driver", "E://chrome Driver//chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.navigate().to("https://www.flipkart.com/");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//Button[@class='_2KpZ6l _2doB4z']")).click();
		//driver.findElement(By.xpath("//img[@alt='Mobiles']")).click();              // Click image
		driver.findElement(By.xpath("//div[contains(text(),'Mobiles')]")).click(); // Click on Letter
		String text = driver.findElement(By.xpath("//div[contains(text(),'Mobiles')]")).getText();
		System.out.println(text);
		//click Mobile SamsungA21s
		driver.findElement(By.xpath("//a[contains(@href,'/samsung-galaxy-a21s-black-64-gb/p/itm3f1fa3caa5ac6')]")).click();
		driver.findElement(By.xpath("//li[@id='swatch-1-color']")).click();		    // Select colors
		driver.findElement(By.xpath("//li[@id='swatch-1-ram']")).click();	       	// Select Ram
		driver.findElement(By.xpath("//li[@id='swatch-1-storage']")).click();		//Select Storage Capacity
		driver.findElement(By.xpath("//input[@id='pincodeInputId']")).sendKeys("623409"); 		// Enter pin code
		driver.findElement(By.xpath("//span[@class='_2P_LDn']")).click();            //Click check pin code
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA ihZ75k _3AWRsL']")).click();  // Click buy now button
		
	}
	
	@Test(priority=2)
	
	public void AddToCartMobile(){
		
		System.setProperty("webdriver.chrome.driver", "E://chrome Driver//chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.navigate().to("https://www.flipkart.com/");

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//Button[@class='_2KpZ6l _2doB4z']")).click();
		//driver.findElement(By.xpath("//img[@alt='Mobiles']")).click();              // Click image
		driver.findElement(By.xpath("//div[contains(text(),'Mobiles')]")).click();    // Click on Letter
		
		//click Mobile SamsungA21s
		driver.findElement(By.xpath("//a[contains(@href,'/samsung-galaxy-a21s-black-64-gb/p/itm3f1fa3caa5ac6')]")).click();
		driver.findElement(By.xpath("//li[@id='swatch-1-color']/a")).click();		    // Select colors
		driver.findElement(By.xpath("//li[@id='swatch-1-ram']")).click();	       	// Select Ram
		driver.findElement(By.xpath("//li[@id='swatch-1-storage']")).click();		//Select Storage Capacity
		driver.findElement(By.xpath("//input[@id='pincodeInputId']")).sendKeys("623409"); 		// Enter pin code
		driver.findElement(By.xpath("//span[@class='_2P_LDn']")).click();            //Click check pin code
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();   // Click AddtoCart
		//driver.findElement(By.xpath("//button[@class='_23FHuj']")).click(); // increase quantity
		driver.findElement(By.xpath("//div[@class='VUS-tD eBV0fb']")).click();  // place order
		
		
		////*[@id="swatch-1-color"]/a      //button[@class='_2KpZ6l _2ObVJD _3AWRsL']
	}

}
