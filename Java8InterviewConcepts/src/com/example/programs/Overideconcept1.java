package com.example.programs;

class OverideconceptMain {

	public static void main(String[] args) {
		child c= new child();
		c.test();  //  child display
		c.show();  // parent display

	}

}

public class Overideconcept1 {

	private void display() {
		System.out.println("parent display");
	}

	public void show() {
		display();
	}

}

class child extends Overideconcept1 {

//	@Override
//	public void display() {
//		// TODO Auto-generated method stub
//		super.display();
//	}

	private void display() {
		System.out.println("child display");
	}

	public void test() {
		display();
	}

}
