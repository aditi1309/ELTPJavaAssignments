package com.psl.training.assignment.citystatemap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

public class CityStateMap 
{
	HashMap<String, String> hm=new HashMap<>();
	public CityStateMap() 
	{
		hm.put("Nagpur", "Maharashtra");
		hm.put("Mumbai", "Maharashtra");
		hm.put("Kolkata", "Bengal");
		hm.put("Aurangabad", "Maharashtra");
		hm.put("Patna", "Bihar");
		hm.put("Ujjain", "Madhya Pradesh");
		hm.put("Indore", "Madhya Pradesh");
		System.out.println(hm);
		// TODO Auto-generated constructor stub
	}
	
	public void getAllCities()
	{
		System.out.println("\nCities are: ");
		Set<String> keySet=hm.keySet();
		for (String string : keySet) {
			System.out.println(string);
		}
		
		
	}
	public void getAllStates()
	{
		System.out.println("\nStates are: ");
		Set<Entry<String,String>> entrySet = hm.entrySet();
		for (Entry<String, String> entry : entrySet) {
//			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			
		}
		
		System.out.println("\n"+hm.values());
	}
	

	
	
	public void citiesForStates()
    {
		Set<String> hs=new HashSet<>();
		hs.addAll(hm.values());
		for (String string : hs) 
		{
			ArrayList<String> list = new ArrayList<String>();
			if (hm.containsValue(string)) 
			{
				for (String key : hm.keySet()) 
				{
	                if (hm.get(key) == string) 
	                {
	 
	                    list.add(key);
	                }
				}
			}
			System.out.println(string+"- "+list);
        }
        
    }
 
}
	
	
	


