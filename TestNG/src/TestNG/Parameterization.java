package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {
	
	
	@Test()
	@Parameters("Name")
	public void PrintName (String name){
		
		System.out.println("My Name" +name);

	}

}
