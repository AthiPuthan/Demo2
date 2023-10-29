package PageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.BasePage;

public class ShopContentsPage extends BasePage{
	
	public WebDriver driver;
	
	By continueShopping=By.xpath("//button[contains(text(),'Conti')]");
	
	By proceedToCheckout=By.xpath("//a[contains(@class,'btn btn-primary')]");
	
	public ShopContentsPage() throws IOException
	{
		super();
	}
	
	public WebElement getContinueShoppingBtn() throws InterruptedException, IOException
	{
		this.driver=getdriver();
		return driver.findElement(continueShopping);
	}
	
	public WebElement getProceedToChekoutBtn() throws InterruptedException, IOException
	{
		this.driver=getdriver();
		return driver.findElement(proceedToCheckout);
	}
	

}
