package test;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Swipedemo extends TestScritpt{

	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement> driver=capabilities();
		//driver.findElementById("com.flipkart.android:id/btn_skip").click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.findElementById("com.flipkart.android:id/btn_skip").click();
		driver.findElementByXPath("//android.widget.Button[@text = 'Existing User? SIGN IN']").click();
		driver.findElementByXPath("//android.widget.EditText[@text = 'Email/Mobile no.']").click();
		driver.findElementByClassName("android.widget.EditText").sendKeys("9496616082");

		 driver.findElementById("com.flipkart.android:id/et_password").sendKeys("qwerty123456");
		 driver.findElementByXPath("//android.widget.Button[@text = 'SIGN IN']").click();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("com.flipkart.android:id/logo_icon").click();
		System.out.println(driver.findElementById("com.flipkart.android:id/flyout_parent_title").getText());
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByAndroidUIAutomator("text(\"My Account\")").click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
         //driver.findElementByXPath("//android.widget.Button[@text = 'Existing User? SIGN IN']").click();
          TouchAction t =new TouchAction(driver);
          t.press(driver.findElementByXPath("//*[@content-desc='My Orders']")).waitAction(2000).moveTo(driver.findElementByXPath("//*[@content-desc='My Reviews']")).release().perform();
//         
        //System.out.println(driver.findElementById("com.flipkart.android:id/flyout_parent_title").getText());
          //driver.findElementByXPath("//*[@content-desc = 'Logout of this app']").click();
	}

}
