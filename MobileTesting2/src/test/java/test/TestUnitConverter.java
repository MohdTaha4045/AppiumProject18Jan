package test;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.testng.Assert;
import org.testng.annotations.*;
import baseClasses.UnitConverterBaseClass;
import generalUtility.CustomListner;
import io.qameta.allure.Allure;
import pageObjectModel.UnitConversterObjectRepo;

@Listeners(CustomListner.class)
public class TestUnitConverter extends UnitConverterBaseClass
{
	@Test(priority = 1) 
	public void ClickTextField() 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		UnitConversterObjectRepo repo=new UnitConversterObjectRepo(driver);
		repo.clickTextField();
	}

	
	@SuppressWarnings("deprecation")
	@Test(priority=2)
	public void passUnitConverter() throws InterruptedException, NullPointerException
	{
		
		UnitConversterObjectRepo repo=new UnitConversterObjectRepo(driver);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);				
		Allure.step("Pass Unit Converter inside search box");
		repo.passUnitConverter();
		Thread.sleep(3000);		
	}	
	
	@SuppressWarnings("deprecation")
	@Test(priority=3)
	public void clickSearchOption() 
	{
		UnitConversterObjectRepo repo=new UnitConversterObjectRepo(driver);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);				
		Allure.step("Click on search Option");
		repo.clickSearchOption();	
	}	
		
	@Test(priority=4)
	public void installButton() throws InterruptedException 
	{
		UnitConversterObjectRepo repo=new UnitConversterObjectRepo(driver);
		Allure.step("Click on installButton");
		repo.clickInstallButton();			
	}	
	
	@Test(priority=5)
	public void openButton() throws InterruptedException 
	{
		UnitConversterObjectRepo repo=new UnitConversterObjectRepo(driver);
		Allure.step("Click on openButton");
		repo.clickOpenButton();			
	}	
	
	@Test(priority=6)
	public void validation1() 
	{
		UnitConversterObjectRepo repo=new UnitConversterObjectRepo(driver);
		Allure.step("validating result value of 25");
		Assert.assertTrue(repo.Verification1());
	}	
	
	@Test(priority=7)
	public void validation2() 
	{
		UnitConversterObjectRepo repo=new UnitConversterObjectRepo(driver);
		Allure.step("validating result value of 10");
		Assert.assertTrue(repo.Verification2());
	}	
	
	@Test(priority=8)
	public void vlaidation3() 
	{
		UnitConversterObjectRepo repo=new UnitConversterObjectRepo(driver);
		Allure.step("validating result value of 52");
		Assert.assertTrue(repo.Verification3());
	}	
	
	@Test(priority=9)
	public void uninstallButton() 
	{
		UnitConversterObjectRepo repo=new UnitConversterObjectRepo(driver);
		Allure.step("Click on unInstallButton");
		repo.unInstallApp();			
	}	
	
	
	
	
	
}
