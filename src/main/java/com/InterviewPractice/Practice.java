package com.InterviewPractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.commons.lang3.ArrayUtils;

public class Practice 
{
	
	 public static int[] twoSum(int[] nums, int target) 
	 {
		 
		    Map<Integer,Integer> map= new HashMap<Integer,Integer>();
		 
		    
		        for(int i=0;i<nums.length;i++)
		        {		        	//System.out.println(Arrays.binarySearch(nums,target-nums[i]));
		           if(map.containsKey(target-nums[i]))
		           {
		        	   //System.out.println(target-nums[i]);
		        	   //System.out.println(i);
		            return new int[]{map.get(target-nums[i]),i};
		           }
		        	   
		           else {
		        	   
		        	   map.put(nums[i],i);
		           }
		           
		        }
		        
		       return new int[] {-1,-1};
		        
	 }

		
		
	
 
	public static void main(String[] args) 
	{
		int[] a = {1,2,3,4};
		int total = 5;
		
		int[] finalarr = twoSum(a, total);
		
		System.out.println("Final array is " + Arrays.toString(finalarr));
		
	}

}
