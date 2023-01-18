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

public class UnitConverterInstallation {
	static AndroidDriver driver;
	public static void main(String[] args) throws MalformedURLException, InterruptedException
 
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		 cap.setCapability("deviceName", "Pixel 4 API 24");
	        cap.setCapability("uuid", "emulator-5554");
	        cap.setCapability("platformName", "Android");
	        cap.setCapability("platformVersion", "7");
	        cap.setCapability("appPackage", "com.android.vending");
	        cap.setCapability("appActivity", "com.android.vending.AssetBrowserActivity");
	        
			URL url = new URL("http://0.0.0.0:4723/wd/hub");
			 driver = new AndroidDriver(url, cap);
			//Thread.sleep(5000);
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			WebDriverWait wait0 = new WebDriverWait(driver,Duration.ofSeconds(20));
		    wait0.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup")));
		    
			
		    driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup")).click();
			
			
			WebElement active = driver.switchTo().activeElement();
			
			Actions action = new Actions(driver);
			action.moveToElement(active).sendKeys("unit converter").sendKeys(Keys.ENTER).perform();	
			
		    //wait0.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.FrameLayout[@content-desc=\"Unit Converter, Smart Tools co., Contains ads\"]/android.widget.FrameLayout[2]/android.widget.Button")));
			driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Unit Converter, Smart Tools co., Contains ads\"]/android.widget.FrameLayout[2]/android.widget.Button")).click();
			System.out.println("Application installed..");
			
			
	}

	

}
