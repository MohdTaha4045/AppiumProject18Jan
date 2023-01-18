package com.ApplicationTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

public class Calculator {
	static AppiumDriver driver;
	public static void main(String[] args) throws MalformedURLException 
	{
		DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setCapability("deviceName", "Pixel API 30");
		dc.setCapability("uuid", "361b4661");
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "10");
		dc.setCapability("noReset", true);
		dc.setCapability("appPakage", "com.miui.calculator");
		dc.setCapability("appActivity", "com.miui.calculator.cal.CalculatorActivity");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		 driver = new AppiumDriver(url, dc);
		System.out.println("Application started..");	
		}

}
