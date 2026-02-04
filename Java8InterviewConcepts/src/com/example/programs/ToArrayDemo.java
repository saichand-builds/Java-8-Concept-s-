package com.example.programs;

import java.util.Arrays;
import java.util.List;

public class ToArrayDemo {

  public static void main(String[] args) {

    List<Integer> numberList =List.of(1,4,2,6,7,9,5);
    Integer[] evenNumber =numberList.stream().filter(number -> number %2 ==0)
        .toArray(Integer[]::new);
    System.out.println("Even Numbers  " +Arrays.toString(evenNumber));

  }

}
