package PageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.BasePage;

public class ShopProduct extends BasePage{

	public WebDriver driver;

	By sizeOption = By.xpath("//select[@id='group_1']");
	By quantityIncrease = By.xpath("//button[contains(@class,'bootstrap-touchspin-up')]");
	By quantityDecrease = By.xpath("//button[contains(@class,'bootstrap-touchspin-down')]");
	By addToCart = By.xpath("//button[contains(@class,'add-to-cart')]");
	By homePageLink = By.xpath("//span[text()='Home']");

	public ShopProduct() throws IOException {
		super();
	}

	public WebElement getSizeOption() throws InterruptedException, IOException {
		this.driver=getdriver();
		return driver.findElement(sizeOption);
	}

	public WebElement getQuantIncrease() throws InterruptedException, IOException {
		this.driver=getdriver();
		return driver.findElement(quantityIncrease);
	}

	public WebElement getQuantDecrease() throws InterruptedException, IOException {
		this.driver=getdriver();
		return driver.findElement(quantityDecrease);
	}

	public WebElement getAddToCartBtn() throws InterruptedException, IOException {
		this.driver=getdriver();
		return driver.findElement(addToCart);
	}

	public WebElement getHomepageLink() throws InterruptedException, IOException {
		this.driver=getdriver();
		return driver.findElement(homePageLink);
	}
}
