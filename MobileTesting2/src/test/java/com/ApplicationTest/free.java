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

public class free 
{
	public static void main(String[] args) throws MalformedURLException, InterruptedException 
	{
		
		DesiredCapabilities cap = new DesiredCapabilities();
		 cap.setCapability("deviceName", "Pixel 4 API 24");
	        cap.setCapability("uuid", "emulator-5554");
	        cap.setCapability("platformName", "Android");
	        cap.setCapability("platformVersion", "10");
	        
	        
			URL url = new URL("http://127.0.0.1:4723/wd/hub");
			AndroidDriver driver = new AndroidDriver(url, cap);
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
			
			WebDriverWait wait0 = new WebDriverWait(driver,Duration.ofSeconds(200));
		    wait0.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@content-desc=\"Apps\"]")));
		    
			driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Apps\"]")).click();
			
			driver.findElement(By.id("com.android.launcher3:id/search_drop_target_bar")).click();
			WebElement active = driver.switchTo().activeElement();
			Actions action = new Actions(driver);
			action.moveToElement(active).sendKeys("play store").sendKeys(Keys.ENTER).perform();				
			driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Play Store\"]")).click();
			 wait0.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View[1]/android.view.View")));
			    
				
			    driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View[1]/android.view.View")).click();
				
				
				WebElement textField = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.EditText"));
				textField.sendKeys("unit converter");
				
				action.moveToElement(active).sendKeys(Keys.ENTER).perform();	
	
				driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.widget.Button")).click();
				Thread.sleep(10000);
				System.out.println("Application installed..");
				
	}

}
