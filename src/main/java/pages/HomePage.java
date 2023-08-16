package pages;

import org.openqa.selenium.remote.RemoteWebDriver;
import com.relevantcodes.extentreports.ExtentTest;

import wrappers.AppWrappers;

public class HomePage extends AppWrappers{

	public HomePage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("#1 B2B Travel Booking Portal | Agent Distributor Login | paytrav.in")){
			reportStep("This is not Paytrav Home Page", "FAIL");
		}
	}
	
	public MoneyTransferPage clickMoneyTransfer() {
		clickByXpath(prop.getProperty("Home.MoneyTransfer.Xpath"));
		return new MoneyTransferPage(driver,test);

	}



}
