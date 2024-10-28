package com.scrm.BaseTest;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.scrm.generic.javautility.javaUtility;

public class listenerIMplementation implements ITestListener
{
	
	@Override
		public void onStart(ITestContext context) {
			Reporter.log("");
		}
	
   @Override
public void onTestFailure(ITestResult result) {
   
    try {
    	 Reporter.log("hi");
		javaUtility.takeScreenShotasFile(baseClass.driver);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
