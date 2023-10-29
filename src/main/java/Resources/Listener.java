package Resources;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import Base.BasePage;

public class Listener extends BasePage implements ITestListener{
	
	public Listener() throws IOException
	{
		super();
	}
	
	public void onTestFailure(ITestResult result)
	{
	try
	{
		takeSnapShot(result.getName());
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
	}

}
