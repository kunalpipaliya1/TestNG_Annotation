import org.testng.annotations.*;

public class TestNG_Annotations_5_GroupAttributes {
	
	@Test(groups="Software Company")
	public void Wipro() {
		System.out.println("Wipro");
	}
	
	@Test(groups="Software Company")
	public void Infosys() {
		System.out.println("Infosys");
	}
	
	
	@Test(groups="Automobile")
	public void Maruti() {
		System.out.println("Maruti");
	}
	
	@Test(groups="Automobile")
	public void TATA() {
		System.out.println("TATA");
	}
	
}
