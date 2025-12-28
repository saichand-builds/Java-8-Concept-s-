package com.example.programs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Multipleof5 {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(45, 12, 15, 89, 90, 56, 50);
// ForEach
//						numbers.stream()
//						.filter(n->n%5==0).forEach(System.out :: println);

//                           List
//		List<Integer> Result = numbers.stream().filter(n -> n % 5 == 0).collect(Collectors.toList());
//		System.out.println(Result);

//                             Set		
//		Set<Integer> Result = numbers.stream().filter(n -> n % 5 == 0).collect(Collectors.toSet());
//		System.out.println(Result);

		
// 					MAP		
		Map<Integer, String> Result = numbers.stream().filter(n -> n % 5 == 0).collect(Collectors.toMap(n -> n,

				n -> "Divisible by 5"));
		System.out.println(Result);
	}

}
