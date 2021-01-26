package com.reg.interview_excercise;

import java.util.Arrays;

public class AnagramStrings {// AnagramStrings

	public static boolean anagramCheck(String str1, String str2) {

		// TO replace the empty spaces in the string by using the replace method
		String x = str1.replace(" ", "");
		System.out.println(x);
		String y = str2.replace(" ", "");
		System.out.println(y);
		// to convert the given string into the lowercase
		x = x.toLowerCase();
		System.out.println(x);
		y = y.toLowerCase();
		System.out.println(y);
		char[] ch1 = x.toCharArray();
		char[] ch2 = y.toCharArray();
		Arrays.sort(ch1);
		System.out.println(Arrays.toString(ch1));
		Arrays.sort(ch2);
		System.out.println(Arrays.toString(ch2));
		return Arrays.equals(ch1, ch2);
	}

	public static void main(String[] args) {
		String str1 = "He is AraDhya";
		 String str2 = "is HE HraDAYA";
		//String str1 = "He is rama";
		//String str2 = "is HE amar";
		System.out.println("Both Strings are Anagrams : " + anagramCheck(str1, str2));
	}
}
