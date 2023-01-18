package test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import io.appium.java_client.android.AndroidDriver;
import pageObjectModel.CalculatorObjectRepoClass;

public class TestCalculator
{
	AndroidDriver driver;
	
	@BeforeTest
	public void browserSetup() throws MalformedURLException
	{
			DesiredCapabilities cap = new DesiredCapabilities();
			 cap.setCapability("deviceName", "Pixel 4 API 24");
		        cap.setCapability("uuid", "emulator-5554");
		        cap.setCapability("platformName", "Android");
		        cap.setCapability("platformVersion", "7");
		        cap.setCapability("appPackage", "com.google.android.calculator");
		        cap.setCapability("appActivity", "com.android.calculator2.Calculator");
		        URL url = new URL("http://127.0.0.1:4723/wd/hub");
				driver = new AndroidDriver(url, cap);
	}
	
	@Test
	public void startCalculator() throws InterruptedException
	{
		CalculatorObjectRepoClass calculate = new CalculatorObjectRepoClass(driver);
		calculate.numOne();
		calculate.add();
		calculate.numTwo();
		calculate.equal();
	}

}