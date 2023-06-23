package com.Strings.Practice;

public class Immutability {

	//This Code contains string immutability
	
	public static void main(String[] args) {
		
		String s = "Durga";
		
		String s1 = s + "software";
		
        System.out.println("String s contains " + s );		
        
        /*In the above example its clearly indicates that string is immutable  because once the object created 
        
        in the String will be contained in the String  constant pool and cannot be changed*/
        
        StringBuffer sb = new StringBuffer("durga");
        
        sb.append("software");
        
        System.out.println(sb);
        
        /*In the above example its clearly proved that String buffer is mutable and we can update the object
        by adding other string*/  

	}

}
