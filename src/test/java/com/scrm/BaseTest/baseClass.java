package com.scrm.BaseTest;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.beust.jcommander.Parameter;
import com.scrm.generic.fileutility.readPropertyFile;
import com.scrm.generic.javautility.javaUtility;
import com.scrm.generic.webdriverutility.loginPOM;

public class baseClass implements ITestListener 
{
	ExtentSparkReporter ext;
	ExtentReports exR;
	ExtentTest test;
	public static WebDriver driver;	
	readPropertyFile rd;
	
	/**
	 * 
	 * @throws IOException
	 */
	@BeforeSuite
	public void launchBrowser() throws IOException
	{
		
		ext = new ExtentSparkReporter("./Reports/report.html");
		ext.config().setTheme(Theme.DARK);
		ext.config().setDocumentTitle("extent report");
		ext.config().setReportName("Framework Report");
		
	    exR = new ExtentReports();
		exR.attachReporter(ext);
		exR.setSystemInfo("windows", "10");
		exR.setSystemInfo("broswer", "chrome");
		
	    test = exR.createTest("Account creation","testing account creation with automation script");
	    rd = new readPropertyFile();
		String browser=rd.getBrowser();
		String url=rd.getUrl() ;
		driver=javaUtility.getBrowser(browser);
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	@BeforeTest
	public void login() throws Exception
   	{
   		String username=rd.getUserName();
   		String password=rd.getUserpassword();
   		loginPOM lpm=new loginPOM(driver);
   		lpm.getUsername().sendKeys("admin");
   		lpm.getPassword().sendKeys("admin");
   		lpm.getLoginbutton().click();
   	}
	
	@AfterSuite
	public void closeBrowser() throws IOException
	{
		String src =javaUtility.takeScreenShotasBase64(driver);
		
		test.addScreenCaptureFromBase64String(src,"error");
		exR.flush();
		driver.quit();
	}
    
	
	
	
	public void selectFromDropDownByText(WebElement ele,String text)
	{
          Select sel = new Select(ele);
          sel.selectByVisibleText(text);
	}
	public void selectFromDropDownByText(WebElement ele,int index)
	{
		Select sel = new Select(ele);
		sel.selectByIndex(index);
	}
	public void selectFromDropDownByValue(WebElement ele,String value)
	{
		Select sel = new Select(ele);
		sel.selectByValue(value);
	}
}
