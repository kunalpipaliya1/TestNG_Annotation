import org.testng.annotations.*;

public class TestNG_Annotations_1 {
	
	@BeforeTest // Runs before <test> tag in testng.xml.
	public void BeforeTest() {
		System.out.println("This is a Before Test1...Testcase23");
	}
	
	@AfterTest // Runs after <test> tag in testng.xml.
	public void AfterTest() {
		System.out.println("This is a After Test2...Testcase23");
	}

	@BeforeSuite // Runs once before all tests in the suite.
	public void BeforeSuite() {
		System.out.println("This is a Before Suite...Testcase23");
	}
	
	@AfterSuite // Runs once after all tests in the suite.
	public void AfterSuite() {
		System.out.println("This is a After Suite...Testcase23");
	}
	
	@BeforeClass // Runs once before any methods in the current class.
	public void BeforeClass() {
		System.out.println("This is a Before Class...Testcase23");
	}
	
	@AfterClass // Runs once after all methods in the current class.
	public void AfterClass() {
		System.out.println("This is a After Class...Testcase23");
	}
	
	@BeforeMethod // Runs before each @Test method.
	public void BeforeMethod() {
		System.out.println("This is a Before method...Testcase23");
	}
	
	@AfterMethod // Runs after each @Test method.
	public void AfterMethod() {
		System.out.println("This is a After method...Testcase23 \n");
	}
	
	@Test
	public void getrequest1() {
		System.out.println("This is a Test1...Testcase23");
	}
	
	@Test
	public void getrequest2() {
		System.out.println("This is a Test2...Testcase23");
	}

}
