package TestCases;

import org.testng.annotations.Test;

import PageObject.NegativeRequestQuotation;
import UtilitiesInsurance.BaseClassInsu;

public class NegativeRequestQuotationTC_006 extends BaseClassInsu{
	@Test
	public void Quotation() throws InterruptedException {
		
		NegativeRequestQuotation obj1 = new NegativeRequestQuotation(driver);
		
		obj1.Email();
		Thread.sleep(2000);
		obj1.Password();
		Thread.sleep(2000);
		obj1.Login();
		Thread.sleep(2000);
		obj1.RequestQuotations();
		Thread.sleep(2000);
		obj1.Breakdowncover();
		Thread.sleep(2000);
		obj1.Windscreenrepair();
		Thread.sleep(2000);
		obj1.Incidents();
		Thread.sleep(2000);
		obj1.Registration();
		Thread.sleep(2000);
		obj1.AnnualMileage();
		Thread.sleep(2000);
		obj1.EstimatedValue();
		Thread.sleep(2000);
		obj1.ParkingLocation();
		Thread.sleep(2000);
		obj1.PolicyYear();
		Thread.sleep(2000);
		obj1.PolicyMonth();
		Thread.sleep(2000);
		obj1.PolicyDay();
		Thread.sleep(2000);
		obj1.CalculatePremium();
		Thread.sleep(2000);
		obj1.SaveQuotation();
		Thread.sleep(5000);

		
	}

}
