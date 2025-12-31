package com.example.programs;

public class Stringtest {
	
	public static void main(String[] args) {
		
		String s1= "abc";
		String s2= new String("abc");
		
		System.out.println("comparing the values  "+ s1==s2);
		System.out.println("comparing the values  "+ s1.equals(s2));		
	}

}
