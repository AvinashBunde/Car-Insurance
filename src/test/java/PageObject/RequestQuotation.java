package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RequestQuotation {

	WebDriver driver;
	public RequestQuotation (WebDriver rdriver) {
		
		driver = rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath="//input[@id='email']")
	WebElement txtemail;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement txtpassword;
	
	@FindBy(xpath="//input[@name='submit']")
	WebElement txtlogin;
	
	@FindBy(linkText="Request Quotation")
	WebElement txtrequestquotation;
	
	@FindBy(xpath="//select[@id='quotation_breakdowncover']")
	WebElement txtbreakdowncover;
	
	@FindBy(xpath="//input[@id='quotation_windscreenrepair_t']")
	WebElement txtwindscreenrepair;
	
	@FindBy(xpath="//input[@id='quotation_incidents']")
	WebElement txtincidents;
	
	@FindBy(xpath="//input[@id='quotation_vehicle_attributes_registration']")
	WebElement txtregistration;
	
	@FindBy(xpath="//input[@id='quotation_vehicle_attributes_mileage']")
	WebElement txtmileage;
	
	@FindBy(xpath="//input[@id='quotation_vehicle_attributes_value']")
	WebElement txtestimatevalue;
	
	@FindBy(xpath="//select[@id='quotation_vehicle_attributes_parkinglocation']")
	WebElement txtparkinglocation;
	
	@FindBy(xpath="//select[@id='quotation_vehicle_attributes_policystart_1i']")
	WebElement txtyear;
	
	@FindBy(xpath="//select[@id='quotation_vehicle_attributes_policystart_2i']")
	WebElement txtmonth;
	
	@FindBy(xpath="//select[@id='quotation_vehicle_attributes_policystart_3i']")
	WebElement txtday;
	
	@FindBy(xpath="//input[@value='Calculate Premium']")
	WebElement txtcalculatepremium;
	
	@FindBy(xpath="//input[@name='submit']")
	WebElement txtsave;
	
	public void Email() {
		txtemail.sendKeys("bundeavinash5@gmail.com");
	}
	
	public void Password() {
		txtpassword.sendKeys("bsgha#jsj12");
	}
	
	public void Login() {
		txtlogin.click();
	}
	
	public void RequestQuotations() {
		txtrequestquotation.click();
	}
	
	public void Breakdowncover() {
		Select a = new Select (txtbreakdowncover);
		a.selectByVisibleText("Roadside");
	}
	
	public void Windscreenrepair() {
		txtwindscreenrepair.click();
	}
	
	public void Incidents() {
		txtincidents.sendKeys("car crash");
	}
	
	public void Registration() {
		txtregistration.sendKeys("MH0781");
	}
	
	public void AnnualMileage() {
		txtmileage.sendKeys("87");
	}
	
	public void EstimatedValue() {
		txtestimatevalue.sendKeys("80000");
	}
	
	public void ParkingLocation() {
	     Select b = new Select (txtparkinglocation);
	     b.selectByVisibleText("Public Place");
	}
	
	public void PolicyYear() {
		Select c = new Select(txtyear);
		c.selectByVisibleText("2015");
	}
	
	public void PolicyMonth() {
		Select d = new Select(txtmonth);
		d.selectByVisibleText("May");
	}
	
	public void PolicyDay() {
		Select e = new Select(txtday);
		e.selectByIndex(5);
	}
	
	public void CalculatePremium() {
		txtcalculatepremium.click();
	}
	
	public void SaveQuotation() {
		txtsave.click();	
	}
	
	
	
}
