package TestNG;

import org.testng.annotations.Test;

public class AlwaysRun {
	
	@Test(timeOut=1000)
	public void AllowPermission() throws InterruptedException{
		Thread.sleep(2000);
		System.out.println("play cricket");
	}
	
	@Test(dependsOnMethods="AllowPermission",alwaysRun=true)
	public void  TakePermission(){
		System.out.println("go to play ground");
	}
	

}
