package com.ApplicationTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;

public class UninstallUnitConverter 
{
	public static void main(String[] args) throws MalformedURLException 
	{
		
		DesiredCapabilities cap = new DesiredCapabilities();
		 cap.setCapability("deviceName", "Pixel 4 API 24");
	        cap.setCapability("uuid", "emulator-5554");
	        cap.setCapability("platformName", "Android");
	        cap.setCapability("platformVersion", "7");
	        
	        
	        
			URL url = new URL("http://127.0.0.1:4723/wd/hub");
			AndroidDriver driver = new AndroidDriver(url, cap);
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
			
			driver.removeApp("kr.sira.unit");
			System.out.println("applicatio deleted..");

	}

	
}
