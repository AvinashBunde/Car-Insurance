package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginLogOutPage {
	
	WebDriver driver;
	public LoginLogOutPage(WebDriver rdriver) {
		
		driver = rdriver;
		PageFactory.initElements(rdriver,this);
		
	}

	@FindBy(xpath="//input[@id='email']")
	WebElement txtemail;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement txtpassword;
	
	@FindBy(xpath="//input[@name='submit']")
	WebElement txtlogin;
	
	@FindBy(linkText="Profile")
	WebElement txtprofile;
	
	@FindBy(xpath="//input[@value='Log out']")
	WebElement txtlogout;
	
	public void Email() {
		txtemail.sendKeys("bundeavinash5@gmail.com");
	}
	
	public void Password() {
		txtpassword.sendKeys("bsgha#jsj12");
	}
	
	public void Login() {
		txtlogin.click();
	}
	
	public void Profile() {
		txtprofile.click();
	}
	
	public void LogOut() {
		txtlogout.click();
	}
	
	
}
