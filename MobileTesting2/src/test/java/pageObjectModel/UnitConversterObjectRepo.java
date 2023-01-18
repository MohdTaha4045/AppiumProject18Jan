package pageObjectModel;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import baseClasses.UnitConverterBaseClass;



public class UnitConversterObjectRepo extends UnitConverterBaseClass
{
	public UnitConversterObjectRepo(AndroidDriver driver) 
	{

		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup")
	public WebElement textField;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]")
	public WebElement searchOption;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.EditText")
	public WebElement actualTextField;
	
	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Unit Converter, Smart Tools co., Contains ads\"]/android.widget.FrameLayout[2]/android.widget.Button")
	public WebElement installButton;
	
	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Unit Converter, Installed, \"]/android.widget.FrameLayout[2]/android.widget.Button")
	public WebElement openButton;
	
	@AndroidFindBy(id = "//android.widget.TextView[@content-desc=\\\"Unit Converter\\\"]")
	public WebElement unitConverter;
	

	@AndroidFindBy(id = "kr.sira.unit:id/tab0_input")
	public WebElement unitConverterInput;
	
	@AndroidFindBy(id = "kr.sira.unit:id/tab0_numback")
	public WebElement backSpace;
	
	
	
	public void clickTextField()
	{
		textField.click();		
	}
	public void passUnitConverter()
	{
		
		actualTextField.sendKeys("unit converter");
		
	}
	
	public void clickInstallButton() throws InterruptedException
	{
		installButton.click();	
		System.out.println("Application Installing...");
		//Thread.sleep(15000);
		System.out.println("Application Installed");

	}
	
	public void clickOpenButton()
	{ 
		driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);				
		openButton.click();
	}
	
	public void clickSearchOption()
	{
		
		searchOption.click();	
	}
	@AndroidFindBy(id = "kr.sira.unit:id/tab0_num0")
	public WebElement zero;

	@AndroidFindBy(id = "kr.sira.unit:id/tab0_num1")
	public WebElement one;
	
	@AndroidFindBy(id = "kr.sira.unit:id/tab0_num2")
	public WebElement two;
	
	@AndroidFindBy(id = "kr.sira.unit:id/tab0_num3")
	public WebElement three;
	
	@AndroidFindBy(id = "kr.sira.unit:id/tab0_num4")
	public WebElement four;
	
	@AndroidFindBy(id = "kr.sira.unit:id/tab0_num5")
	public WebElement five;
	
	@AndroidFindBy(id = "kr.sira.unit:id/tab0_num6")
	public WebElement six;
	
	@AndroidFindBy(id = "kr.sira.unit:id/tab0_num7")
	public WebElement seven;

	@AndroidFindBy(id = "kr.sira.unit:id/tab0_num8")
	public WebElement eight;
	
	@AndroidFindBy(id = "kr.sira.unit:id/tab0_num9")
	public WebElement nine;

	
	public void zeroPress()
	{
		zero.click();
	}
	
	public void onePress()
	{
		one.click();
	}
	
	public void twoPress()
	{
		two.click();
	}
	
	public void threePress()
	{
		three.click();
	}
	
	public void fourPress()
	{
		four.click();
	}
	
	public void fivePress()
	{
		five.click();
	}
	
	public void sixPress()
	{
		six.click();
	}
	
	public void sevenPress()
	{
		seven.click();
	}
	
	public void eightPress()
	{
		eight.click();
	}
	
	public void ninePress()
	{
		nine.click();
	}
	
	public void backspacePress()
	{
		backSpace.click();
	}

	public boolean Verification1() 
		{
		String expectedOutput1 = "0.635";
		unitConverterInput.click();
		twoPress();
		fivePress();
		String actualOutput1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.TabHost/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[6]/android.widget.LinearLayout/android.widget.TextView")).getText();

		return actualOutput1.equals(expectedOutput1);
		}

	
	public boolean Verification2() 
	{
	String expectedOutput2 = "wrongInput";
	backspacePress();
	backspacePress();
	onePress();
	zeroPress();
	String actualOutput2 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.TabHost/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[6]/android.widget.LinearLayout/android.widget.TextView")).getText();
	return actualOutput2.equals(expectedOutput2);
	}

	public boolean Verification3() 
	{
	String expectedOutput3 = "1.3208";
	backspacePress();
	backspacePress();
	fivePress();
	twoPress();
	String actualOutput3 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.TabHost/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[6]/android.widget.LinearLayout/android.widget.TextView")).getText();

	return(actualOutput3.equals(expectedOutput3));
	}
	
	public void unInstallApp()
	{
		driver.removeApp("kr.sira.unit");
		System.out.println("applicatio deleted..");
	}
	
	
	
	
}
	

