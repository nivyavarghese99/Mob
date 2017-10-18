package test;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class validation extends TestScritpt{
	

	public static void main(String[] args) throws MalformedURLException {
		String Status;
	
		AndroidDriver<AndroidElement> driver=capabilities();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
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
          
            if(name == "Nivya"){
        			
        			Status = "pass";
        			
        		}else{
        			 Status = "fail";
        			
        		}
            System.out.println("Login Person"+name);
        		//return Status;
        		
            	
            
				//System.out.println(driver.findElementById("first_name").getText());
				
				driver.findElementByXPath("//android.widget.Button[@content-desc = 'SUBMIT']").click();
				driver.findElementByXPath("//android.view.View[@content-desc = 'Logout of this app']").click();
//				driver.findElementByClassName("android.widget.ImageButton").click();
//				driver.findElementByXPath("//android.widget.TextView[@text = 'Home']").click();
//				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//				driver.findElementById("com.flipkart.android:id/logo_icon").click();
//				driver.findElementByAndroidUIAutomator("text(\"My Account\")").click();
//				
////				driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"SUBMIT\"));");
////				 driver.findElementByXPath("//android.widget.Button[@text = 'SUBMIT']").click();
//				
//				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//				//
//				//System.out.println(driver.findElementByXPath("//android.view.View[@content-desc = '9496616082']").getText());
//				//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Account Settings\"));");
//				driver.findElementByXPath("//android.view.View[@content-desc = 'Logout of this app']").click();
//				//driver.findElementByAndroidUIAutomator("content-desc(\"Logout of this app\")").click();
				
				
				

}
}

