package test;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Login extends TestScritpt{
	public static void main (String[] args) throws MalformedURLException{
		String Status;
		//AndroidDriver<AndroidElement> driver=capabilities();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
		LoginCheck obj= new LoginCheck();
		
		//Status = obj.invalidLogin();
		//Status = obj.validLogin();
		//Status = obj.productNavigation();
		//Status = obj.myCart();
		Status = obj.myWhishlist();
		Status = obj.myOrders();
		
		
		
		
		System.out.println("Test Result.."+Status);
        //obj.validLogin();
	
	}
}
