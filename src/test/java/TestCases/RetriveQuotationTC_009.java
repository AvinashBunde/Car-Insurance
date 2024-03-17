package TestCases;

import org.testng.annotations.Test;

import PageObject.RetriveQuotation;
import UtilitiesInsurance.BaseClassInsu;

public class RetriveQuotationTC_009 extends BaseClassInsu {

	@Test
public void sett() throws InterruptedException {
		
	RetriveQuotation obj = new RetriveQuotation(driver);
		obj.Email();
		Thread.sleep(2000);
		obj.Password();
		Thread.sleep(2000);
		obj.Login();
		Thread.sleep(2000);
		obj.RetriveQuotations();
		Thread.sleep(2000);
		obj.Number();
		Thread.sleep(2000);
		obj.RetriveButton();
		Thread.sleep(2000);



	}
}
