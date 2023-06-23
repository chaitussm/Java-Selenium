package com.Arrays.Practice;

import java.util.Arrays;

public class ArrayDef {

	public static void main(String[] args) 
	{
		Object[] b = {1,'a',5,7,8,9};
		
	  int[] c = new int[5];
	  
	  for(int i = 0; i< c.length ; i++)
		 {
			 System.out.println("Integer Array elements " + c[i]);
		 }
		
		Object[] a = new Object[5];
		
		 a[0] = 1;
		 a[1] = 2;
		 a[2] = 'b';
		 
		 for(int i = 0; i< b.length ; i++)
		 {
			 System.out.println("Object Array Elements " + b[i]);
		 }
		
		 System.out.println(Arrays.toString(c));
		 
		

	}

}
