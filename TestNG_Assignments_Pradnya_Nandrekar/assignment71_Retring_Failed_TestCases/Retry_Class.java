package assignment71_Retring_Failed_TestCases;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry_Class implements IRetryAnalyzer
{

	@Override
	public boolean retry(ITestResult result) 
	{
		int InitialCount = 0;
		int RetryCount = 2;
		if(InitialCount<RetryCount)
		{
			InitialCount++;
			return true;
		}
		
		return false;
	}

}
