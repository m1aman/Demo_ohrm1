package base_pkg1;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners_base implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test has failed: "+result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test has skipped: "+result.getName());
	}

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test has started: "+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test has passed: "+result.getName());
	}

}
