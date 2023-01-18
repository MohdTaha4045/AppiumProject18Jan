package pageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CalculatorObjectRepoClass 
{
	public CalculatorObjectRepoClass (AppiumDriver driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
		
	@AndroidFindBy(id = "com.google.android.calculator:id/digit_1")
	public WebElement testOne;
	
	@AndroidFindBy(id = "com.google.android.calculator:id/op_add")
	public WebElement testPlus;
	
	@AndroidFindBy(id = "com.google.android.calculator:id/digit_2")
	public WebElement testTwo;
	
	@AndroidFindBy(id = "com.google.android.calculator:id/eq")
	public WebElement testResult;	
	
	
	public void numOne() throws InterruptedException 
	{
		Thread.sleep(2000);
		testOne.click();
	}
	
	public void add() 
	{
		testPlus.click();
	}
	
	public void numTwo() 
	{
		testTwo.click();
	}
	
	public void equal() throws InterruptedException 
	{
		testResult.click();
		Thread.sleep(2000);
	}
}
