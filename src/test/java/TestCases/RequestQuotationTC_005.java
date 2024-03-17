package TestCases;

import org.testng.annotations.Test;

import PageObject.RequestQuotation;
import UtilitiesInsurance.BaseClassInsu;

public class RequestQuotationTC_005 extends BaseClassInsu{

	@Test
	public void requset() throws InterruptedException {
		
		RequestQuotation obj = new RequestQuotation(driver);
		
		
		obj.Email();
		Thread.sleep(2000);
		obj.Password();
		Thread.sleep(2000);
		obj.Login();
		Thread.sleep(2000);
		obj.RequestQuotations();
		Thread.sleep(2000);
		obj.Breakdowncover();
		Thread.sleep(2000);
		obj.Windscreenrepair();
		Thread.sleep(2000);
		obj.Incidents();
		Thread.sleep(2000);
		obj.Registration();
		Thread.sleep(2000);
		obj.AnnualMileage();
		Thread.sleep(2000);
		obj.EstimatedValue();
		Thread.sleep(2000);
		obj.ParkingLocation();
		Thread.sleep(2000);
		obj.PolicyYear();
		Thread.sleep(2000);
		obj.PolicyMonth();
		Thread.sleep(2000);
		obj.PolicyDay();
		Thread.sleep(2000);
		obj.CalculatePremium();
		Thread.sleep(2000);
		obj.SaveQuotation();
		Thread.sleep(5000);

		
	}
	
	
}
