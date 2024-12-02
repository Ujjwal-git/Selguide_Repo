package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import utility.Reusable;

public class GmailAutomate {

	WebDriver driver = new ChromeDriver();

	@Test
	public void gmailAutomate() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();

		WebElement chooseFile = driver.findElement(By.xpath("//div//input[@id='uploadPicture']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", chooseFile);

		Thread.sleep(3000);
		String filePath = "D:\\Projects\\App_Test\\xyz.txt";
		chooseFile.sendKeys(filePath);
		
		Thread.sleep(3000);
		WebElement submitBtn = driver.findElement(By.xpath("//button[@id='submit']"));
		//submitBtn.click();
		WebElement GenderCheckBox = driver.findElement(By.xpath("//div//input[@id='gender-radio-1']"));
		//Reusable.waitForVisibility(driver, GenderCheckBox, 60);
		js.executeScript("arguments[0].scrollIntoView(true);", GenderCheckBox);
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", GenderCheckBox);
		//GenderCheckBox.click();
		
		
		

	}
	

}
