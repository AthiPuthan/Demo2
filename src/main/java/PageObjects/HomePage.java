package PageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.BasePage;

public class HomePage extends BasePage{
	
	public WebDriver driver;
	
	By toggle=By.cssSelector(".toggle");
	By homeLink=By.linkText("HOMEPAGE");
	By accordionLink=By.linkText("ACCORDION");
	By browsertabLink=By.linkText("BROSWER TABS");
	By buttonsLink=By.linkText("BUTTONS");
	By calLink=By.linkText("CALACULATOR(JS)");
	By contactusLink=By.linkText("CONTACT US FORM TEST");
	By dataPickerLink=By.linkText("DATA PICKER");
	By dropdownLink=By.linkText("DROPDOWN CHECKBOX RADIO");
	By hiddenelementsLink=By.linkText("HIDDEN ELEMENTS");
	By iFrameLink=By.linkText("IFRAMES");
	By loaderLink=By.linkText("LOADER");
	By loginportalLink=By.linkText("LOGIN PORTAL TEST");
	By mouseLink=By.linkText("MOUSE MOVEMENT");
	By popupLink=By.linkText("POP UPS & ALERTS");
	By predictiveLink=By.linkText("PREDICTIVE SEARCH");
	By tablesLink=By.linkText("TABLES");
	By teststoreLink=By.linkText("TEST STORE");
	By aboutmeLink=By.linkText("ABOUT ME");
	By cookie = By.cssSelector(".close-cookie-warning > span");
	
	public HomePage() throws IOException
	{
	super();
	}
	
	
	public WebElement getToggle() throws InterruptedException, IOException
	{
		this.driver=getdriver();
		return driver.findElement(toggle);
	}
	public WebElement getHomeLink() throws InterruptedException, IOException
	{
		this.driver=getdriver();
		return driver.findElement(homeLink);
	}
	public WebElement getAccordionLink() throws InterruptedException, IOException
	{
		this.driver=getdriver();
		return driver.findElement(accordionLink);
	}
	public WebElement getBrowserTabLink() throws Exception, Exception
	{
		this.driver=getdriver();
		return driver.findElement(browsertabLink);
	}
	public WebElement getButtonLink() throws Exception, IOException
	{
		this.driver=getdriver();
		return driver.findElement(buttonsLink);
	}
	public WebElement getCalLink() throws Exception, Exception
	{
		this.driver=getdriver();
		return driver.findElement(calLink);
	}
	public WebElement getContactUsLink() throws Exception, Exception
	{
		this.driver=getdriver();
		return driver.findElement(contactusLink);
	}
	public WebElement getDataPickerLink() throws Exception, Exception
	{
		this.driver=getdriver();
		return driver.findElement(dataPickerLink);
	}
	public WebElement getDropDownLink() throws Exception, IOException
	{
		this.driver=getdriver();
		return driver.findElement(dropdownLink);
	}
	public WebElement getHiddenElementsLink() throws Exception, Exception
	{
		this.driver=getdriver();
		return driver.findElement(hiddenelementsLink);
	}
	public WebElement getIframeLink() throws Exception, IOException
	{
		this.driver=getdriver();
		return driver.findElement(iFrameLink);
	}
	public WebElement getLoaderLink() throws Exception, IOException
	{
		this.driver=getdriver();
		return driver.findElement(loaderLink);
	}
	public WebElement getLoginPortalLink() throws Exception, Exception
	{
		this.driver=getdriver();
		return driver.findElement(loginportalLink);
	}
	public WebElement getMouseLink() throws Exception, Exception
	{
		this.driver=getdriver();
		return driver.findElement(mouseLink);
	}
	public WebElement getPopUpLink() throws Exception, Exception
	{
		this.driver=getdriver();
		return driver.findElement(popupLink);
	}
	public WebElement getPredectiveLink() throws Exception, Exception
	{
		this.driver=getdriver();
		return driver.findElement(predictiveLink);
	}
	public WebElement getTabelsLink() throws Exception, Exception
	{
		this.driver=getdriver();
		return driver.findElement(tablesLink);
	}
	public WebElement getTestStoreLink() throws InterruptedException, Exception
	{
		this.driver=getdriver();
		return driver.findElement(teststoreLink);
	}
	public WebElement getAboutMeLink() throws Exception, Exception
	{
		this.driver=getdriver();
		return driver.findElement(aboutmeLink);
	}
	public WebElement getCookie() throws InterruptedException, IOException
	{
		this.driver=getdriver();
		return driver.findElement(cookie);
	}
}
