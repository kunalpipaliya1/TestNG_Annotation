import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_Annotation_7_data_provider {
	
	// 1. India Gujarat
	// 2. India Chennai
	// 2. India Delhi
	
	@DataProvider(name = "Searchdataset")
	public Object[][] searchdatademo() {
		Object[][] searchname = new Object[3][2]; // 3 row, 2 column
		searchname[0][0] = "India";
		searchname[0][1] = "Gujarat";

		searchname[1][0] = "India";
		searchname[1][1] = "Chennai";

		searchname[2][0] = "India";
		searchname[2][1] = "Delhi";
		
		return searchname;

	}
	@Test(dataProvider="Searchdataset")
	public void Dataprovidergooglesearch(String country, String mount) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		WebElement input = driver.findElement(By.id("APjFqb"));
		input.sendKeys(country + " " + mount);
		
		driver.findElement(By.name("btnK")).submit();
		
		Thread.sleep(5000);
		
	}

}
