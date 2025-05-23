import org.testng.annotations.*;

public class TestNG_Annotations_4_Parameter_Project_1 {

	@Test
	@Parameters({"Automobile"})

	public void automobile(String name) {
		System.out.println("Project_1: " + name);
	}
}
