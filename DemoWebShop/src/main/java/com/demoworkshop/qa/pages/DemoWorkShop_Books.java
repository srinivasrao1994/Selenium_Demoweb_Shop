package com.demoworkshop.qa.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoworkshop.qa.TestBase;

public class DemoWorkShop_Books extends TestBase{
	
	public static final Logger log = Logger.getLogger(DemoWorkShop_Books.class.getName());

	@FindBy(linkText="Books")
	WebElement Books;
	
	@FindBy(xpath="//h1[contains(text(),'Books')]")
	WebElement Book_Text;
	
	@FindBy(xpath="//div[5]//div[1]//div[1]//a[1]//img[1]")
	WebElement Health_Book;
	
	@FindBy(id="products-orderby")
	WebElement Select_Products;
	
	@FindBy(id="products-pagesize")
	WebElement Select_PageSize;
	
	@FindBy(id="addtocart_22_EnteredQuantity")
	WebElement EnteredQuantity;
	
	@FindBy(id="add-to-cart-button-22")
	WebElement Add_To_Cart_button;
	
	
	public DemoWorkShop_Books() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void DemoWorkShop_AddBooks_To_ShoppingCart(String strDemoworkshop) {
		
		log("clicking Books on Demo Web shop");
		Books.click();
		
		log("Verifying the Books page is displayed");
		String strDemoWorkShopAct = Book_Text.getText();
		System.out.println(strDemoWorkShopAct);
		if(strDemoworkshop.equalsIgnoreCase(strDemoWorkShopAct)){
			log("Books page is displayed with expected :" + strDemoworkshop + " is matched with Actual value : " + strDemoWorkShopAct);
		}else {
			log("Books page is not displayed with expected :" + strDemoworkshop + " is not matched with Actual value : " + strDemoWorkShopAct);
		}	
		
		log("Selection of value from drop down");
		Select_Value_From_Dropdown(Select_Products,1);
		
		log("Selection of value from drop down");
		Select_Value_From_Dropdown(Select_PageSize,2);
		
		log("Select the picture of health book");
		Health_Book.click();
		
		log("Enter the Quantity");
		EnteredQuantity.clear();
		EnteredQuantity.sendKeys("1");
		
		log("Click on Add to Cart Button");
		Add_To_Cart_button.click();
		
	}
	

}
