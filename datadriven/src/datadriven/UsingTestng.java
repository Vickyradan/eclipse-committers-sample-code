package datadriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class UsingTestng {
	
	// String [][] use only string value
	// Object [][] use all value
	
	@DataProvider(name ="LoginData")
	public String[][] LoinDataprovider() throws BiffException, IOException{
		
		String[][] data = Getexceldata();
		
		return data;
			
	}
	
	public String[][] Getexceldata () throws BiffException, IOException{
		
		// Must change Excel format (Excel 97-2003 workbook)
		FileInputStream excel = new FileInputStream("E://Book1.1.xls");
		
		Workbook workbook = Workbook.getWorkbook(excel);
		 
		Sheet sheet =workbook.getSheet(0);
		
		int rowcount =sheet.getRows();
		int cloumncount = sheet.getColumns();
		
		String data [][] = new String [rowcount][cloumncount]; 
		
		for (int i=0;i<rowcount;i++){
			for ( int j=0;j<cloumncount;j++){
				data [i][j] =sheet.getCell(j, i).getContents();
			}
			
		}
		
		
		return data;
	}
	
	@Test(dataProvider="LoginData")
	public void LogIn(String username, String password){
		
		System.setProperty("webdriver.chrome.driver", "E://chrome Driver//chromeDriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.name("txtPassword")).sendKeys(password);
		driver.findElement(By.name("Submit")).click();
		driver.quit();
	}

}
