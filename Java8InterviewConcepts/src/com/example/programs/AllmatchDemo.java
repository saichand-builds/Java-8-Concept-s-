package com.example.programs;

import java.util.List;

public class AllmatchDemo {
  
  public static void main(String[] args) {
    
    List<Integer> numbers =List.of(2,4,6,8,10,12,14,7);
                      boolean alleven = numbers.stream()
                              .allMatch(number -> number%2==0);
                      
                      System.out.println("all are even Numbers "+ alleven);
  }

}
