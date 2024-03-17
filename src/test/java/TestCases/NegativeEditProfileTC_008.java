package TestCases;

import org.testng.annotations.Test;

import PageObject.NegativeEditProfile;
import UtilitiesInsurance.BaseClassInsu;

public class NegativeEditProfileTC_008 extends BaseClassInsu{

   @Test	
public void negative() throws InterruptedException {
		
	   NegativeEditProfile obj2 = new NegativeEditProfile(driver);
		obj2.Email();
		Thread.sleep(2000);
		obj2.Password();
		Thread.sleep(2000);
		obj2.Login();
		Thread.sleep(2000);
		obj2.EditProfilee();
		Thread.sleep(2000);
		obj2.Title();
		Thread.sleep(2000);
		obj2.Surname();
		Thread.sleep(2000);
		obj2.Firstname();
		Thread.sleep(2000);
		obj2.Phone();
		Thread.sleep(2000);
		obj2.BirthYear();
		Thread.sleep(2000);
		obj2.BirthMonth();
		Thread.sleep(2000);
		obj2.BirthDay();
		Thread.sleep(2000);
		obj2.LincenceType();
		Thread.sleep(2000);
		obj2.LincencePeriod();
		Thread.sleep(2000);
		obj2.Occuption();
		Thread.sleep(2000);
		obj2.AddressStreet();
		Thread.sleep(2000);
		obj2.City();
		Thread.sleep(2000);
		obj2.Country();
		Thread.sleep(2000);
		obj2.PostCode();
		Thread.sleep(2000);
		obj2.UpdateUser();
		Thread.sleep(2000);
		
		
		
	}
	
}
