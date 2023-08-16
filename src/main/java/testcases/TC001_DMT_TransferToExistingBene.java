package testcases;

import java.util.List;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import wrappers.AppWrappers;

public class TC001_DMT_TransferToExistingBene extends AppWrappers{

	@BeforeClass
	public void setData() {
		testCaseName="Money Transfer to Existing Beneficiary";
		testDescription="Money Transfer to Existing Beneficiary";
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
		.enterSendersNo(sendersNo)
		.clickLoginSignup()
		.selectBank(bank)
		.enterAmount(amount)
		.clickPaynow()
		.enterRemarks(remarks);
		//.clickPay()
		//.getTransactionDetails();
		//System.out.println(tDetails);
		Thread.sleep(20000);
	}

}
