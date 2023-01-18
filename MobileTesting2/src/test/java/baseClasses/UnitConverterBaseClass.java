package baseClasses;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;
import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Allure;

public class UnitConverterBaseClass
{
	public static AndroidDriver driver;
	@SuppressWarnings("deprecation")
	@BeforeClass
	public void setup () throws MalformedURLException, InterruptedException
 
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		 cap.setCapability("deviceName", "Pixel XL API 24");
	        cap.setCapability("uuid", "emulator-5554");
	        cap.setCapability("platformName", "Android");
	        cap.setCapability("platformVersion", "7");
	        cap.setCapability("appPackage", "com.android.vending");
	        cap.setCapability("appActivity", "com.android.vending.AssetBrowserActivity");
	        
			URL url = new URL("http://0.0.0.0:4723/wd/hub");
			 driver = new AndroidDriver(url, cap);
			 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	public void failedTest(String testMethod , AndroidDriver driver) throws IOException
	{
		
		UnitConverterBaseClass.driver = driver;
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Date currentdate = new Date();
		String screenshotFileName = currentdate.toString().replace(" ", "_").replace(":", "_");;
		FileUtils.copyFile(screenshotFile, new File(".//screenshot//"+screenshotFileName+".png"));
		Allure.attachment(screenshotFileName, new ByteArrayInputStream(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES)));		
	}
	
	@AfterClass
	public void tearDownBrowser()
	{
		driver.quit();
	}
}
