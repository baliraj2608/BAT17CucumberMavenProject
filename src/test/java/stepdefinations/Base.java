package stepdefinations;

import org.openqa.selenium.WebDriver;

import pageObject.AddNewCustomerPage;
import pageObject.AdminPage;
import pageObject.Vendor;
import utilities.ReadConfig;

public class Base {

	public WebDriver driver;
	
	public AdminPage ad;
	
	public AddNewCustomerPage addCust;
	
	public ReadConfig readConfig;
	
	public Vendor vendor;
}
