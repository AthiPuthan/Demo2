package PageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.BasePage;

public class OrderFormShippingMethod extends BasePage{
	
	public WebDriver driver;
	
	By deliverMsgTextbox = By.xpath("//textarea[@name='delivery_message']");
	By continuebtn = By.xpath("//button[@name='confirmDeliveryOption']");

	public OrderFormShippingMethod() throws IOException {
		super();
	}

	public WebElement getdeliverMsgTextBox() throws InterruptedException, IOException {
		this.driver=getdriver();
		return driver.findElement(deliverMsgTextbox);
	}

	public WebElement getContinueButton() throws InterruptedException, IOException {
		this.driver=getdriver();
		return driver.findElement(continuebtn);
	}


}
