package testcases;

import java.util.List;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.SendersRegistrationPage;
import wrappers.AppWrappers;

public class TC002_DMT_DMT1SendersRegistration extends AppWrappers{

	@BeforeClass
	public void setData() {
		testCaseName="DMT1 Senders Registration";
		testDescription="DMT1 Senders Registration";
		browserName="chrome";
		dataSheetName="TC001";
		category="Smoke";
		authors="Saravanan";
	}

	@Test(dataProvider="fetchData")
	public void login(String username, String password, String otp, String sendersNo, String bank, String amount, String remarks) throws InterruptedException{
		/*List<String> tDetails=*/new LoginPage(driver, test)
		.clickPartnerLogin()
		.enterUserName(username)
		.enterPassword(password)
		.clickLogin()
		.enterOTP(otp)
		.clickSubmit()
		.clickMoneyTransfer()
		.enterSendersNo("7305973797")
		.clickLoginSignup();
		new SendersRegistrationPage(driver, test)
		.enterFirstName("Test")
		.enterLastName("Name")
		.enterPincode("620018")
		.enterAddress("Trichy")
		.enterOTP(otp)
		.clickAcceptTerms()
		.clickRegister();
		
		Thread.sleep(20000);
	}

}
