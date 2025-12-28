package com.example.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringJoining {

	public static void main(String[] args) {
		List<String> stringJoining = Arrays.asList("Facebook", "Twiiter", "X", "youtube", "Instagram");

		String joining = stringJoining.stream().collect(Collectors.joining(",", "[", "]"));
		
		System.out.println(joining);

	}

}
