package com.sreekar.spring;

public class BubbleSort {
	
	public static void main(String[] args) {
		
		String name="sreekar";
		char[] testArray=name.toCharArray();
		for(int i=0;i<testArray.length;i++) {
			for(int j=i+1;j<testArray.length;j++) {
				
				if(testArray[j]<testArray[i]) {
					char temp=testArray[i];
					
					testArray[i]=testArray[j];
					testArray[j]=temp;
					
					
				}
				
			}
		}
		System.out.println(testArray);
	}

}
