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

public class Data {
	static List<String> usernameList = new ArrayList<String>();
	static List<String> passwordList = new ArrayList<String>();

	public void readExcel() throws IOException {

		FileInputStream excel = new FileInputStream("C://Users//KAVINESH//Documents//Book1.xlsx");

		@SuppressWarnings("resource")
		Workbook workbook = new XSSFWorkbook(excel);
		Sheet sheet = workbook.getSheetAt(0);

		Iterator<Row> rowIterator = sheet.iterator();

		while (rowIterator.hasNext()) {

			Row rowvalue = rowIterator.next();

			Iterator<Cell> columnIterator = rowvalue.iterator();

			int i = 2;

			while (columnIterator.hasNext()) {

				if (i % 2 == 0) {
					usernameList.add(columnIterator.next().getStringCellValue());
				} else {
					passwordList.add(columnIterator.next().getStringCellValue());
				}

				i++;

			}
		}

	}

	public void logIn(String uname, String pward) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E://chrome Driver//chromeDriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.findElement(By.id("txtUsername")).sendKeys(uname);
		driver.findElement(By.name("txtPassword")).sendKeys(pward);
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		driver.close();
	}

	public void executeTest() throws InterruptedException {
		for (int i = 1; i < usernameList.size(); i++) {
			logIn(usernameList.get(i), passwordList.get(i));
		}
	}

	public static void main(String[] args) throws IOException, InterruptedException   {
		// TODO Auto-generated method stub

		Data data = new Data();
		data.readExcel();
		System.out.println("Username List" + usernameList);
		System.out.println("Password List" + passwordList);
		data.executeTest();

	}

}