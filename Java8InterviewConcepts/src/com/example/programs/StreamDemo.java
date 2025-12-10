package com.example.programs;

import java.nio.file.DirectoryStream.Filter;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
	
	public static void main(String [] args) {
		
		List<String> names= List.of("1",  "Code","RUN","Debug");
		
		List<String> Result= names.stream()
											.filter(s -> s.length() >2) 
											.map(String :: toUpperCase)
											.limit(3)
											.collect(Collectors.toList());
		
		System.out.println("results is  "+ Result);
		
	}

}
