package pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.AppWrappers;

public class MoneyTransferPage extends AppWrappers{

	public MoneyTransferPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!isExistByXpath(prop.getProperty("MoneyTransfer.SenderMobile.Xpath"))){
			reportStep("This is not Paytrav Money Transfer Page", "FAIL");
		}
	}

	public MoneyTransferPage enterSendersNo(String number){
		enterByXpath(prop.getProperty("MoneyTransfer.SenderMobile.Xpath"), number);
		return this;
	}

	public MoneyTransferPage clickLoginSignup() {
		clickByXpath(prop.getProperty("MoneyTransfer.LoginSignup.Xpath"));
		return this;
	}

	public MoneyTransferPage selectBank(String bank) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//input[@id='"+bank.toLowerCase()+"'])[last()]/.."))));
		driver.findElement(By.xpath("(//input[@id='"+bank+"'])[last()]/..")).click();
		return this;
	}
	
	public MoneyTransferPage selectDMT(String dmt) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[text()='"+dmt+"']/.."))));
		driver.findElement(By.xpath("//span[text()='"+dmt+"']/..")).click();
		return this;
	}
	
	public MoneyTransferPage enterAmount(String amount){
		enterByXpath(prop.getProperty("MoneyTransfer.Amount.Xpath"), amount);
		return this;
	}

	public MoneyTransferPage clickPaynow() {
		clickByXpath(prop.getProperty("MoneyTransfer.Paynow.Xpath"));
		return this;
	}

	public MoneyTransferPage enterRemarks(String remarks) {
		enterByXpath(prop.getProperty("MoneyTransfer.Remarks.Xpath"), remarks);
		return this;
	}

	public MoneyTransferPage clickPay() {
		clickByLinkText(prop.getProperty("MoneyTransfer.Pay.LinkText"));
		return this;
	}
	
	public List<String> getTransactionDetails() {
		String transactionId=driver.findElement(By.xpath("//p[text()='Transaction Id']/following-sibling::P")).getText();
		String amount=driver.findElement(By.xpath("(//p[text()='Amount ']/following-sibling::p)[last()]")).getText();
		String utrNo=driver.findElement(By.xpath("(//p[text()='UTR No']/following-sibling::p)[last()]")).getText();
		String status=driver.findElement(By.xpath("(//p[text()='Status']/following-sibling::p)[last()]")).getText();

		List<String> transactionDetails=new ArrayList<String>();
		transactionDetails.add(transactionId);
		transactionDetails.add(amount);
		transactionDetails.add(utrNo);
		transactionDetails.add(status);
		
		return transactionDetails;
	}

	public MoneyTransferPage ClickYes() throws InterruptedException {
		Thread.sleep(2000);
		clickByXpath(prop.getProperty("MoneyTransfer.PopupYes.Xpath"));
		return this;
	}
}
