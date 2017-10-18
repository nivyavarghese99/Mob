package test;

	import java.io.File;
	import java.net.MalformedURLException;
	import java.net.URL;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.remote.DesiredCapabilities;

	import io.appium.java_client.android.AndroidDriver;
	import io.appium.java_client.android.AndroidElement;
	import io.appium.java_client.remote.MobileCapabilityType;

public class TestScritpt {
	
	public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException
	{
	
	
		AndroidDriver<AndroidElement>  driver;
			// TODO Auto-generated method stub
		 File appDir = new File("src/main/java");
	     File app = new File(appDir, "com.flipkart.android-5.10@APK4Fun.com.apk");
	     DesiredCapabilities capabilities = new DesiredCapabilities();
	     
	     capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "ZY222357QD");
	     capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
	    driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		    
		   return driver;
		}

		
		

	}


