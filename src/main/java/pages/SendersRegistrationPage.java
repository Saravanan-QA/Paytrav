package pages;

import org.openqa.selenium.remote.RemoteWebDriver;
import com.relevantcodes.extentreports.ExtentTest;

import wrappers.AppWrappers;

public class SendersRegistrationPage extends AppWrappers{

	public SendersRegistrationPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!isExistByXpath(prop.getProperty("SendersRegistration.Header.Xpath"))){
			reportStep("This is not Paytrav Senders Registration Page", "FAIL");
		}
	}
	
	public SendersRegistrationPage enterFirstName(String fName){
		enterByXpath(prop.getProperty("SendersRegistration.FirstName.Xpath"), fName);
		return this;
	}
	public SendersRegistrationPage enterLastName(String lName){
		enterByXpath(prop.getProperty("SendersRegistration.LastName.Xpath"), lName);
		return this;
	}
	
	public SendersRegistrationPage enterPincode(String pCode){
		enterByXpath(prop.getProperty("SendersRegistration.Pincode.Xpath"), pCode);
		return this;
	}

	public SendersRegistrationPage enterAddress(String address){
		enterByXpath(prop.getProperty("SendersRegistration.Address.Xpath"), address);
		return this;
	}
	
	public SendersRegistrationPage enterOTP(String otp){
		enterByXpath(prop.getProperty("SendersRegistration.OTP.Xpath"), otp);
		return this;
	}
	
	
	public SendersRegistrationPage clickAcceptTerms() {
		clickByXpath(prop.getProperty("SendersRegistration.AcceptTerms.Xpath"));
		return this;
	}

	
	public SendersRegistrationPage clickRegister() {
		clickByXpath(prop.getProperty("SendersRegistration.Register.Xpath"));
		return this;
	}
	
	public SendersRegistrationPage enterName(String name){
		enterByXpath(prop.getProperty("SendersRegistration.Name.Xpath"), name);
		return this;
	}
	

	public SendersRegistrationPage clickSubmit() {
		clickByXpath(prop.getProperty("SendersRegistration.OTPSubmit.Xpath"));
		return this;
	}
	
	
}
