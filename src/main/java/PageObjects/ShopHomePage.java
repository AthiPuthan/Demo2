package PageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.BasePage;

public class ShopHomePage extends BasePage{
	public WebDriver driver;

	By prodOne = By.linkText("Hummingbird Printed T-Shirt");
	By productTwo = By.linkText("Hummingbird Printed Sweater");
	By productThree = By.linkText("The Best Is Yet To Come'...");
	By productFour = By.linkText("The Adventure Begins Framed...");
	By productFive = By.linkText("Today Is A Good Day Framed...");
	By productSix = By.linkText("Mug The Best Is Yet To Come");
	By productSeven = By.linkText("Mug The Adventure Begins");
	By productEight = By.linkText("Mug Today Is A Good Day");

	public ShopHomePage() throws IOException {
		super();
	}

	public WebElement getProdOne() throws InterruptedException, IOException {
		this.driver=getdriver();
		return driver.findElement(prodOne);
	}

	public WebElement getProdTwo() throws Exception, IOException {
		this.driver=getdriver();
		return driver.findElement(productTwo);
	}

	public WebElement getProdThree() throws InterruptedException, IOException {
		this.driver=getdriver();
		return driver.findElement(productThree);
	}

	public WebElement getProdFour() throws InterruptedException, IOException {
		this.driver=getdriver();
		return driver.findElement(productFour);
	}

	public WebElement getProdFive() throws InterruptedException, IOException {
		this.driver=getdriver();
		return driver.findElement(productFive);
	}

	public WebElement getProdSix() throws InterruptedException, IOException {
		this.driver=getdriver();
		return driver.findElement(productSix);
	}

	public WebElement getProdSeven() throws InterruptedException, IOException {
		this.driver=getdriver();
		return driver.findElement(productSeven);
	}

	public WebElement getProdEight() throws InterruptedException, IOException {
		this.driver=getdriver();
		return driver.findElement(productEight);
	}
}
