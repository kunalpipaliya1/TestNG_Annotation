// TestNG Annotations attributes : - description, priority, enabled, dependsOnMethod, timeout

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG_Annotations_3_Attributes {

//	@Test(description="This is Mobile Login", priority=1) // Multiple Annotations Attributes
//	@Test(priority=2) // priority which low is execute first
	@Test(enabled=true) // If we don't run Test case we need to set false either true
	public void MobileLogin() {
		long start = System.currentTimeMillis();
		System.out.println("Mobile login  Passed....!!!");
		long stop = System.currentTimeMillis();
		System.out.println("Mobile login  Passed....!!!" + (stop - start) + "ms"); // to check how much time taken to execute the Testcase
		
	}
	
//	@Test(description="This is Web Login", priority=0, timeOut=200) // Multiple Annotations Attributes
	
//	@Test(timeOut=2000000)
//	@Test(priority=0) // priority which low is execute first
//	@Test(dependsOnMethods= {"MobileLogin"})
	@Test(enabled=false) // If we don't run Test case we need to set false either true
	public void webLogin() throws InterruptedException {
		long start = System.currentTimeMillis();
		Thread.sleep(1000);
		long stop = System.currentTimeMillis();

		System.out.println("Web login  Passed....!!!");
		System.out.println("Web login  Passed....!!!" + (stop - start) + "ms"); // to check how much time taken to execute the Testcase

	}
	
//	@Test(description="This is API Login", priority=2)
//	@Test(priority=1) // priority which low is execute first
	@Test // (dependsOnMethods= {"webLogin", "MobileLogin"})
	public void APILogin() {
		long start = System.currentTimeMillis();
		long stop = System.currentTimeMillis();


		System.out.println("API login  Passed....!!!");
		System.out.println("API login  Passed....!!!" + (stop - start) + "ms"); // to check how much time taken to execute the Testcase
		Assert.assertTrue(false, "API Login Assert");
	}



}