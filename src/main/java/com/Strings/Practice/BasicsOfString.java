package com.Strings.Practice;

public class BasicsOfString {

	public static void main(String[] args) {

         String str = "example: 21/2/2022, 12:09";
         //String lat = str.replace(": " , "");
         String Latest1 = str.replaceAll("^[a-zA-Z]*:", "");
         
         
         System.out.println(Latest1);
         String[]  data = str.split(" ");
         
         for(String ele : data) {
        	 
        	System.out.println("Elements in the string is " + ele );
         }

	}

}
