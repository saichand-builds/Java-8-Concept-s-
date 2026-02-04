package com.example.programs;

import java.util.Scanner;

public class PrimeNumber {

  public static void main(String[] args) {

    Scanner sc =new Scanner(System.in);

    System.out.println("Enter the Number");
    int n =sc.nextInt();

    if (isprime(n)) {
      System.out.println("Number is Prime Number  " +n);
    } else {
      System.out.println("Number is not Prime Number  " +n);
    }

  }

  public static boolean isprime(int n) {
    if(n<=1) {
      
      return false;
    }
    
    for (int i =2; i <=n /2; i++) {
      if (n %2 ==0) {
        return true;
      }
    }
    return false;
  }

}
