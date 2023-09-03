package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage {

	public WebDriver ldriver;
	
	

	// java project we can use below statement to store web element
	// WebElement txtEmail1=driver.findElement(By.xpath("//input[@id='Email']"));

	public AdminPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver,this);
	}

	// maven project we can use below statement to store web element
	@FindBy(xpath = "//input[@id='Email']")
	WebElement txtEmail;

	@FindBy(xpath = "//input[@id='Password']")
	WebElement txtPassword;

	@FindBy(xpath = "//button[text()='Log in']")
	WebElement btnLogin;

	// user defined method to perform operation on above web element

	public void SetUsername(String uname) {
		txtEmail.clear();
		txtEmail.sendKeys(uname);
	}

	public void SetPassword(String pwd) {
		txtPassword.clear();
		txtPassword.sendKeys(pwd);
	}

	public void clickOnLogin() {
		btnLogin.click();
	}
}
