package com.scrm.generic.fileutility;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.fasterxml.jackson.core.JsonParser;
import com.google.gson.JsonObject;

public class readFromJson 
{
	/**
	 * 
	 * @param Path : enter the path to json object file
	 * @param key : enter the key you want to retrieve
	 * @return value in String format
	 * @throws ParseException
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
   public static String readFromJsonFile(String Path,String key) throws ParseException, FileNotFoundException, IOException
   { 
	   // parsing file "JSONExample.json" 
       Object obj = new JSONParser().parse(new FileReader(Path)); 
         
       // typecasting obj to JSONObject 
       JSONObject jo = (JSONObject) obj; 
         
       // getting firstName and lastName 
       String name = (String) jo.get("name"); 
       return name;
   }
}
