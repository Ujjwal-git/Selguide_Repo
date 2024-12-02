package testcases;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import buisinesslogic.LoginPageRepo;
import generic.Sample;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

public class LoginTest extends Sample{

	
	@Test
    @Description("This is a sample test for Allure reporting.")
    @Severity(SeverityLevel.CRITICAL)
	@Epic("Epic Name")
	@Feature("Feature Name")
	public void loginTest()
	{
		 openBrowser();
		
		 LoginPageRepo lpr=new LoginPageRepo();
		 lpr.LoginPageRepo("123","321");
		 
		
	}
}
