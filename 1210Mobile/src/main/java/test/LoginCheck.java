package test;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import junit.framework.Assert;

public class LoginCheck{
	
	LoginCheck() throws MalformedURLException{
	//AndroidDriver<AndroidElement> driver;	
		
	}
	
	AndroidDriver<AndroidElement> driver=TestScritpt.capabilities();
	

		
	String  invalidLogin(){
		String Status, value;
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElementByXPath("//android.widget.Button[@text = 'Existing User? SIGN IN']").click();
		driver.findElementByXPath("//android.widget.EditText[@text = 'Email/Mobile no.']").click();
		driver.findElementByClassName("android.widget.EditText").sendKeys("9496616081");
		
		 driver.findElementById("com.flipkart.android:id/et_password").sendKeys("123");
		 driver.findElementByXPath("//android.widget.Button[@text = 'SIGN IN']").click();
		 driver.findElementByXPath("//android.widget.TextView[@text = 'Account does not exist']").getText();
		 value = driver.findElementByXPath("//android.widget.TextView[@text = 'Account does not exist']").getText();
		 
		 if(value.equals("Account does not exist")) {
  			
  			Status = "pass";
  			
  			
  		}else{
  			 Status = "fail";
  			
  		}
		 System.out.println("Error Message.."+value);	
		 
		return Status;
		
		 
	}
		
	
	String  validLogin(){
		String Status;
	
	
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//driver.findElementByXPath("//android.widget.Button[@text = 'New to Flipkart? SIGNUP']").click();
			
			driver.findElementByXPath("//android.widget.Button[@text = 'Existing User? SIGN IN']").click();
			driver.findElementByXPath("//android.widget.EditText[@text = 'Email/Mobile no.']").click();
			driver.findElementByClassName("android.widget.EditText").sendKeys("9496616082");
			
			 driver.findElementById("com.flipkart.android:id/et_password").sendKeys("qwerty123456");
			 driver.findElementByXPath("//android.widget.Button[@text = 'SIGN IN']").click();
			 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.findElementById("com.flipkart.android:id/logo_icon").click();
				driver.findElementByAndroidUIAutomator("text(\"My Account\")").click();
				//System.out.println(driver.findElementByXPath("//android.view.View[@content-desc = 'Nivya']").getText());
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				
         driver.findElementByXPath("//android.view.View[@content-desc = 'editprofile']").click();
         String name=driver.findElementById("first_name").getText();
         driver.findElementByXPath("//android.widget.Button[@content-desc = 'SUBMIT']").click();
       
         if(name.equals("Nivya")){
     			
        	 Status = "pass";
     			
     		}else{
     			Status = "fail";
     			
     		}
         System.out.println("Login Person"+name);
     		return Status;
     		
		
		}
	
	String  when_I_Click_on_productNavigation()
	{
		String Pvalue, Status;
		//driver.findElementByXPath("//android.widget.ImageButton[@resource-id = 'com.flipkart.android:id/btn_skip']").click();
		//driver.findElementById("com.flipkart.android:id/btn_skip").click();
		driver.findElementByXPath("//android.widget.ImageButton[@content-desc = 'Open Drawer']").click();
		//driver.findElementById("com.flipkart.android:id/logo_icon").click();
		//driver.findElementByClassName("//android.widget.ImageButton").click();
		driver.findElementById("com.flipkart.android:id/flyout_parent_title").click();
		driver.findElementByAndroidUIAutomator("text(\"Mobiles\")").click();
		Pvalue = driver.findElementByXPath("//android.widget.TextView[@text = 'Mobiles Destination']").getText();
        
	    
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElementByXPath("//android.widget.ImageButton[@content-desc = 'Back Button']").click();
		driver.findElementByClassName("android.widget.ImageButton").click();
		driver.findElementByClassName("android.widget.ImageButton").click();
		//driver.findElementByClassName("android.widget.ImageButton").click();
		
		
		
		 if(Pvalue.equals("Mobiles Destination")){
  			
        	 Status = "pass";
     			
     		}else{
     			Status = "fail";
     			
     		}
         System.out.println("Messsage"+Pvalue);
     		return Status;
		
	}
	String when_I_Click_on_offerZone(){
		String OFvalue, Status;
		
		//driver.findElementById("com.flipkart.android:id/btn_skip").click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("com.flipkart.android:id/logo_icon").click();
		driver.findElementByAndroidUIAutomator("text(\"My Cart\")").click();
		OFvalue = driver.findElementByXPath("//android.widget.TextView[@text = 'Offer Zone']").getText();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByClassName("android.widget.ImageButton").click();
		
		 if(OFvalue.equals("Offer Zone")){
	  			
        	 Status = "pass";
     			
     		}else{
     			Status = "fail";
     			
     		}
         System.out.println("Messsage"+OFvalue);
     		return Status;
	
		
	}
	String when_I_Click_on_myNotifications(){
		String Nvalue, Status;
		
		//driver.findElementById("com.flipkart.android:id/btn_skip").click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("com.flipkart.android:id/logo_icon").click();
		driver.findElementByAndroidUIAutomator("text(\"Notifications\")").click();
		Nvalue = driver.findElementByXPath("//android.widget.TextView[@text = 'Notifications']").getText();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByClassName("android.widget.ImageButton").click();
		
		 if(Nvalue.equals("Notifications")){
	  			
        	 Status = "pass";
     			
     		}else{
     			Status = "fail";
     			
     		}
         System.out.println("Messsage"+Nvalue);
     		return Status;
	
		
	}
	String when_I_Click_on_myRewards(){
		String Rvalue, Status;
		
		//driver.findElementById("com.flipkart.android:id/btn_skip").click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("com.flipkart.android:id/logo_icon").click();
		driver.findElementByAndroidUIAutomator("text(\"My Rewards\")").click();
		Rvalue = driver.findElementByXPath("//android.widget.TextView[@text = 'My Rewards']").getText();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByClassName("android.widget.ImageButton").click();
		
		 if(Rvalue.equals("My Rewards")){
	  			
        	 Status = "pass";
     			
     		}else{
     			Status = "fail";
     			
     		}
         System.out.println("Messsage"+Rvalue);
     		return Status;
	
		
	}
	
