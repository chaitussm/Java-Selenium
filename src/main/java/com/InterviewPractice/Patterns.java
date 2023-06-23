package com.InterviewPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Patterns {
	
	
	     public static void PatternFormnat(int n)
	     {
	    	 for(int i = 0; i <=n ; i++)
	    	 {
	    		 for(int j = n ; j>=i ; j--)
	    		 {
	    			 System.out.print(" ");
	    		 }
	    		 
	    		 for(int k = 1; k<=i; k++)
	    		 {
	    			 System.out.print(" *");
	    		 }
	    		 
	    		 System.out.println();
	    	 }
	    	 
	    	 
	    	
	     }
	     
	
	
		public static void main(String[] args) 
		
		{
		
		
			PatternFormnat(3);

		
	    }

}
