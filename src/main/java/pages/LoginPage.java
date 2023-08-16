package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.AppWrappers;

public class LoginPage extends AppWrappers  {

	public LoginPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("B2B Travel portal development service in India")){
			reportStep("This is not Paytrav Login Page", "FAIL");
		}
	}

	 
	public LoginPage clickPartnerLogin() {
		clickByXpath(prop.getProperty("Login.PartnerLogin.Xpath"));
		switchToLastWindow();
		return this;
	}

	
	public LoginPage enterUserName(String name){
		enterById(prop.getProperty("Login.UserName.Id"), name);
		return this;
	}

	
	public LoginPage enterPassword(String password){
		enterById(prop.getProperty("Login.Password.Id"), password);
		return this;
	}


	public LoginPage clickLogin() {
		clickById(prop.getProperty("Login.LoginButton.Id"));
		return this;
	}
	
	public LoginPage enterOTP(String otp) {
		enterByXpath(prop.getProperty("Login.OTP.Xpath"), otp);
		return this;
	}
	
	public HomePage clickSubmit() {
		clickById(prop.getProperty("Login.OTPSubmit.Id"));
		return new HomePage(driver, test);
	}
	
	
	
	
	

}
