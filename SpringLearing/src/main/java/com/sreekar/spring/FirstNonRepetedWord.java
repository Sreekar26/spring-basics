package com.sreekar.spring;

import java.util.Scanner;

public class FirstNonRepetedWord {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word");
		String word = sc.nextLine();

		for (int i = 0; i < word.length(); i++) {
			if (word.indexOf(word.charAt(i)) == word.lastIndexOf(word.charAt(i))) {
				System.out.println(word.charAt(i));
				break;
			}
		}
	}
}
	


