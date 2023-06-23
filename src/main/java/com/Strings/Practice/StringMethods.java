package com.Strings.Practice;

public class StringMethods {
   
	//This program includes string functions available and its uses 
	
	public static void main(String[] args) {
	
		//Split methods in the string helps to split the string as per the user/System requirement
		String b = "02/11/2022";
		String[] a = b.split("/");
		
		for(String ele : a) {
			
			System.out.println("Elements in the array are " + ele);
		}
		
		for(int i =0 ; i< a.length ; i++)
		{
			System.out.println("Elements in the array are " + a[i]);
		}
		
		//Note: The trim() method doesn�t eliminate middle spaces.
		String f = " Bangalore is a beautiful City ";
		
		String n = f.trim();
		
		System.out.println("Updated String is " + n );
		
		//To repeat the string for the required times repeat()
		String e = "Ram is having cycle";
		
		String reps = e.repeat(2);
		
		System.out.println("repeated characters in the String are " + reps);
		
		// Replace methods in string
		String upe = e.replace("is", "is already");
		
		System.out.println("Updated String is " + upe );
		
		//To remove the spaces between strings we need to go for Replace ALL
		
		String str = n.replaceAll("\\s", "5");
		System.out.println("Updated String after removing spaces is " + str);
		
		//To Remove the aplphabets in the strings and replace it with numbers 
		
	
		String numstr = f.replaceAll("[a-z(.)]" , "9");
		System.out.println("Numeric string is"  + numstr);
		//to reomve the capital letters use below cod e
		String nustr = f.replaceAll("[a-zA-Z(.)]" , "9");
		System.out.println("Numeric string after removing all alphabets is"  + nustr);

		//tO REOMVE ALPHABETS INTHE APLHANUMERIC STRING 
		String str1 = "feeL9 m0y l7ve ";

		String alphstr = str1.replaceAll("[0-9(.)]", "");
		System.out.println("Alphabetic String " + alphstr);
		
		//Example 2 
		
		String stR = "456Aravind";
		String NumStr = stR.replaceAll("[a-zA-Z(.)]" , "");
		
		System.out.println("Final String is " + NumStr);
		    
		   
	}
	
	
	
	
        
}
