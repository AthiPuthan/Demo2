package com.madeupcompany;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Base.BasePage;
import Base.Hooks;
import PageObjects.HomePage;
import PageObjects.ShopContentsPage;
import PageObjects.ShopHomePage;
import PageObjects.ShopProduct;
import PageObjects.ShoppingCart;

@Listeners(Resources.Listener.class)
public class AddRemoveItemBasketTest extends Hooks{
	
	public AddRemoveItemBasketTest() throws IOException
	{
		super();
	}

	
	@Test
	public void addRemoveItem() throws Exception
	{
	HomePage home=new HomePage();
	home.getCookie().click();
	/*JavascriptExecutor jse = (JavascriptExecutor)getDriver();
	jse.executeScript("arguments[0].scrollIntoView()", home.getTestStoreLink()); */
	home.getTestStoreLink().click();
	
	ShopHomePage shop=new ShopHomePage();
	shop.getProdOne().click();
	
	ShopProduct prod=new ShopProduct();
	Select option=new Select(prod.getSizeOption());
	option.selectByVisibleText("M");
	prod.getQuantIncrease().click();
	prod.getAddToCartBtn().click();
	
	ShopContentsPage contents=new ShopContentsPage();
	contents.getContinueShoppingBtn().click();
	prod.getHomepageLink().click();
	
	shop.getProdTwo().click();
	prod.getAddToCartBtn().click();
	
	contents.getProceedToChekoutBtn().click();
	
	ShoppingCart cart=new ShoppingCart();
	cart.getDeleteTwoItem().click();
	//waitForInvisibleElement(cart.getDeleteTwoItem(),10);
	WebDriverWait wait=new WebDriverWait(getdriver(), Duration.ofSeconds(10));
	wait.until(ExpectedConditions.invisibilityOf(cart.getDeleteTwoItem()));
	
	System.out.println(cart.getTotalValue().getText());
	
	Assert.assertEquals("$45.23", cart.getTotalValue().getText());
	
	
	}
	
}
