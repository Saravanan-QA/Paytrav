package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SendersRegistrationPage;
import wrappers.AppWrappers;

public class TC004_DMT_DMT2SendersRegistration extends AppWrappers{

	@BeforeClass
	public void setData() {
		testCaseName="DMT2 Senders Registration";
		testDescription="DMT2 Senders Registration";
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
		.selectDMT("DMT2")
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
