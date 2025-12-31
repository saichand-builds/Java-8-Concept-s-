package com.example.programs;

class logger {

	// private static instance
	private static logger instance = new logger();

	// private constructor
	private logger() {
		System.out.println("logger instance is Crated");
	}
	
	//  getinstance method
	public static logger getinstace() {
		return instance;
	}

	public void log(String message) {
		System.out.println("log  ->   : " + message);
	}

}

public class SingletonDemo {
	public static void main(String[] args) {

		logger l1 = logger.getinstace();
		logger l2 = logger.getinstace();

		l1.log("First commit");
		l2.log("second Commit");

		System.out.println("both instance are same  ->  " + (l1 == l2));
	}

}
