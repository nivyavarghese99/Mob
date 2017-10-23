package test;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

//import java.net.MalformedURLException;

//class test extends TestScritpt{
//	
//	
//	void WheniclickonOfferZone() throws MalformedURLException {
//				
//		AndroidDriver<AndroidElement> driver=capabilities();
//		driver.findElementById("com.flipkart.android:id/btn_skip").click();
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.findElementById("com.flipkart.android:id/logo_icon").click();
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.findElementByAndroidUIAutomator("text(\"Offer Zone\")").click();
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.findElementByClassName("android.widget.ImageButton").click();
//	}
//	
//	
//}


public class UiAutomator  extends TestScritpt{

	public static void main(String[] args) throws MalformedURLException{
		
AndroidDriver<AndroidElement> driver=capabilities();
//driver.findElementById("com.flipkart.android:id/btn_skip").click();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
// login

//driver.findElementByXPath("//android.widget.Button[@text = 'Existing User? SIGN IN']").click();
//driver.findElementByXPath("//android.widget.EditText[@text = 'Email/Mobile no.']").click();
//driver.findElementByClassName("android.widget.EditText").sendKeys("9496616082");
//
// driver.findElementById("com.flipkart.android:id/et_password").sendKeys("qwerty123456");
// driver.findElementByXPath("//android.widget.Button[@text = 'SIGN IN']").click();
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		// product navigation
		
		driver.findElementById("com.flipkart.android:id/btn_skip").click();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("com.flipkart.android:id/logo_icon").click();
		//driver.findElementByClassName("//android.widget.ImageButton").click();
		driver.findElementById("com.flipkart.android:id/flyout_parent_title").click();
		driver.findElementByAndroidUIAutomator("text(\"Mobiles\")").click();
	    driver.findElementById("com.flipkart.android:id/firstCreativeCard").click();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByClassName("android.widget.ImageButton").click();
		driver.findElementByClassName("android.widget.ImageButton").click();
		driver.findElementByClassName("android.widget.ImageButton").click();
			
		
		// offer zone
		//driver.findElementById("com.flipkart.android:id/btn_skip").click();
		
		//driver.findElementById("com.flipkart.android:id/logo_icon").click();
		
		driver.findElementByAndroidUIAutomator("text(\"Offer Zone\")").click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByClassName("android.widget.ImageButton").click();
		driver.findElementByClassName("android.widget.ImageButton").click();
		// my rewards
		
//		//driver.findElementById("com.flipkart.android:id/btn_skip").click();
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		//driver.findElementById("com.flipkart.android:id/logo_icon").click();
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.findElementByAndroidUIAutomator("text(\"My Rewards\")").click();
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.findElementByClassName("android.widget.ImageButton").click();
//		
		// my cart
		//driver.findElementById("com.flipkart.android:id/btn_skip").click();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.findElementById("com.flipkart.android:id/logo_icon").click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByAndroidUIAutomator("text(\"My Cart\")").click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByClassName("android.widget.ImageButton").click();
		
		
		//notification
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByAndroidUIAutomator("text(\"Notifications\")").click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByClassName("android.widget.ImageButton").click();
		
		//my wishlist
		//driver.findElementById("com.flipkart.android:id/btn_skip").click();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				//driver.findElementById("com.flipkart.android:id/logo_icon").click();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.findElementByAndroidUIAutomator("text(\"My Wishlist\")").click();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.findElementByClassName("android.widget.ImageButton").click();
				
				// my orders
				//driver.findElementById("com.flipkart.android:id/btn_skip").click();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				//driver.findElementById("com.flipkart.android:id/logo_icon").click();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.findElementByAndroidUIAutomator("text(\"My Orders\")").click();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.findElementByClassName("android.widget.ImageButton").click();
				
				// my account
				//driver.findElementById("com.flipkart.android:id/btn_skip").click();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				//driver.findElementById("com.flipkart.android:id/logo_icon").click();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.findElementByAndroidUIAutomator("text(\"My Account\")").click();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.findElementByClassName("android.widget.ImageButton").click();
				
				// gift card
				//driver.findElementById("com.flipkart.android:id/btn_skip").click();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				//driver.findElementById("com.flipkart.android:id/logo_icon").click();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.findElementByAndroidUIAutomator("text(\"Gift Card\")").click();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.findElementByClassName("android.widget.ImageButton").click();
				
				//help centre
				//driver.findElementById("com.flipkart.android:id/btn_skip").click();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				//driver.findElementById("com.flipkart.android:id/logo_icon").click();
				driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Legal\"));");
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.findElementByAndroidUIAutomator("text(\"Help Centre\")").click();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.findElementByClassName("android.widget.ImageButton").click();
//				
//				// notification icon
//				//driver.findElementById("com.flipkart.android:id/btn_skip").click();
//				driver.findElementByAndroidUIAutomator("text(\"Home\")").click();
//				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//				driver.findElementById("com.flipkart.android:id/in_app_notification_bell").click();
//				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//				//driver.findElementByClassName("android.widget.ImageButton").click();
//				
//				// cart
//				
//				//driver.findElementById("com.flipkart.android:id/btn_skip").click();
//				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//				driver.findElementById("com.flipkart.android:id/cart_bg_icon").click();
//				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//				
//				
				// logout
				//driver.findElementById("com.flipkart.android:id/btn_skip").click();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				//driver.findElementById("com.flipkart.android:id/logo_icon").click();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.findElementByAndroidUIAutomator("text(\"My Account\")").click();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.findElementByAndroidUIAutomator("content-desc(\"Logout of this app\")").click();
				
		
		
			
//		test obj= new test();
//		
//		obj.WheniclickonOfferZone();
//	
		
	}
	//}
	
	
	
		
			
	//}
}
		//driver.findElementByAndroidUIAutomator("attribute(value)");
