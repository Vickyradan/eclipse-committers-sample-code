package TestNG;

import org.testng.annotations.Test;

public class MultipleTime {
	
	// same test case multiple time run 
	@Test(invocationCount=3)
	public void sample (){
		
		System.out.println("success");
	}

}
