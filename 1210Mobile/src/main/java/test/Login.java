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
		
		Status = obj.invalidLogin();
//		Status = obj.validLogin();
//		Status = obj.when_I_Click_on_productNavigation();
//		Status = obj.when_I_Click_on_myCart();
//		Status = obj.when_I_Click_on_myWhishlist();
//		Status = obj.when_I_Click_on_myOrders();
//		Status = obj.when_I_Click_on_myAccount();
//		Status = obj.when_I_Click_on_myRewards();
//		Status = obj.when_I_Click_on_myNotifications();
//		Status = obj.when_I_Click_on_myOrders();
//		Status = obj.when_I_Click_on_helpCentre();
//		Status = obj.when_I_Click_on_giftCard();
//		Status = obj.when_I_Click_on_offerZone();
		
		
		
		System.out.println("Test Result.."+Status);
        //obj.validLogin();
	
	}
}
