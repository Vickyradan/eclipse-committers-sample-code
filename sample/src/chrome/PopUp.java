package chrome;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp {
	
	public static void main(String[] args){
		
		System.setProperty("webdriver.chrome.driver", "E://chrome Driver//chromedriver_win32//chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.navigate().to("http://leafground.com/");
	    
	    driver.findElement(By.xpath("//h5[contains(text(),'Window')]")).click();
	    
	    String MainWindow = driver.getWindowHandle();
	    
	    driver.findElement(By.id("home")).click();
	    
	    Set<String> NewWindows = driver.getWindowHandles();
	    
	    for(String ChildWindow : NewWindows)
	    {
	    	driver.switchTo().window(ChildWindow);
	    }
	    driver.findElement(By.xpath("//h5[contains(text(),'Edit')]")).click();
	    
	    driver.close();
	    
	    driver.switchTo().window(MainWindow);
	    
	    driver.findElement(By.xpath("//button[contains(text(),'Open Multiple Windows')]")).click();
	    
	    int noofwindow = driver.getWindowHandles().size();
	    System.out.println("number of multiple windows:"+" "+ noofwindow);
	    
	    driver.switchTo().window(MainWindow);
	    
	    driver.findElement(By.xpath("//button[contains(text(),'Do not close me ')]")).click();
	    
	    Set<String> closewindow = driver.getWindowHandles();
	    
	    for(String Childwindows : closewindow){
	    	if(!MainWindow.equals(Childwindows)){
	    		driver.switchTo().window(Childwindows);
	    		driver.close();
	    	}
	    }
		System.out.println("success");

	}

}