//		 TouchAction t= new TouchAction(driver);
//         t.tap(driver.findElementByXPath("//android.widget.Button[@text = 'Existing User? SIGN IN']")).perform();
//		//driver.findElementByXPath("//android.widget.Button[@text = 'Existing User? SIGN IN']").click();
//		driver.findElementByAndroidUIAutomator("text(\"Email/Mobile no.\")").click();
//		//driver.findElementByXPath("//android.widget.EditText[@text = 'Email/Mobile no.']").click();
//		driver.findElementByClassName("android.widget.EditText").sendKeys("9496616081");
//		
//		//driver.findElementByAndroidUIAutomator("text(\"Email/Mobile no.\")");
//		//System.out.println(driver.findElementById("com.flipkart.android/TextView01").getText());
//		//driver.findElementByAndroidUIAutomator("new Uiselector().clickable(true)");
//		System.out.println(driver.findElementsByAndroidUIAutomator("new Uiselector().clickable(true)").size());
//         
		
		// elctronics
		
//		driver.findElementById("com.flipkart.android:id/btn_skip").click();
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.findElementById("com.flipkart.android:id/logo_icon").click();
//		//driver.findElementByClassName("//android.widget.ImageButton").click();
//		driver.findElementById("com.flipkart.android:id/flyout_parent_title").click();
//		driver.findElementByAndroidUIAutomator("text(\"Mobiles\")").click();
//        driver.findElementById("com.flipkart.android:id/firstCreativeCard").click();
//		driver.findElementByClassName("android.widget.ImageButton").click();
//		driver.findElementByClassName("android.widget.ImageButton").click();
//		driver.findElementByClassName("android.widget.ImageButton").click();
		
		
		//driver.findElementByXPath("//android.widget.TextView[@text = 'Offer Zone']").click();
		
		
//driver.findElementByXPath("//android.widget.Button[@text = 'Existing User? SIGN IN']").click();
//driver.findElementByXPath("//android.widget.EditText[@text = 'Email/Mobile no.']").click();
//driver.findElementByClassName("android.widget.EditText").sendKeys("9496616082");
//
// driver.findElementById("com.flipkart.android:id/et_password").sendKeys("qwerty123456");
// driver.findElementByXPath("//android.widget.Button[@text = 'SIGN IN']").click();
// 
// //driver.findElementById("com.flipkart.android:id/btn_skip").click();
//	//driver.findElementByClassName("//android.widget.ImageButton").click();
//	driver.findElementByXPath("//android.widget.TextView[@text = 'Electronics']").click();
//	//driver.findElementByAndroidUIAutomator("text(\"Electronics\")").click();
//	driver.findElementByAndroidUIAutomator("text(\"Mobiles\")").click();
//	driver.findElementById("com.flipkart.android:id/firstCreativeCard").click();
////	
	
//		 
//		 
//		driver.findElementByXPath("//android.widget.TextView[@text = 'Electronics']").click();
//		driver.findElementByAndroidUIAutomator("text(\"Electronics\")").click();
//		driver.findElementByAndroidUIAutomator("text(\"Mobiles\")").click();
//		driver.findElementById("com.flipkart.android:id/firstCreativeCard").click();
		//driver.findElementByAndroidUIAutomator("resource-id(\"com.flipkart.android:id/firstCreativeCard\")").click();
		
		
		
//	}
//
//}
