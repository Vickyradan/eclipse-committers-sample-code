package xpath;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ElementAndAttributes {
	WebDriver driver;
	@BeforeTest
	
	public void OpenBrowser(){
		System.setProperty("webdriver.chrome.driver", "E://chrome Driver//chromeDriver.exe");
	    driver = new ChromeDriver();
	    driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	}
	
	@Test(enabled=false)
	//1.Locating elements with known attribute
	// Methods {//*[@Attribute='value']}
	// [*-basically first preference]
	public void SignIn()
	{
		driver.navigate().refresh();
		driver.findElement(By.xpath("//*[@name='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@name='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@name='Submit']")).click();
	}
	
	@Test(enabled=false)
	//2.Locating elements with known element and attribute
	// Methods {//element name[@Attribute='value']}
	public void SignIn1()
	{
		driver.navigate().refresh();
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
	}
	
	@Test(enabled=false)
	//3.Locating elements with visible text (exact text)
	// Methods {//element name[text()='exact text']}
	public void SignIn2()
	{
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
	}
	
	@Test(enabled=false)
	//4.Locating elements when part of the visible text is known
	// Methods {[//element name[contains(text(),'part of the text')]}
	public void SignIn3()
	{
		driver.navigate().refresh();
		driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM')]")).click();
		
	}
	
	@Test(enabled=false)
	//5.Locating elements with multiple attributes
	// Methods {//element name[@attribute1='value1'][@attributeN='valueN']}
	public void SignIn4()
	{
		driver.navigate().refresh();
		driver.findElement(By.xpath("//input[@name='txtUsername'][@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='txtPassword'][@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@name='Submit'][@id='btnLogin']")).click();
	}
	
	@Test(enabled=false)
	//6.Locating elements when starting visible text is known
	// Methods {[//element name[starts-with(text(),'starting text')]}
	public void SignIn5()
	{
		driver.navigate().refresh();
		driver.findElement(By.xpath("//a[starts-with(text(),'Forgot')]")).click();
		
	}
	
	@Test(enabled=true)
	//7.Locating elements with dynamic attribute value
	// Two Methods {[//element name[contains(@attribute name,'part of the value')]

	//element name[starts-with(@attribute name,'fixed prefix of the value')]
	public void SignIn6()
	{
		driver.navigate().refresh();
		driver.findElement(By.xpath("")).click();
		
	}


}
