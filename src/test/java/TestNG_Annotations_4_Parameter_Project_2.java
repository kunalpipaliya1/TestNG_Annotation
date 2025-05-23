import org.testng.annotations.*;

public class TestNG_Annotations_4_Parameter_Project_2 {

	@Test
	@Parameters({"Software Company"})

	public void automobile(String name) {
		System.out.println("Project_2: " + name);
	}
}
