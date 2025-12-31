package com.example.programs;

public class StringBuilderTest {
	
	public static void main(String[] args) {
		
		StringBuilder sb1= new StringBuilder("abc");
		StringBuilder sb2= new StringBuilder("abc");
		
		//StringBuilder does not override equals() because it is mutable. 
		//Overriding equals() for mutable objects can violate the equality contract and break collections behavior.
		
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));
		
		//Convert to String
		System.out.println(sb1.toString().equals(sb2.toString()));
	}

}
