package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SeleniumTestWithFailureEmail {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Set the path to the chromedriver executable
        // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
//        String expectedTitle = "Example Domain";
//
//        // Assert the title
//        Assert.assertEquals(driver.getTitle(), expectedTitle, "Title validation failed!");
    }
    
    @Test
    public void check()
    {
    	
    	 driver.get("https://www.saucedemo.com/");
         String expectedTitle = "Example Domain";

         // Assert the title
         Assert.assertEquals(driver.getTitle(), expectedTitle, "Title validation failed!");
    }



}
