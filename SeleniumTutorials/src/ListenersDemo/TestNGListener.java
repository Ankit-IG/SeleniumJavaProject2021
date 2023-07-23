package ListenersDemo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListener implements ITestListener {
	
	@Override
public void onFinish(ITestContext arg0) {
		
	}

	@Override
	public void onStart(ITestContext arg0) {
	// TODO Auto-generated method stub
	
  }

    @Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
	// TODO Auto-generated method stub
	}

	@Override
	public void onTestFailure(ITestResult result) {
	
		System.out.println("TestCase Failed and details are "+result.getName());
 }

	@Override
	public void onTestSkipped(ITestResult result) {
		
		System.out.println("TestCase skipped and details are "+result.getName());
   
	}

    @Override
	public void onTestStart(ITestResult result) {
    	
    	System.out.println("TestCase started and details are "+result.getName());
	
	
	}
    @Override
    public void onTestSuccess(ITestResult result) {
    	
    	System.out.println("TestCase success hurry and details are "+result.getName());
	}

	
}
