package TestCases;

import org.testng.annotations.Test;

import PageObject.NegativeLoginPage;
import UtilitiesInsurance.BaseClassInsu;

public class LoginNegativeTC_004 extends BaseClassInsu{

	@Test
	public void set() throws InterruptedException {
		
		NegativeLoginPage obj = new NegativeLoginPage(driver);
		obj.Email();
		Thread.sleep(2000);
		obj.Password();
		Thread.sleep(2000);
		obj.Login();
		Thread.sleep(2000);


	}
	
}
