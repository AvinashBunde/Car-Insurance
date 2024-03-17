package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NegativeLoginPage {
	
	
	WebDriver driver;
	public NegativeLoginPage(WebDriver rdriver) {
		driver = rdriver;
		PageFactory.initElements(rdriver,this);	
	}
	
	@FindBy(xpath="//input[@id='email']")
	WebElement txtemail;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement txtpassword;
	
	@FindBy(xpath="//input[@name='submit']")
	WebElement txtlogin;
	
	
	public void Email() {
		txtemail.sendKeys("bundeavinash@.com");
	}
	
	public void Password() {
		txtpassword.sendKeys("jbhjs3n");
	}
	
	public void Login() {
		txtlogin.click();
	}
	

}
