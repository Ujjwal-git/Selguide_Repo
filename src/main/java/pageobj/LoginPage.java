package pageobj;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	
	
	@FindBy(xpath="//input[@id='user-name']")
	private WebElement USER_NAME;

	@FindBy(xpath="//input[@id='password']")
	private WebElement USER_PASS;
	
	@FindBy(xpath="//input[@id='login-button']")
	private WebElement USER_LOGIN_BTN;
	
	public WebElement getUSER_NAME()
	{
		return USER_NAME;
	}
	
	public WebElement getUSER_PASS()
	{
		return USER_PASS;
	}
	public WebElement getLOGIN_BTN()
	{
		return USER_LOGIN_BTN;
	}
}
