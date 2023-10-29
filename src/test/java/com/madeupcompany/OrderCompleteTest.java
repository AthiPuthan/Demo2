package com.madeupcompany;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.BasePage;
import Base.Hooks;
import PageObjects.HomePage;
import PageObjects.OrderFormDelivery;
import PageObjects.OrderFormPayment;
import PageObjects.OrderFormShippingMethod;
import PageObjects.OrderformPersonalinfo;
import PageObjects.ShopContentsPage;
import PageObjects.ShopHomePage;
import PageObjects.ShopProduct;
import PageObjects.ShoppingCart;

public class OrderCompleteTest extends Hooks {

	public OrderCompleteTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}


	@Test
	public void endToEndTest() throws Exception {
		HomePage home = new HomePage();
		home.getCookie().click();
		home.getTestStoreLink().click();

		ShopHomePage shopHome = new ShopHomePage();
		shopHome.getProdOne().click();

		ShopProduct shopProd = new ShopProduct();
		Select option = new Select(shopProd.getSizeOption());
		option.selectByVisibleText("M");
		shopProd.getQuantIncrease().click();
		shopProd.getAddToCartBtn().click();
		Thread.sleep(3000);
		
		ShopContentsPage shopCont = new ShopContentsPage();
		shopCont.getProceedToChekoutBtn().click();
		

		ShoppingCart cart = new ShoppingCart();
		cart.getPromoCode().click();
		cart.getPromoTextBox().sendKeys("200OFF");
		cart.getAddButton().click();
		Thread.sleep(3000);
		cart.getProceedToCheckoutButton().click();
		
		OrderformPersonalinfo pinfo=new OrderformPersonalinfo();
		pinfo.getGenderMr().click();
		pinfo.getFirstNameField().sendKeys("John");
		pinfo.getLastNameField().sendKeys("Smith");
		pinfo.getEmailFeild().sendKeys("johnsmith@test.com");
		pinfo.getTermsConditionCheckbox().click();
		pinfo.getContinueButton().click();
		
		OrderFormDelivery orderDelivery=new OrderFormDelivery();
		orderDelivery.getAddressFeild().sendKeys("123 Main street");
		orderDelivery.getcityFeild().sendKeys("Houston");
		Select state=new Select(orderDelivery.getstateDropDown());
		state.selectByVisibleText("Texas");
		orderDelivery.getPostcodeField().sendKeys("67062");
		orderDelivery.getContinueButton().click();
		
		OrderFormShippingMethod shipMethod=new OrderFormShippingMethod();
		shipMethod.getdeliverMsgTextBox().sendKeys("If Iam not there please place delivery on porch");
		shipMethod.getContinueButton().click();
		
		OrderFormPayment formPayment=new OrderFormPayment();
		formPayment.getPaybycheck().click();
		formPayment.getTermsAndConditioncheckbox().click();
		formPayment.getOrderBtn().click();
		

	}
}
