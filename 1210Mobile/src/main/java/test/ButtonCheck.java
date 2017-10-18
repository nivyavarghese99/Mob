package test;

import java.util.concurrent.TimeUnit;
import java.net.MalformedURLException;

import org.openqa.selenium.Dimension;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import junit.framework.Assert;

public class ButtonCheck extends TestScritpt{

	public static void main(String[] args) throws MalformedURLException{
			
		
		AndroidDriver<AndroidElement> driver=capabilities();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElementById("com.flipkart.android:id/btn_skip").click();
		driver.findElementByXPath("//android.widget.Button[@text = 'Existing User? SIGN IN']").click();
		driver.findElementByXPath("//android.widget.EditText[@text = 'Email/Mobile no.']").click();
		driver.findElementByClassName("android.widget.EditText").sendKeys("9496616082");

		 driver.findElementById("com.flipkart.android:id/et_password").sendKeys("qwerty123456");
		 driver.findElementByXPath("//android.widget.Button[@text = 'SIGN IN']").click();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElementByAndroidUIAutomator("content-desc(\"Logout of this app\")").click();
	}




	
//void WheniclickonElectronics_mobile_selectOne(){
//		
//	driver.findElementById("com.flipkart.android:id/btn_skip").click();
//	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//	driver.findElementById("com.flipkart.android:id/logo_icon").click();
//	//driver.findElementByClassName("//android.widget.ImageButton").click();
//	driver.findElementById("com.flipkart.android:id/flyout_parent_title").click();
//	driver.findElementByAndroidUIAutomator("text(\"Mobiles\")").click();
//    driver.findElementById("com.flipkart.android:id/firstCreativeCard").click();
//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//	driver.findElementByClassName("android.widget.ImageButton").click();
//	driver.findElementByClassName("android.widget.ImageButton").click();
//	driver.findElementByClassName("android.widget.ImageButton").click();
		
//	}

//	
//	void WheniclickonOfferZone() throws MalformedURLException {
//		AndroidDriver<AndroidElement> driver=capabilities();
//		driver.findElementById("com.flipkart.android:id/btn_skip").click();
//		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.findElementById("com.flipkart.android:id/logo_icon").click();
//		driver.findElementByAndroidUIAutomator("text(\"Offer Zone\")").click();
//		driver.findElementByClassName("android.widget.ImageButton").click();
//		
//		
//			
//	}
//	
//	void WhenIClickonMyReward(){
//		driver.findElementByAndroidUIAutomator("text(\"My Rewards\")").click();
//		driver.findElementByClassName("android.widget.ImageButton").click();
//		
//		
//	}

}
