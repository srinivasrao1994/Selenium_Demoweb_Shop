package com.demoworkshop.qa.pages;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo_Adding_Address {
	
private static WebDriver webDriver;
	
	@Test(priority=1, testName="tc01LaunchURL2", description="Lanuch the application URL")
	
	    public void tc01LaunchURL2() {
	
		ChromeOptions options = new ChromeOptions();
		
    	options.setPageLoadStrategy(PageLoadStrategy.NONE);
    	
    	System.setProperty("webdriver.chrome.driver","C:\\selenium chromedriver\\chromedriver.exe" );
    	
    	 webDriver = new ChromeDriver(options);

    	 webDriver.manage().window().maximize();
		
    	 webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
    	 webDriver.get("http://demowebshop.tricentis.com");
	}
	
	@Test(priority=2, testName="tc02_loginPage", description="loginPage")
	
	public void tc02_loginPage2() throws InterruptedException {
		
       Reporter.log("Clicking the login Link in the Demo workshop");
       
      // Actions action = new Actions(webDriver);
		
       WebElement element=webDriver.findElement(By.linkText("Log in"));
       
       //Thread.sleep(3000);
       
       //action.contextClick(element).perform();
       
       element.click();
       
	}
	
	@Test(priority = 3, testName = "tc03_LoginToDemoWebshop2")
	public void tc03_LoginToDemoWebshop2() {
		
		WebElement webObj = webDriver.findElement(By.cssSelector("input.email"));	
		
		Reporter.log("Enter The Email Address");
		
		webObj.sendKeys("satishg433@gmail.com");
		
		webObj = webDriver.findElement(By.cssSelector("input.password"));	
		
		Reporter.log("Enter The Password");
		
        webObj.sendKeys("654321");
		
        webObj = webDriver.findElement(By.cssSelector("input.button-1.login-button"));	
		
        webObj.click();
        
        webObj = webDriver.findElement(By.id("dialog-notifications-success"));
        
        System.out.println(webObj.getCssValue("vertical-align"));
		
		
	}
	
//	@Test(priority = 4, testName = "tc04_MyAccount")
//	public void tc04_Clicking_MyAccount() {
//		
//		  webDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//		
//          WebElement webObj;
//		try {
//			webObj = webDriver.findElement(By.cssSelector("a.account"));	
//			
//			  webObj.click();
//		} catch (org.openqa.selenium.StaleElementReferenceException e) {
//			
//			webObj = webDriver.findElement(By.cssSelector("a.account"));	
//			
//			  webObj.click();
//		}
//          
//          webObj = webDriver.findElement(By.cssSelector("a.inactive"));	
//  		
//          webObj.click();
//          
//         
//		
//	}
//	
//	@Test(priority = 5, testName = "tc05_DeletingExistingAddress")
//	public void tc05_DeletingExistingAddress() throws InterruptedException {
//		
//		List<WebElement> address = webDriver.findElements(By.cssSelector("div[class='section address-item']"));
//		
//		List<WebElement> deleteItems= webDriver.findElements(By.cssSelector("input.button-2.delete-address-button"));
//		
//		List<WebElement> editItems = webDriver.findElements(By.cssSelector("input.button-2.edit-address-button"));
//		
//        
//        String str1= "G satya reddy Srinivasa Rao";
//        
//              
////        String str2= "";
////        
////       for(int i=0;i<address.size();i++) {
////    	   
////    	   str2 = address.get(i).getText();
////    	   
////    	   if(str2.contains(str1)) {
////    		   
////    		   editItems.get(i).click();
////    		   
////    		   break;
////    		   
////    	   }
////       }
////        
////        Thread.sleep(2000);
////        
////        //webDriver.switchTo().alert().accept();
////        
////        WebElement save = webDriver.findElement(By.cssSelector("input.button-1.save-address-button"));
////        
////        save.click();
//        
//        
//    
//        String str3="";
//        
//        for(int i=0;i<address.size();i++) {
//        	
//        	str3 = address.get(i).getText();
//        	
//        	System.out.println(str3);
//        	
//        	if(str3.contains(str1)) {
//        		
//        		deleteItems.get(i).click();
//        		
//        		break;
//        		
//        	}
//        	}
//        Thread.sleep(2000);
//        
//        webDriver.switchTo().alert().accept();
//        
//        
//        
//		
//	}
//	
//	@Test(priority = 6, testName = "tc06_AddingNewAddress")
//	public void tc06_AddingNewAddress() {
//		
//        WebElement webObj = webDriver.findElement(By.cssSelector("input.button-1.add-address-button"));	
//		
//        webObj.click();
//        
//        WebElement objWeb = webDriver.findElement(By.id("Address_FirstName"));
//		
//        
//		objWeb.sendKeys("G satya reddy");
//		
//		Reporter.log("Last Name");
//		
//		objWeb = webDriver.findElement(By.id("Address_LastName"));
//        
//		objWeb.sendKeys("Srinivasa Rao");
//		
//		Reporter.log("Enter Email id");
//		
//		objWeb = webDriver.findElement(By.id("Address_Email"));
//        
//		objWeb.sendKeys("satishg433@gmail.com");
//		
//		Reporter.log("Select The Country");
//		
//        Select SelctCountry = new Select(webDriver.findElement(By.id("Address_CountryId")));
//		
//        SelctCountry.selectByVisibleText("United States");
//        
//        Reporter.log("Select The State");
//        
//        Select SelctState = new Select(webDriver.findElement(By.id("Address_StateProvinceId")));
//		
//        SelctState.selectByVisibleText("Alabama");
//        
//        Reporter.log("Select The City");
//        
//        objWeb = webDriver.findElement(By.id("Address_City"));
//        
//        objWeb.sendKeys("Visakhapatnam");
//        
//        Reporter.log("Select The Address1");
//        
//        objWeb = webDriver.findElement(By.id("Address_Address1"));
//        
//        objWeb.sendKeys("pedagantyada");
//        
//
//        Reporter.log("Select The Address2");
//        
//        objWeb = webDriver.findElement(By.id("Address_Address1"));
//        
//        objWeb.sendKeys("Ayyannapalem");
//        
//        Reporter.log("Zip / postal code");
//        
//        objWeb = webDriver.findElement(By.id("Address_ZipPostalCode"));
//        
//        objWeb.sendKeys("45005");
//        
//        Reporter.log("Phone number");
//        
//        objWeb = webDriver.findElement(By.id("Address_PhoneNumber"));
//        
//        objWeb.sendKeys("8374565149");
//        
//        
//        objWeb = webDriver.findElement(By.xpath("//input[@class='button-1 save-address-button']"));
//		
//        objWeb.click();
//		
//		String s1 = "Order 101202";
//		
//		String s2 = "Order Number #101202";
//		
//		//Assert.assertEquals(s1, s2.replaceAll("Number #", ""));
//		
//		//System.out.println(s2.lastIndexOf("#"));
//		
//		String s3=s2.substring(s2.lastIndexOf("#")+1);
//		
//		//s2.lastIndexOf(str);
//		
//	   assertTrue(s1.contains(s3));
//	   
//	   webDriver.close();
//		
//	}
//	
//	
//
}
