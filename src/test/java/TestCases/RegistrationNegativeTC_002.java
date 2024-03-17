package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObject.NegativeRegistrationPage;
import UtilitiesInsurance.BaseClassInsu;

public class RegistrationNegativeTC_002 extends BaseClassInsu{

   @Test	
	
public void firstname() throws InterruptedException, IOException {
		
	NegativeRegistrationPage obj = new NegativeRegistrationPage(driver);
	    obj.Registration();
	    Thread.sleep(2000);
	    obj.Title();
	    Thread.sleep(2000);
	    obj.FirstName();
	    Thread.sleep(2000);
	    obj.Surname();
	    Thread.sleep(2000);
	    obj.Phone();
	    Thread.sleep(2000);
	    obj.YearBirth();
	    Thread.sleep(2000);
	    obj.MonthBirth();
	    Thread.sleep(2000);
	    obj.DayBirth();
	    Thread.sleep(2000);
	    obj.Full();
	    Thread.sleep(2000);
	    obj.LicencePeriod();
	    Thread.sleep(2000);
	    obj.Occuption();
	    Thread.sleep(2000);
	    obj.AddressStreet();
	    Thread.sleep(2000);
	    obj.City();
	    Thread.sleep(2000);
	    obj.Country();
	    Thread.sleep(2000);
	    obj.Postcode();
	    Thread.sleep(2000);
	    obj.Email();
	    Thread.sleep(2000);
	    obj.Password();
	    Thread.sleep(2000);
	    obj.ConfirmPassword();
	    Thread.sleep(2000);
	    obj.Create();
	    Thread.sleep(2000);
	    obj.ScrenShot();
	    Thread.sleep(2000);

	   
		
	}
	

}
