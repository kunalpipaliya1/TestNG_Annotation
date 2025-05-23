import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNG_Annotations_2 {
	
	@BeforeSuite // Runs once before all tests in the suite.
	public void BeforeSuite() {
		System.out.println("This is a Before Suite...Testcase24");
	}
	
	@AfterSuite // Runs once after all tests in the suite.
	public void AfterSuite() {
		System.out.println("This is a After Suite...Testcase24");
	}
	
	@BeforeClass // Runs once before any methods in the current class.
	public void BeforeClass() {
		System.out.println("This is a Before Class...Testcase24");
	}
	
	@AfterClass // Runs once after all methods in the current class.
	public void AfterClass() {
		System.out.println("This is a After Class...Testcase24");
	}
	
	@BeforeMethod // Runs before each @Test method.
	public void BeforeMethod() {
		System.out.println("This is a Before method...Testcase24");
	}
	
	@AfterMethod // Runs after each @Test method.
	public void AfterMethod() {
		System.out.println("This is a After method...Testcase24");
	}
	
	@Test
	public void getrequest1() {
		System.out.println("This is a Test1...Testcase24");
	}
	
	@Test
	public void getrequest2() {
		System.out.println("This is a Test2...Testcase24");
	}

}
