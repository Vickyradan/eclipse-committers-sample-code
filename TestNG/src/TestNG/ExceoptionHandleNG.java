package TestNG;

import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadTimeoutException;

public class ExceoptionHandleNG {
	@Test(timeOut=2000,expectedExceptions=ThreadTimeoutException.class)
	public void sample () throws InterruptedException{
		
		Thread.sleep(3000);
		System.out.println("success");
	}

}
