package com.scrm.generic.javautility;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Date;
import java.sql.Time;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

import net.bytebuddy.utility.RandomString;

public class javaUtility {
	public static List<Long> l = new ArrayList<Long>();
	public static Random rd = new Random();
	public static RandomString rs = new RandomString();


	/**
	 * 
	 * @param domain : enter your domain
	 * @param n : enter total number
	 * @return : returns list of strings
	 */
	public static  List<String> randomStrings(String domain,int n){
		String randomEmail="";
		List<String> Emails = new ArrayList<String>();
		while(n!=0)
		{
			randomEmail=rs.nextString()+domain;
			if(!Emails.contains(randomEmail))
				Emails.add(randomEmail);
			n--;
		}
		return Emails;
	}
	/**
	 * generates random mobile number
	 * @param inttype n
	 * @return long type mobile number
	 */
	public static List<Long> randomNUmber(int n)
	{
		long rdNUmber=1;
		while(n!=0) {
			rdNUmber=rdNUmber+rd.nextLong(999999999l); 
			rdNUmber= new Long(9+""+rdNUmber);
			if(!l.contains(rdNUmber) &&(rdNUmber+"").length() ==10 )
			{
				l.add(rdNUmber);
				n--;
			}
			rdNUmber=1;

		}
		return l;
	}
	/**
	 * generates random string
	 * @param n indicates hoemany string 
	 * @return list of string
	 */
	public static  List<String> randomNames(int n){
		String name="";
		List<String> names = new ArrayList<String>();
		while(n!=0)
		{
			name=rs.nextString();
			if(!names.contains(name))
				names.add(name);
			n--;
		}
		return names;
	}
	/**
	 * 
	 * @param used to select browser
	 * @return object of selected browser
	 */
	public static WebDriver getBrowser(String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
			return new ChromeDriver();
		else if(browser.equalsIgnoreCase("firefox"))
			return new FirefoxDriver();
		else if(browser.equalsIgnoreCase("edge"))
			return new EdgeDriver();
		else 
			return new ChromeDriver();
	}

	public static void takeScreenShotasFile(WebDriver driver) throws IOException {
		TakesScreenshot ts  = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);	
		DateTimeFormatter dt =  DateTimeFormatter.ofPattern("dd_MM_yyyy_HH_mm+ss");
		LocalDateTime lcd=LocalDateTime.now();
		File dst =new File("./ScreenShots/"+dt.format(lcd).toString()+".png"); 
		Files.copy(src, dst);
        
	}
	public static String takeScreenShotasBase64(WebDriver driver) throws IOException {
		TakesScreenshot ts  = (TakesScreenshot) driver;
		String src = ts.getScreenshotAs(OutputType.BASE64);	
        return src;
	}

}
