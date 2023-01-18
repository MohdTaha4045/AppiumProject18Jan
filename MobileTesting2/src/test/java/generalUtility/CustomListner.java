package generalUtility;
import org.testng.ITestListener;
import org.testng.ITestResult;
import java.io.IOException;
import baseClasses.UnitConverterBaseClass;

public class CustomListner extends UnitConverterBaseClass implements ITestListener
{
	
	@Override
	public void onTestFailure(ITestResult result)
	{
		try{
			failedTest(result.getMethod().getMethodName(),driver);
			
			}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
}
