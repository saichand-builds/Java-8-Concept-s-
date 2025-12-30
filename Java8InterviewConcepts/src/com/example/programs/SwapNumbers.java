package com.example.programs;

public class SwapNumbers {
	public static void main(String[] args) {

		int a = 20;
		int b = 10;

		// 20+10=30 -> a
		// 30-10=20 ->b
		// 30-20=10 ->a
		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println(" a value is " + a);
		System.out.println(" b value is " + b);
	}

}
