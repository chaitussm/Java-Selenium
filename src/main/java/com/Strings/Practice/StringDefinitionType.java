package com.Strings.Practice;

public class StringDefinitionType 
{
	public static void StringDef()
	{
		String s = "Anitha";
		String a = new String("Anitha");
	
		int strlength = s.length();
		
		char[] n = s.toCharArray();
		
		int length = n.length;
		boolean result = s.equals(a);
		
		System.out.println(result);
		
		if(s == a)
			
			System.out.println("true");
		else 
			
			System.out.println("false");
		
	
	}
	
	public static void main(String[] args) 
	{
		StringDef();
		
	}

}
