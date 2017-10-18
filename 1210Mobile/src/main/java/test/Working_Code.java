package test;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Working_Code extends TestScritpt{
	

		public static void main(String[] args) throws MalformedURLException{
			
	AndroidDriver<AndroidElement> driver=capabilities();
		// login
		
		driver.findElementByXPath("//android.widget.Button[@text = 'Existing User? SIGN IN']").click();
		driver.findElementByXPath("//android.widget.EditText[@text = 'Email/Mobile no.']").click();
		driver.findElementByClassName("android.widget.EditText").sendKeys("9496616082");
		
		 driver.findElementById("com.flipkart.android:id/et_password").sendKeys("qwerty123456");
		 driver.findElementByXPath("//android.widget.Button[@text = 'SIGN IN']").click();
		 
		 
		 //  electronics_mobile_
		 
		 driver.findElementById("com.flipkart.android:id/btn_skip").click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElementById("com.flipkart.android:id/logo_icon").click();
			//driver.findElementByClassName("//android.widget.ImageButton").click();
			driver.findElementById("com.flipkart.android:id/flyout_parent_title").click();
			driver.findElementByAndroidUIAutomator("text(\"Mobiles\")").click();
		    driver.findElementById("com.flipkart.android:id/firstCreativeCard").click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElementByClassName("android.widget.ImageButton").click();
			driver.findElementByClassName("android.widget.ImageButton").click();
			driver.findElementByClassName("android.widget.ImageButton").click();
				
			// offerZone
			
			driver.findElementById("com.flipkart.android:id/btn_skip").click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElementById("com.flipkart.android:id/logo_icon").click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElementByAndroidUIAutomator("text(\"Offer Zone\")").click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElementByClassName("android.widget.ImageButton").click();
			
			// myreward
			
			driver.findElementById("com.flipkart.android:id/btn_skip").click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElementById("com.flipkart.android:id/logo_icon").click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElementByAndroidUIAutomator("text(\"My Rewards\")").click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElementByClassName("android.widget.ImageButton").click();
			
			
			
		
	}

}
