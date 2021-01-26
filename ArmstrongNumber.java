package com.reg.interview_excercise;

public class ArmstrongNumber {

	static void armstrong(int num) {
		int newNum = 0, remainder, temp;
		temp = num;
		// find sum of all digit's cube of the number.
		while (temp != 0) {
			remainder = temp % 10;
	//		System.out.println("reminder  " + remainder);
			newNum = newNum + remainder * remainder * remainder;
	//		System.out.println("\nnewNum  " + newNum);
	//		System.out.println("\nBefore into temp  "+temp);
			temp = temp / 10;
	//		System.out.println("\ntemp  " + temp);
			
		}
		// Check if sum of all digit's cube of the number is
		// equal to the given number or not.
		if (newNum == num) {
			System.out.println(num + " is armstrong.");
		} else {
			System.out.println(num + " is not armstrong.");
		}
	}

	public static void main(String[] args) {
		armstrong(153);
	}
}
