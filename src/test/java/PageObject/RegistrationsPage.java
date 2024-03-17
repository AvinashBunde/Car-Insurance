package PageObject;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class RegistrationsPage {

	WebDriver driver;
	public RegistrationsPage(WebDriver rdriver)
	{
		driver = rdriver;
		PageFactory.initElements(rdriver,this);
		
	}
	
	@FindBy(linkText="Register")
	WebElement txtregitration;
	
	@FindBy(xpath="//select[@name='title']")
	WebElement txttitle;
	
	@FindBy(xpath="//input[@id='user_firstname']")
	WebElement txtname;
	
	@FindBy(xpath="//input[@id='user_surname']")
	WebElement txtsurname;
	
	@FindBy(xpath="//input[@id='user_phone']")
	WebElement txtphone;
	
	@FindBy(xpath="//select[@name='year']")
	WebElement txtyear;
	
	@FindBy(xpath="//select[@name='month']")
	WebElement txtmonth;
	
	@FindBy(xpath="//select[@name='date']")
	WebElement txtday;
	
	@FindBy(xpath="//input[@name='licencetype']")
	WebElement txtcheckbox;
	
	@FindBy(xpath="//select[@id='user_licenceperiod']")
	WebElement txtyears;
	
	@FindBy(xpath="//select[@id='user_occupation_id']")
	WebElement txtoccuption;
	
	@FindBy(xpath="//input[@id='user_address_attributes_street']")
	WebElement txtstret;
	
	@FindBy(xpath="//input[@id='user_address_attributes_city']")
	WebElement txtcity;
	
	@FindBy(xpath="//input[@id='user_address_attributes_county']")
	WebElement txtcountry;
	
	@FindBy(xpath="//input[@id='user_address_attributes_postcode']")
	WebElement txtpostcode;
	
	@FindBy(xpath="//input[@id='user_user_detail_attributes_email']")
	WebElement txtemail;
	
	@FindBy(xpath="//input[@id='user_user_detail_attributes_password']")
	WebElement txtpassword;
	
	@FindBy(xpath="//input[@id='user_user_detail_attributes_password_confirmation']")
	WebElement txtconfirmpassword;
	
	@FindBy(xpath="//input[@name='submit']")
	WebElement txtcreate;
	
	
	
	
	
	public void Registration()
	{
		txtregitration.click();	
	}
	
	public void Title() throws IOException 
	{
		Select a = new Select(txttitle);
		a.selectByVisibleText("Mr");
		File n =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(n, new File("C:\\Users\\avina\\OneDrive\\Desktop\\Personal Project\\Car Insurance Automation\\PS-Title.jpg"));	
	}
	
	public void FirstName() 
	{
		txtname.sendKeys("Avinash");
	}
	
	public void Surname() 
	{
		txtsurname.sendKeys("Bunde");
	}
	
	public void Phone() 
	{
		txtphone.sendKeys("7756879945");
	}
	
	public void YearBirth() 
	{
	  Select b = new Select(txtyear);
	  b.selectByVisibleText("1995");
	}
	
	public void MonthBirth()
	{
		Select c = new Select(txtmonth);
		c.selectByVisibleText("April");
	}
	
	public void DayBirth() 
	{
		Select d = new Select(txtday);
		d.selectByIndex(3);
	}
	
	public void Full() 
	{
		txtcheckbox.click();
	}
	
	public void LicencePeriod() 
	{
		Select e = new Select(txtyears);
		e.selectByIndex(1);
	}
	
	public void Occuption() 
	{
		Select f = new Select(txtoccuption);
		f.selectByVisibleText("Student");
	}
	
	public void AddressStreet() 
	{
		txtstret.sendKeys("T.corner SantFransisco");
	}
	
	public void City() throws IOException 
	{
		txtcity.sendKeys("paris");
		File o =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(o, new File("C:\\Users\\avina\\OneDrive\\Desktop\\Personal Project\\Car Insurance Automation\\PS-City.jpg"));
		
	}
	
	public void Country() throws IOException 
	{
		txtcountry.sendKeys("japan");
		File p =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(p, new File("C:\\Users\\avina\\OneDrive\\Desktop\\Personal Project\\Car Insurance Automation\\PS-Country.jpg"));
		
	}
	
	public void Postcode() 
	{
		txtpostcode.sendKeys("12345");
	}
	
	public void Email() 
	{
		txtemail.sendKeys("bundeavinash5@gmail.com");
	}
	
	public void Password() 
	{
		txtpassword.sendKeys("bsgha#jsj12");
	}
	
	public void ConfirmPassword() 
	{
		txtconfirmpassword.sendKeys("bsgha#jsj12");
	}
	
	public void Create() 
	{
		txtcreate.click();
	}
	
	public void ScrenShot() throws IOException 
	{
		File m =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(m, new File("C:\\Users\\avina\\OneDrive\\Desktop\\Personal Project\\Car Insurance Automation\\PS-Form.jpg"));
		
	}
	
	
	
}
