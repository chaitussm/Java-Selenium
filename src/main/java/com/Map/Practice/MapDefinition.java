package com.Map.Practice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDefinition 
{
	public static void MapDef()
	{
		//generics
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(100, "Rama");
		map.put(101, "Sundereshwar");
		map.put(102, "Meenakshi");
		map.put(103,  "Lakshmi");
		
		Set<Integer> keyset = map.keySet();
		
		System.out.println("Keys are " + keyset);
		
		Collection<String> values = map.values();
		
		System.out.println("Values are" + values);
		
		Set<Map.Entry<Integer, String>>entryset = map.entrySet();
		
		for(Map.Entry<Integer, String> ele : entryset)
		{
			System.out.println(ele.getKey() + "====" + ele.getValue());
		}
		
	}

	public static void main(String[] args) 
	{
		MapDef();

	}

}
