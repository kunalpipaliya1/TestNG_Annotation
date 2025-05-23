// Parameter to google search and valid the input

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_parametergooglesearch {
	
	@Test
	@Parameters({"keyword"})
	public void googlesearch(String searchdata) {
		// Launch browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		WebElement input = driver.findElement(By.id("APjFqb"));
		input.sendKeys(searchdata);
		Assert.assertEquals(searchdata, input.getAttribute("value"));

		
		driver.quit();
	}
	
}
