package PageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.BasePage;

public class OrderFormPayment extends BasePage{

	public WebDriver driver;

	By paybycheck = By.xpath("//span[text()='Pay by Check']");
	By paybybankwire = By.xpath("//span[text()='Pay by bank wire']");
	By termsAndConditioncheckbox = By.xpath("//input[@id='conditions_to_approve[terms-and-conditions]']");
	By orderBtn = By.xpath("//button[contains(text(),'Order with an')]");

	public OrderFormPayment() throws IOException {
		super();
	}

	public WebElement getPaybycheck() throws InterruptedException, IOException {
		this.driver=getdriver();
		return driver.findElement(paybycheck);
	}

	public WebElement getPaybyBankwire() throws InterruptedException, IOException {
		this.driver=getdriver();
		return driver.findElement(paybybankwire);
	}

	public WebElement getTermsAndConditioncheckbox() throws InterruptedException, IOException {
		this.driver=getdriver();
		return driver.findElement(termsAndConditioncheckbox);
	}

	public WebElement getOrderBtn() throws InterruptedException, IOException {
		this.driver=getdriver();
		return driver.findElement(orderBtn);
	}
}
