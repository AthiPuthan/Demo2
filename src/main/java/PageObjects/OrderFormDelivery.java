package PageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.BasePage;

public class OrderFormDelivery extends BasePage{
	
	public WebDriver driver;
	
	By firstNameFeild=By.xpath("//input[@name='firstname']");
	By lastNameFeild=By.xpath("//input[@name='lastname']");
	By companyNameFeild=By.xpath("//input[@name='company']");
	By addressFeild=By.xpath("//input[@name='address1']");
	By addressComplementFeild=By.xpath("//input[@name='address2']");
	By cityFeild=By.xpath("//input[@name='city']");
	By stateDropDown=By.xpath("//select[@name='id_state']");
	By postcodeField=By.xpath("//input[@name='postcode']");
	By countryDropDown=By.xpath("//select[@name='id_country']");
	By phoneField=By.xpath("//input[@name='phone']");
	By invoiceSameAddCheckbox=By.xpath("//input[@id='use_same_address']");
	By continueButton=By.xpath("//button[@name='confirm-addresses']");
	
	public OrderFormDelivery() throws IOException
	{
		super();
	}
	
	public WebElement getFirstNameFeild() throws InterruptedException, Exception
	{
		this.driver=getdriver();
		return driver.findElement(firstNameFeild);
	}
	public WebElement getLastNameFeild() throws Exception, IOException
	{
		this.driver=getdriver();
		return driver.findElement(lastNameFeild);
	}
	public WebElement getCompanyNameFeild() throws Exception, IOException
	{
		this.driver=getdriver();
		return driver.findElement(companyNameFeild);
	}
	public WebElement getAddressFeild() throws Exception, IOException
	{
		this.driver=getdriver();
		return driver.findElement(addressFeild);
	}
	public WebElement getAddressComplementFeild() throws Exception, Exception
	{
		this.driver=getdriver();
		return driver.findElement(addressComplementFeild);
	}
	public WebElement getcityFeild() throws Exception, IOException
	{
		this.driver=getdriver();
		return driver.findElement(cityFeild);
	}
	public WebElement getstateDropDown() throws Exception, IOException
	{
		this.driver=getdriver();
		return driver.findElement(stateDropDown);
	}
	public WebElement getPostcodeField() throws Exception, IOException
	{
		this.driver=getdriver();
		return driver.findElement(postcodeField);
	}
	public WebElement getCountryDropDown() throws Exception, IOException
	{
		this.driver=getdriver();
		return driver.findElement(countryDropDown);
	}
	public WebElement getphoneField() throws Exception, IOException
	{
		this.driver=getdriver();
		return driver.findElement(phoneField);
	}
	public WebElement getInvoiceSameAddCheckbox() throws InterruptedException, IOException
	{
		this.driver=getdriver();
		return driver.findElement(invoiceSameAddCheckbox);
	}
	public WebElement getContinueButton() throws InterruptedException, IOException
	{
		this.driver=getdriver();
		return driver.findElement(continueButton);
	}
	
	
	
	

}
