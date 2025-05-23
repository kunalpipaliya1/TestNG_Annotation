// TestNG Parameters

import org.testng.annotations.*;
public class TestNG_Annotations_4_Parameter {
	
	@Test
	@Parameters({"i","j"})
	public void add(int a, int b) {
		System.out.println("Addition: " + (a+b));
	}
	
	@Test
	@Parameters({"i","j"})
	public void subtraction(int a, int b) {
		System.out.println("subtraction: " + (a-b));
	}
	
	@Test
	@Parameters({"i","j"})
	public void multiplication(int a, int b) {
		System.out.println("multiplication: " + (a*b));
	}

}
