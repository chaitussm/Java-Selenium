package com.Listners.TestNg;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNgListner implements ITestListener
{
	@Override
   public void onStart(ITestContext arg0)
   {
	   
   }
	@Override
	public void onFinish(ITestContext arg0)
	{
		   
	}
	@Override
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Test Passed details are " + result.getName());
	}
	@Override
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Test Failed details are " + result.getName());
		
	}
	@Override
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("Test Skipped details are " + result.getName());
	}
	@Override
	public void onTestStart(ITestResult result)
	{
		System.out.println("Test started details are " + result.getName());
	}
}
