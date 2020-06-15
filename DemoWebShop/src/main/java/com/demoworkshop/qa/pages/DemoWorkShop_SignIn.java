package com.demoworkshop.qa.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoworkshop.qa.TestBase;

public class DemoWorkShop_SignIn extends TestBase{
	
	public static final Logger log = Logger.getLogger(DemoWorkShop_SignIn.class.getName());
	
	@FindBy(linkText="Log in")
	WebElement Loginlink;
	
	@FindBy(id="Email")
	WebElement Email;
	
	@FindBy(id="Password")
	WebElement Password;
	
	@FindBy(xpath="//input[@value='Log in']")
	WebElement LogIn;
	
	public DemoWorkShop_SignIn() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void DemoWorkShopSignIn() {
		
		log("Click on login page");
		Loginlink.click();
		
		log("Entered email");
		Email.sendKeys("mmsuresh123@gmail.com");
		
		log("Entered password");
		Password.sendKeys("abcdef");
		LogIn.click();
		
		//JavascriptExecutor js = (JavascriptExecutor)driver;
    	//js.executeScript("arguments[0].click();", LogIn);
	}
	

}
