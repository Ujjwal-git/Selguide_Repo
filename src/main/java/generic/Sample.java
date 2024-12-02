package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample {

	public static WebDriver driver;

	public void openBrowser() {
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		String url = "https://www.saucedemo.com/v1/";
		driver.get(url);

	}

}
