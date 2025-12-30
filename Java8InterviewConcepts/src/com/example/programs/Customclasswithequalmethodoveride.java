package com.example.programs;

import java.util.Objects;

public class Customclasswithequalmethodoveride {

	public static void main(String[] args) {

		person1 p1 = new person1("Sai");
		person1 p2 = new person1("Sai");

		System.out.println("compare the values  ->  " + (p1 == p2));

		// with out overide the equals method
		// it will compare the values

		// Ans : False

		// System.out.println("compare the values -> " + ( p1.equals(p2)));

		// After Overide the Equals method

		System.out.println("compare the values  ->  " + (p1.equals(p2)));

	}

}

class person1 {
	String name;

	person1(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		person1 other = (person1) obj;
		return Objects.equals(name, other.name);
	}

}
