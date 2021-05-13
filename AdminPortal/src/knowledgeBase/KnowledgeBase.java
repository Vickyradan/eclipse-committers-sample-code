package knowledgeBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class KnowledgeBase {
	
WebDriver driver;
	
	@BeforeTest()
	public void OpenPortal(){
	
	System.setProperty("webdriver.chrome.driver", "E://chrome Driver//chromedriver_win32//chromeDriver.exe");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.navigate().to("http://edufintech.co/school-erp/");
	}
	
	@Test(priority=1)
	public void SignIn() {
		
		WebElement Enterusername = driver.findElement(By.id("username"));
		Enterusername.sendKeys("admin");
		
		WebElement Enterpassword = driver.findElement(By.id("password"));
		Enterpassword.sendKeys("superadmin");
		
		WebElement Clicklogin = driver.findElement(By.name("Login"));
		Clicklogin.click();
		
		WebElement Knowledgebase = driver.findElement(By.xpath("//*[@id='sidebar']/ul/li[38]/a"));
		Knowledgebase.click();
		
	}
	
	@Test(dependsOnMethods="SignIn")
	public void CreateCategory(){
		
		
		WebElement ClickCreateCategory = driver.findElement(By.xpath("//*[@id='pageSubmenu26']/li[1]"));
		ClickCreateCategory.click();
		
		// Enter Category
		
		WebElement Entercategory = driver.findElement(By.name("kb_category"));
		Entercategory.sendKeys("Comiic");
		
		// Click Submit
		
		WebElement ClickSubmit = driver.findElement(By.name("cateorySubmit"));
		ClickSubmit.click();
		
		// Get report and then Click Articles (Add and View)
		
		// Click Add Articles
		
		WebElement ClickAdd = driver.findElement(By.xpath("//*[@id='tableToExcel']/tbody/tr[1]/td[6]/a[1]"));
		ClickAdd.click();
		
		// Enter Article Headline
		
		WebElement EnterArticle = driver.findElement(By.name("kb_article_name"));
		EnterArticle.sendKeys("Sample");
		
		driver.navigate().back();
		
		driver.navigate().back();
		
		
		// Click Article View
		
		WebElement ClickView = driver.findElement(By.xpath("//*[@id='tableToExcel']/tbody/tr/td[6]/a[2]"));
		ClickView.click();
		
		WebElement EnterKeyword = driver.findElement(By.name("searchkey"));
		EnterKeyword.sendKeys("Sample");
		
		Select SelectCategory = new Select(driver.findElement(By.name("search_category")));
		SelectCategory.selectByVisibleText("Comiic");
		
		WebElement ClickSearch = driver.findElement(By.name("categorySearch"));
		ClickSearch.click();
		
		driver.navigate().back();
		
		driver.navigate().back();
		
		
		// Get report and then Click actions (Edit and Delete)
		
		WebElement ClickEdit = driver.findElement(By.xpath("//*[@id='tableToExcel']/tbody/tr[1]/td[5]/a[1]/i"));
		ClickEdit.click();
		

		// Enter EditCategory
		
		WebElement EnterEditcategory = driver.findElement(By.name("kb_category"));
		EnterEditcategory.sendKeys("Comic");
		
		// Click EditSubmit (Update)
		
		WebElement CLearEditSubmit = driver.findElement(By.name("cateorySubmit"));
		CLearEditSubmit.clear();
		
		WebElement ClickEditSubmit = driver.findElement(By.name("cateorySubmit"));
		ClickEditSubmit.click();
		
		// Click Delete
		
		WebElement ClickDelete = driver.findElement(By.xpath("//*[@id='tableToExcel']/tbody/tr[1]/td[5]/a[2]/i"));
		ClickDelete.click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		
	}
	
	@Test(dependsOnMethods="CreateCategory")
	public void SearchArticles(){
		
		WebElement ClickSearchArticles = driver.findElement(By.xpath("//*[@id='pageSubmenu26']/li[2]"));
		ClickSearchArticles.click();
		
		WebElement EnterKeyword = driver.findElement(By.name("searchkey"));
		EnterKeyword.sendKeys("Sample");
		
		Select SelectCategory = new Select(driver.findElement(By.name("search_category")));
		SelectCategory.selectByVisibleText("Comiic");
		
		WebElement ClickSearch = driver.findElement(By.name("categorySearch"));
		ClickSearch.click();
		
		
	}
	
	@AfterTest()
	public void closebrowser(){
		driver.quit();
	}
	

}
