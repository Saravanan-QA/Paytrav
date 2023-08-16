package testcases;

import java.util.List;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.SendersRegistrationPage;
import wrappers.AppWrappers;

public class TC003_DMT_DMTSendersRegistration extends AppWrappers{

	@BeforeClass
	public void setData() {
		testCaseName="DMT Senders Registration";
		testDescription="DMT Senders Registration";
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
		.selectDMT("DMT")
		.enterSendersNo("7305973797")
		.clickLoginSignup()
		.ClickYes();
		new SendersRegistrationPage(driver, test)
		.enterName("Saravanan")
		.enterPincode("620018")
		.enterAddress("Trichy")
		.clickAcceptTerms()
		.clickRegister()
		.enterOTP(otp)
		.clickSubmit();
		
		Thread.sleep(20000);
	}

}
