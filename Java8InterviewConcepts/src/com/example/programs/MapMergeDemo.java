package com.example.programs;

import java.util.HashMap;
import java.util.Map;

public class MapMergeDemo {
	
	public static void main(String[] args) {
		
		Map<String, Integer> scores= new HashMap<String, Integer>();
		scores.put("Sai", 29);
		scores.put("HArshi",27);
		
	//	scores.merge("Sai", 5, (e1, e2)-> e1+e2);
	//	scores.merge("Shafi", 3, (e1,e2)->e1+e2);
		
		scores.merge("Sai", 10, Integer :: sum);
		scores.merge("Harsh", 42,  Integer::sum);
		
		System.out.println(" Merge the Data"  +scores);
		
	}

}
