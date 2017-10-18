package test;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Scrolling extends TestScritpt{


		public static void main(String[] args) throws MalformedURLException {
			AndroidDriver<AndroidElement> driver=capabilities();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElementByXPath("//android.widget.Button[@text = 'Existing User? SIGN IN']").click();
			driver.findElementByXPath("//android.widget.EditText[@text = 'Email/Mobile no.']").click();
			driver.findElementByClassName("android.widget.EditText").sendKeys("9496616082");

			 driver.findElementById("com.flipkart.android:id/et_password").sendKeys("qwerty123456");
			 driver.findElementByXPath("//android.widget.Button[@text = 'SIGN IN']").click();
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					
			//driver.findElementById("com.flipkart.android:id/btn_skip").click();
			driver.findElementById("com.flipkart.android:id/logo_icon").click();
			driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Legal\"));");
			driver.findElementByAndroidUIAutomator("text(\"My Account\")").click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Logout of all devices\"));");
			driver.findElementByAndroidUIAutomator("content-desc(\"Logout of this app\")").click();
//			driver.findElementByXPath(
//			driver.findElements(By.xpath("android.widget.Button")).get(1).click();
//			WebElement logout = driver.findElement(By.name("LOGOUT"));
//	        String logOut = logout.getText();
//	        System.out.println(logOut);
		}
		

}
