package com.example.programs;

import java.util.ArrayList;
import java.util.List;

public class StringInternExample {

	public static void main(String[] args) {

		List<String> emails = new ArrayList<String>();

		for (int i = 0; i < 100000; i++) {
			String email = new String("User" + (i % 100000) + "gmail.com");
			emails.add(email);

		}
		List<String> InternalEmails = new ArrayList<String>();
		for (int i = 0; i < 100000; i++) {
			String email=new String("User" + (i%100000)+ "gmail.com");
			InternalEmails.add(email.intern());
		}
		
		InternalEmails.forEach(System.out::println);

		
		System.out.println("without intern : 1M separate String objects");
		System.out.println("with intern : 1M sepate String Objects");
		System.out.println("mwmory saved  duplicates removed");
	}

}
