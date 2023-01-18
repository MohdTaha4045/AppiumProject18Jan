package testNGPackage;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;
import io.appium.java_client.android.AndroidDriver;

public class BaseClass 
{
	AndroidDriver driver;
	@BeforeTest
	public void setup() throws MalformedURLException
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		 	cap.setCapability("deviceName", "Pixel 4 API 24");
	        cap.setCapability("uuid", "emulator-5554");
	        cap.setCapability("platformName", "Android");
	        cap.setCapability("platformVersion", "10");
	        //cap.setCapability("appPackage", "com.android.vending");
	        //cap.setCapability("appActivity", "com.android.vending.AssetBrowserActivity");
	        
			URL url = new URL("http://0.0.0.0:4723/wd/hub");
			driver = new AndroidDriver(url, cap);
		
		
	}
	
	@AfterTest
	public void TearDown()
	{
		
		driver.quit();
	}

}
