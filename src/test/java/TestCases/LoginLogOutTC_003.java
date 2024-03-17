package TestCases;

import org.testng.annotations.Test;

import PageObject.LoginLogOutPage;
import UtilitiesInsurance.BaseClassInsu;

public class LoginLogOutTC_003 extends BaseClassInsu{

	@Test
	public void setuppage() throws InterruptedException{
		
		LoginLogOutPage obj = new LoginLogOutPage(driver);
		obj.Email();
		Thread.sleep(2000);
		obj.Password();
		Thread.sleep(2000);
		obj.Login();
		Thread.sleep(2000);
		obj.Profile();
		Thread.sleep(2000);
		obj.LogOut();
		Thread.sleep(4000);
		

	}
}
