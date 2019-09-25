package com.sreekar.spring;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateInString {

	public static void main(String[] args) {
		
		String name="Sreekar";
		char [] nameArray=name.toCharArray();
		Map<Character,Integer> myMap=new HashMap<>();
		for(int i=0;i<nameArray.length;i++) {
			if(myMap.containsKey(nameArray[i])) {
			myMap.put(nameArray[i], myMap.get(nameArray[i])+1);
			}else {
				myMap.put(nameArray[i], 1);	
			}
		}
		
		Set<Map.Entry<Character, Integer>> entrySet = myMap.entrySet();
	for (Map.Entry<Character,Integer> entry : entrySet) {
		if(entry.getValue()>1) {
			System.out.printf("%s : %d %n", entry.getKey(), entry.getValue());
		}
	}

}
}
