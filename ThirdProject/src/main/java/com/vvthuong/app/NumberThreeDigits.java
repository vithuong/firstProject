package com.vvthuong.app;

import java.util.Scanner;

public class NumberThreeDigits {

	public static void main(String[] args) {
		// Read Number have 3 digits
		Scanner scaner = new Scanner(System.in);

		System.out.print(">>The Number have three digits: ");
		int number = scaner.nextInt();

		// Detachment 3 digits
		int ones = number % 10; // The digit in the ones place
		number /= 10; // 2 digits remaining
		int tens = number % 10; // The digit in the tens place
		int hundreds = number / 10; // The digit in the hundreds place

		// Print to Screen
		System.out.printf("The digit in the ones is %d" 
				+ " the tens is %d" 
				+ " the hundreds is %d \r \n", ones, tens,
				hundreds);
		// Print Total of 3 digits
		System.out.println("Total of 3 digits: " + (ones + tens + hundreds));
		// Print Reverse digits of this number
		int reverseNumber = 0;
		reverseNumber = reverseNumber * 10 + ones;
		reverseNumber = reverseNumber * 10 + tens;
		reverseNumber = reverseNumber * 10 + hundreds;
		System.out.printf("Reverse digits of this number is %d", reverseNumber);

	}

}
