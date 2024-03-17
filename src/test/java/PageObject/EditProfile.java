package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class EditProfile {
	
	WebDriver driver;
	
	public EditProfile(WebDriver rdriver) { 
		
		driver = rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath="//input[@id='email']")
	WebElement txtemail;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement txtpassword;
	
	@FindBy(xpath="//input[@name='submit']")
	WebElement txtlogin;
	
	@FindBy(linkText="Edit Profile")
	WebElement txteditprofile;
	
	@FindBy(xpath="//select[@id='user_title']")
	WebElement txttitle;
	
	@FindBy(xpath="//input[@id='user_surname']")
	WebElement txtsurname;
	
	@FindBy(xpath="//input[@id='user_firstname']")
	WebElement txtfirstname;
	
	@FindBy(xpath="//input[@id='user_phone']")
	WebElement txtphone;
	
	@FindBy(xpath="//select[@id='user_dateofbirth_1i']")
	WebElement txtbirthyear;
	
	@FindBy(xpath="//select[@id='user_dateofbirth_2i']")
	WebElement txtbirthmonth;
	
	@FindBy(xpath="//select[@id='user_dateofbirth_3i']")
	WebElement txtbirthday;
	
	@FindBy(xpath="//input[@id='user_licencetype_f']")
	WebElement txtlincencetype;
	
	@FindBy(xpath="//select[@id='user_licenceperiod']")
	WebElement txtlincenceperiod;
	
	@FindBy(xpath="//select[@id='user_occupation_id']")
	WebElement  txtoccuption;
	
	@FindBy(xpath="//input[@id='user_address_attributes_street']")
	WebElement txtaddressstreet;
	
	@FindBy(xpath="//input[@id='user_address_attributes_city']")
	WebElement txtcity;
	
	@FindBy(xpath="//input[@id='user_address_attributes_county']")
	WebElement txtcountry;
	
	@FindBy(xpath="//input[@id='user_address_attributes_postcode']")
	WebElement txtpostcode;
	
	@FindBy(xpath="//input[@name='commit']")
	WebElement txtupdateuser;
	
	
   public void Email() {
	   txtemail.sendKeys("bundeavinash5@gmail.com");
   }
   
   public void Password() {
		txtpassword.sendKeys("bsgha#jsj12");
	}
	
	public void Login() {
		txtlogin.click();
	}
	
	
	public void EditProfilee() {
		txteditprofile.click();
	}
	
	public void Title() {
		Select a = new Select(txttitle);
		a.selectByVisibleText("Mr");
	}
	
	public void Surname() {
		txtsurname.sendKeys("Ann");
	}
	
	public void Firstname() {
		txtfirstname.sendKeys("Julia");
	}
	
	public void Phone() {
		txtphone.sendKeys("8743784786");
	}
	
	public void BirthYear() {
		Select b = new Select(txtbirthyear);
		b.selectByVisibleText("1986");
	}
	
	public void BirthMonth() {
		Select c = new Select(txtbirthmonth);
        c.selectByVisibleText("June"); 
	}
	
	public void BirthDay() {
		Select d = new Select(txtbirthday);
		d.selectByIndex(5);
	}
	
	public void LincenceType() {
		txtlincencetype.click();
	}
	
	public void LincencePeriod() {
		Select e = new Select(txtlincenceperiod);
		e.selectByIndex(6);
	}
	
	public void Occuption() {
		Select f = new Select(txtoccuption);
		f.selectByVisibleText("Actor");
	}
	
	public void AddressStreet() {
		txtaddressstreet.sendKeys("Y.corner opposite to school");
	}
	
	public void City() {
		txtcity.sendKeys("Space");
	}
	
	public void Country() {
		txtcountry.sendKeys("Jupitor");
	}
	
	public void PostCode() {
		txtpostcode.sendKeys("3345");
	}

	public void UpdateUser() {
		txtupdateuser.click();
	}
	
	
	
	
	
}
