package PageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.BasePage;

public class ShoppingCart extends BasePage{
	public WebDriver driver;

	By promocode = By.linkText("Have a promo code?");
	By promotextbox = By.xpath("//input[@name='discount_name']");
	By addbtn = By.xpath("//span[text()='Add']");
	By proceedTocheckoutbtn = By.xpath("//a[@class='btn btn-primary']");
	By deleteoneItem = By.xpath("//a[@data-id-product='1']//child::i");
	By deletetwoItem = By.xpath("//a[@data-id-product='2']//child::i");
	By totalValue = By.xpath("//span[text()='$45.24']");

	public ShoppingCart() throws Exception {
		super();
	}

	public WebElement getPromoCode() throws InterruptedException, IOException {
		this.driver=getdriver();
		return driver.findElement(promocode);
	}

	public WebElement getPromoTextBox() throws InterruptedException, IOException {
		this.driver=getdriver();
		return driver.findElement(promotextbox);
	}

	public WebElement getAddButton() throws InterruptedException, IOException {
		this.driver=getdriver();
		return driver.findElement(addbtn);
	}

	public WebElement getProceedToCheckoutButton() throws InterruptedException, IOException {
		this.driver=getdriver();
		return driver.findElement(proceedTocheckoutbtn);
	}

	public WebElement getDeleteOneItem() throws InterruptedException, IOException {
		this.driver=getdriver();
		return driver.findElement(deleteoneItem);
	}

	public WebElement getDeleteTwoItem() throws InterruptedException, IOException {
		this.driver=getdriver();
		return driver.findElement(deletetwoItem);
	}

	public WebElement getTotalValue() throws InterruptedException, IOException {
		this.driver=getdriver();
		return driver.findElement(totalValue);
	}

}
