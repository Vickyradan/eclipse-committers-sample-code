package chrome;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class AssertandVerify {
	
	
	public static void main(String[] args){
		
		String name ="Vicky";
		boolean value= true;
		
		int value1= 123;
		
		// Assert method also called Hard assert method
		Assert.assertEquals(name, "Vicky");
		System.out.println(" success assertEquals");
		
		Assert.assertNotEquals(name, "vicky");
		System.out.println(" success assertNotEqals");
		
		// Verify method also called as SoftAssert method
		SoftAssert assert1 = new SoftAssert();
		assert1.assertTrue(value, "");
		System.out.println("Success asserttrue");
		
		
		assert1.assertEquals(value1, "12");
		
		System.out.println("success value");
		
		Assert.assertEquals(name, "Vicky");
		
		assert1.assertFalse(false);
		System.out.println("Success assertfalse");
	}

}
