package TestNG;

import org.testng.annotations.Test;

public class TimeOut {
	
	@Test(timeOut=2000)
	public void sample (){
		
		
		System.out.println("success");
	}

}
