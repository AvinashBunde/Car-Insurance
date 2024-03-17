package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RetriveQuotation {

	
	WebDriver driver;
	public RetriveQuotation(WebDriver rdriver) {
		
		driver = rdriver;
		PageFactory.initElements(rdriver,this);
		
	}

	@FindBy(xpath="//input[@id='email']")
	WebElement txtemail;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement txtpassword;
	
	@FindBy(xpath="//input[@name='submit']")
	WebElement txtlogin;
	
	@FindBy(linkText="Retrieve Quotation")
	WebElement txtretrivequotation;
	
	@FindBy(xpath="//input[@size='25']")
	WebElement txtnumber;
	
	@FindBy(xpath="//input[@id='getquote']")
	WebElement txtretrivebutton;
	
	
	public void Email() {
		txtemail.sendKeys("bundeavinash5@gmail.com");
	}
	
	public void Password() {
		txtpassword.sendKeys("bsgha#jsj12");
	}
	
	public void Login() {
		txtlogin.click();
	}
	
	public void RetriveQuotations() {
		txtretrivequotation.click();
	}
	
	public void Number() {
		txtnumber.sendKeys("77439");
	}
	
	public void RetriveButton() {
		txtretrivebutton.click();
	}
	
}
