package PageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.BasePage;

public class OrderformPersonalinfo extends BasePage{
	
	public WebDriver driver;
	
	By genderMr=By.xpath("//input[@value='1']");
	By genderMs=By.xpath("////input[@value='2']");
	By firstnameField=By.xpath("//input[@name='firstname']");
	By lastnameField=By.xpath("//input[@name='lastname']");
	By emailField=By.xpath("//input[@name='email']");
	By passwordField=By.xpath("//input[@name='password']");
	By birthdayField=By.xpath("//input[@name='birthday']");
	By receiveOffercheckbox=By.xpath("//input[@name='optin']");
	By signUpcheckbox=By.xpath("//input[@name='newsletter']");
	By termsConditioncheckbox=By.xpath("//input[@name='psgdpr']");
	By continueBtn=By.xpath("//button[contains(@class,'continue')]");
	
	public OrderformPersonalinfo() throws IOException
	{
		super();
	}
	
	public WebElement getGenderMr() throws InterruptedException, IOException
	{
		this.driver=getdriver();
		return driver.findElement(genderMr);
	}
	public WebElement getGenderMs() throws InterruptedException, IOException
	{
		this.driver=getdriver();
		return driver.findElement(genderMs);
	}
	public WebElement getFirstNameField() throws InterruptedException, IOException
	{
		this.driver=getdriver();
		return driver.findElement(firstnameField);
	}
	public WebElement getLastNameField() throws InterruptedException, IOException
	{
		this.driver=getdriver();
		return driver.findElement(lastnameField);
	}
	public WebElement getEmailFeild() throws InterruptedException, IOException
	{
		this.driver=getdriver();
		return driver.findElement(emailField);
	}
	public WebElement getPasswordField() throws InterruptedException, IOException
	{
		this.driver=getdriver();
		return driver.findElement(passwordField);
	}
	public WebElement getBirthdayFiled() throws InterruptedException, IOException
	{
		this.driver=getdriver();
		return driver.findElement(birthdayField);
	}
	public WebElement getReceiveOfferCheckBox() throws InterruptedException, IOException
	{
		this.driver=getdriver();
		return driver.findElement(receiveOffercheckbox);
	}
	public WebElement getSignUpCheckBox() throws InterruptedException, IOException
	{
		this.driver=getdriver();
		return driver.findElement(signUpcheckbox);
	}
	public WebElement getTermsConditionCheckbox() throws InterruptedException, IOException
	{
		this.driver=getdriver();
		return driver.findElement(termsConditioncheckbox);
	}
	public WebElement getContinueButton() throws InterruptedException, IOException
	{
		this.driver=getdriver();
		return driver.findElement(continueBtn);
	}

}