	String when_I_Click_on_myCart(){
		String Cvalue, Status;
		
		//driver.findElementById("com.flipkart.android:id/btn_skip").click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("com.flipkart.android:id/logo_icon").click();
		driver.findElementByAndroidUIAutomator("text(\"My Cart\")").click();
		Cvalue = driver.findElementByXPath("//android.widget.TextView[@text = 'My Cart']").getText();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByClassName("android.widget.ImageButton").click();
		
		 if(Cvalue.equals("My Cart")){
	  			
        	 Status = "pass";
     			
     		}else{
     			Status = "fail";
     			
     		}
         System.out.println("Messsage"+Cvalue);
     		return Status;
	
		
	}
	String when_I_Click_on_myWhishlist(){
		String Wvalue, Status;
		//driver.findElementById("com.flipkart.android:id/btn_skip").click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("com.flipkart.android:id/logo_icon").click();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByAndroidUIAutomator("text(\"My Wishlist\")").click();
		Wvalue = driver.findElementByXPath("//android.widget.TextView[@text = 'Wishlist']").getText();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByClassName("android.widget.ImageButton").click();
		
		if(Wvalue.equals("Wishlist")){
  			
       	 Status = "pass";
    			
    		}else{
    			Status = "fail";
    			
    		}
        System.out.println("Messsage"+Wvalue);
    		return Status;
	
		
	}

	String when_I_Click_on_myOrders(){
		String Ovalue, Status;
		//driver.findElementById("com.flipkart.android:id/btn_skip").click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("com.flipkart.android:id/logo_icon").click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByAndroidUIAutomator("text(\"My Orders\")").click();
		Ovalue = driver.findElementByXPath("//android.widget.TextView[@text = 'My Orders']").getText();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByClassName("android.widget.ImageButton").click();
		
		if(Ovalue.equals("My Orders")){
  			
       	 Status = "pass";
    			
    		}else{
    			Status = "fail";
    			
    		}
        System.out.println("Messsage"+Ovalue);
    		return Status;
	
		
	}
	
	String when_I_Click_on_myAccount(){
		String Avalue, Status;
		//driver.findElementById("com.flipkart.android:id/btn_skip").click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("com.flipkart.android:id/logo_icon").click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByAndroidUIAutomator("text(\"My Account\")").click();
		Avalue = driver.findElementByXPath("//android.widget.TextView[@text = 'My Account']").getText();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByClassName("android.widget.ImageButton").click();
		
		if(Avalue.equals("My Account")){
  			
       	 Status = "pass";
    			
    		}else{
    			Status = "fail";
    			
    		}
        System.out.println("Messsage"+Avalue);
    		return Status;
	
		
	}
	String when_I_Click_on_giftCard(){
		String Avalue, Status;
		//driver.findElementById("com.flipkart.android:id/btn_skip").click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("com.flipkart.android:id/logo_icon").click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByAndroidUIAutomator("text(\"Gift Card\")").click();
		Avalue = driver.findElementByXPath("//android.widget.TextView[@text = 'Gift Card']").getText();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByClassName("android.widget.ImageButton").click();
		
		if(Avalue.equals("Gift Card")){
  			
       	 Status = "pass";
    			
    		}else{
    			Status = "fail";
    			
    		}
        System.out.println("Messsage"+Avalue);
    		return Status;
	
		
	}
	
	String when_I_Click_on_helpCentre(){
		String Avalue, Status;
		//driver.findElementById("com.flipkart.android:id/btn_skip").click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("com.flipkart.android:id/logo_icon").click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByAndroidUIAutomator("text(\"Help Centre\")").click();
		Avalue = driver.findElementByXPath("//android.widget.TextView[@text = 'Help Centre']").getText();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByClassName("android.widget.ImageButton").click();
		
		if(Avalue.equals("Help Centre")){
  			
       	 Status = "pass";
    			
    		}else{
    			Status = "fail";
    			
    		}
        System.out.println("Messsage"+Avalue);
    		return Status;
	
		
	}
	
}
