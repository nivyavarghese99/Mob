package test;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import junit.framework.Assert;

public class LoginCheck {
	
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
		 
		 if(value == "Account does not exist"){
  			
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
       
         if(name == "Nivya"){
     			
        	 Status = "pass";
     			
     		}else{
     			Status = "fail";
     			
     		}
         System.out.println("Login Person"+name);
     		return Status;
     		
		
		}
	
	String  productNavigation()
	{
		String Pvalue, Status;
		driver.findElementById("com.flipkart.android:id/btn_skip").click();
		driver.findElementById("com.flipkart.android:id/logo_icon").click();
		//driver.findElementByClassName("//android.widget.ImageButton").click();
		driver.findElementById("com.flipkart.android:id/flyout_parent_title").click();
		driver.findElementByAndroidUIAutomator("text(\"Mobiles\")").click();
		 Pvalue = driver.findElementByXPath("//android.view.View[@text = 'Mobiles Destination']").getText();
        
	    
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByClassName("android.widget.ImageButton").click();
		driver.findElementByClassName("android.widget.ImageButton").click();
		//driver.findElementByClassName("android.widget.ImageButton").click();
		
		
		
		 if(Pvalue == "Mobiles Destination"){
  			
        	 Status = "pass";
     			
     		}else{
     			Status = "fail";
     			
     		}
         System.out.println("Messsage"+Pvalue);
     		return Status;
		
	}
	
	String myCart(){
		String Cvalue, Status;
		
		driver.findElementById("com.flipkart.android:id/btn_skip").click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByAndroidUIAutomator("text(\"My Cart\")").click();
		Cvalue = driver.findElementByXPath("//android.view.View[@text = 'My Cart']").getText();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByClassName("android.widget.ImageButton").click();
		 if(Cvalue == "Mobiles Destination"){
	  			
        	 Status = "pass";
     			
     		}else{
     			Status = "fail";
     			
     		}
         System.out.println("Messsage"+Cvalue);
     		return Status;
	
		
	}
	String myWhishlist(){
		String Wvalue, Status;
		driver.findElementById("com.flipkart.android:id/btn_skip").click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("com.flipkart.android:id/logo_icon").click();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByAndroidUIAutomator("text(\"My Wishlist\")").click();
		Wvalue = driver.findElementByXPath("//android.view.View[@text = 'Wishlist']").getText();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByClassName("android.widget.ImageButton").click();
		
		if(Wvalue == "Wishlist"){
  			
       	 Status = "pass";
    			
    		}else{
    			Status = "fail";
    			
    		}
        System.out.println("Messsage"+Wvalue);
    		return Status;
	
		
	}

	String myOrders(){
		String Ovalue, Status;
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.findElementById("com.flipkart.android:id/logo_icon").click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByAndroidUIAutomator("text(\"My Orders\")").click();
		Ovalue = driver.findElementByXPath("//android.view.View[@text = 'My Orders']").getText();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByClassName("android.widget.ImageButton").click();
		
		if(Ovalue == "My Orders"){
  			
       	 Status = "pass";
    			
    		}else{
    			Status = "fail";
    			
    		}
        System.out.println("Messsage"+Ovalue);
    		return Status;
	
		
	}
}
