package buisinesslogic;

import org.openqa.selenium.support.PageFactory;

import generic.Sample;
import pageobj.LoginPage;

public class LoginPageRepo extends Sample{
	
	LoginPage loginpage;
	
	public LoginPageRepo()
	{
	//creating obj of loginpage
	 loginpage= PageFactory.initElements(driver, LoginPage.class);
	
	}
	
	public void LoginPageRepo(String userName, String userpass)
	{
	loginpage.getUSER_NAME().sendKeys(userName);
	loginpage.getUSER_PASS().sendKeys(userpass);
	loginpage.getLOGIN_BTN().click();
	
	
	}
	
	
	
	
}
