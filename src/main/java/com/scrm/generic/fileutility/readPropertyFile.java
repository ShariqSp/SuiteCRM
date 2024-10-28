package com.scrm.generic.fileutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import com.fasterxml.jackson.databind.annotation.JsonAppend.Prop;
import com.google.j2objc.annotations.Property;

public class readPropertyFile 
{
	private String userName;
	private String userpassword;
	private String url;
	private String browser;

	public readPropertyFile() throws IOException
	{
		String propFile="./resourceFiles/appProperties.properties";
		FileInputStream fis = new FileInputStream(propFile);
		Properties pos = new Properties();
		pos.load(fis);
		userName=pos.getProperty("username");
		userpassword=pos.getProperty("password");
		url=pos.getProperty("url");
		browser=pos.getProperty("browser"); 
	}
	public readPropertyFile(String propFile) throws IOException
	{
		FileInputStream fis = new FileInputStream(propFile);
		Properties pos = new Properties();
		pos.load(fis);
		userName=pos.getProperty("username");
		userpassword=pos.getProperty("password");
		url=pos.getProperty("url");
		browser=pos.getProperty("browser"); 
	}
	public String getUserName() {
		return userName;
	}
	public String getUserpassword() {
		return userpassword;
	}
	public String getUrl() {
		return url;
	}
	public String getBrowser() {
		return browser;
	}
	
	


}
