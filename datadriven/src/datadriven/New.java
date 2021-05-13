package datadriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class New {
	
	static List<String> usernameList = new ArrayList<String>();
	static List<String> passwordList = new ArrayList<String>();
	
	public void Readexcel() throws IOException{
		FileInputStream excel = new FileInputStream("E://Book1.xlsx");
		
		@SuppressWarnings("resource")
		Workbook workbook = new XSSFWorkbook(excel);
		
		Sheet sheet = workbook.getSheetAt(0);
		
		Iterator<Row> rowiterator = sheet.iterator();
		
		while (rowiterator.hasNext()){
			
			Row rowvalue =rowiterator.next();
			
			Iterator<Cell> columniterator = rowvalue.iterator();
			
			int i =2;
			while (columniterator.hasNext()){
				
				if(i % 2==0){
					usernameList.add(columniterator.next().getStringCellValue());
				}
				else{
					passwordList.add(columniterator.next().getStringCellValue());
				}
				i++;
			}
		}
	}
	
	
	public void LogIn(String username, String password){
		
		System.setProperty("webdriver.chrome.driver", "E://chrome Driver//chromeDriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.name("txtPassword")).sendKeys(password);
		driver.findElement(By.name("Submit")).click();
		driver.quit();
	}
	
	public void ExTest(){
		
		for(int i=0; i<usernameList.size();i++){
			LogIn(usernameList.get(i),passwordList.get(i));
		}
	}
	
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		New obj =new New();
		obj.Readexcel();
		System.out.println("username:"+usernameList);
		System.out.println("password:"+passwordList);
		obj.ExTest();
	}

}
