package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class abcTest {

	
	@Test
	public void testSample()
	{
		WebDriver driver=new ChromeDriver();
		System.out.println("Simple ");
		driver.get("https://www.saucedemo.com/");
        String expectedTitle = "Example Domain";

        // Assert the title
        Assert.assertEquals(driver.getTitle(), expectedTitle, "Title validation failed!");
	}
	
	
}
