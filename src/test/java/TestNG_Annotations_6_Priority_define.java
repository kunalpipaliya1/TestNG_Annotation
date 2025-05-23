import org.testng.annotations.Test;

public class TestNG_Annotations_6_Priority_define {
	
	@Test(priority=1)
	public void getrequest1() {
		System.out.println("This is a Priority_define_testcase1");
	}
	
	@Test(priority=0)
	public void getrequest2() {
		System.out.println("This is a Priority_define_testcase2");
	}

}
