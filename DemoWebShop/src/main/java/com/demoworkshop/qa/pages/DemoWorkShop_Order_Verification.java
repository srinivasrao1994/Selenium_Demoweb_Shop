package com.demoworkshop.qa.pages;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoworkshop.qa.TestBase;

public class DemoWorkShop_Order_Verification extends TestBase{
	
	public static final Logger log = Logger.getLogger(DemoWorkShop_Gift_Cards.class.getName());
	
	@FindBy(xpath="//a[contains(text(),'Orders')]")
	
	WebElement Clicking_Order;
	
	@FindAll({
		@FindBy(css="div[class='section order-item']")
	})

	List<WebElement> orderItems;
	
	@FindAll({
		@FindBy(css="input.button-2 order-details-button")
	})

	List<WebElement> buttons;
	



public DemoWorkShop_Order_Verification() {
	
	PageFactory.initElements(driver, this);
	
}

public void Selecting_Order() {
	
	Clicking_Order.click();
	
//	String orderNumber ="734313";
//	
//	String strText = "";
//	
//	for(int i=0;i<orderItems.size();i++) {
//		
//		strText = orderItems.get(i).getText();
//		
//		if(strText.contains(orderNumber)) {
//			
//			buttons.get(i).click();
//			
//		}
		
		
		
		
	//}
	
}

}