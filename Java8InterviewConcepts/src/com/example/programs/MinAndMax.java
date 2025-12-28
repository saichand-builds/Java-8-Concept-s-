package com.example.programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinAndMax {

	public static void main(String[] args) {

		List<Integer> listofnumber = Arrays.asList(34, 67, 11, 23, 43, 78, 42, 97, 54);
		int Maxsorting = listofnumber.stream().sorted().max(Comparator.naturalOrder()).get();
		System.out.println(Maxsorting);

		int minsorting = listofnumber.stream().sorted().min(Comparator.naturalOrder()).get();

		System.out.println(minsorting);

	}

}
