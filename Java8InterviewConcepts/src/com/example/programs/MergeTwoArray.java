package com.example.programs;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoArray {

	public static void main(String[] args) {

		int[] array1 = new int[] { 1, 3, 5, 7, 24, 9 };

		int[] array2 = new int[] { 8, 4, 90, 76, 56, 23 };
		
		int[] mergeArray= IntStream.concat(Arrays.stream(array1), Arrays.stream(array1))
				.distinct()
				.sorted()
				.toArray();
		System.out.println(Arrays.toString(mergeArray));
	}

}
