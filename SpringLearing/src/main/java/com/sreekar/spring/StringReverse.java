package com.sreekar.spring;

public class StringReverse {
	public static void main(String[] args) {
		String str = "India";
		String reverseStr = reverseRecursively(str);
		System.out.println("Reverse String in Java using Recursion: " + reverseStr);

	}

	private static String reverseRecursively(String str) {
		if (str.length() < 2) {
			return str;
		}
		return reverseRecursively(str.substring(1)) + str.charAt(0);
	}
}
