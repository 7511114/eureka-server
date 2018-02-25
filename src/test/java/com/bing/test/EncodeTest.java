package com.bing.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EncodeTest {

	public static void main(String[] args) {
		String str = "18638823718‬";
		String phoneNo = checkNum(str);
		System.out.println(str.length());
		System.out.println(phoneNo.length());
	}
	
	public static String checkNum(String num){
		  if(num == null || num.length() == 0){return "";}
		  Pattern pattern = Pattern.compile("\\d{11}"); 
		  Matcher matcher = pattern.matcher(num); 
		      StringBuffer bf = new StringBuffer(64); 
		      while (matcher.find()) { 
		        bf.append(matcher.group()).append(","); 
		      } 
		      int len = bf.length(); 
		      if (len > 0) { 
		        bf.deleteCharAt(len - 1); 
		      } 
		      return bf.toString();
		 } 
	
}
