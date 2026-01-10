package com.example.programs;

abstract class Payment {

	protected String Currency;

	// abstract class constructor
	Payment() {
		this.Currency = "INR";
		System.out.println("Payment Initialized");

	}
}

class UpiPayment extends Payment {

	// subclass constructor
	public UpiPayment() {
		System.out.println("UPT Payment Created");
	}
}

public class AbstractConstructorEx1 {
	public static void main(String[] args) {

		// Execution order:

		// JVM calls Payment() constructor (abstract class)

		// Then JVM calls UpiPayment() constructor (child class)

		new UpiPayment();
	}

}
