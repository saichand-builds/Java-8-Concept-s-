package com.example.programs;

public class BuzzNumber {

	public static void main(String[] args) {

		int Num = 32;

		// A Buzz Number is a number that satisfies any one of the following conditions:
		//1. It ends with 7, or
		//2. It is divisible by 7

		if (Num % 10 == 7 || Num % 7 == 0) {
			System.out.println(Num + " Number is BuzzNumber");
		} else {
			System.out.println(Num + " Number is not BuzzNumber");
		}

	}

}
