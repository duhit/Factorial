package org.cloudwick.factorial;

import java.util.Scanner;

public class RecursiveFactorial {
	
	public long factorial(long n){
		if(n == 0)
			return 1;
		else
			return n*factorial(n-1);
	}
	
	public static void main(String[] args) {
		RecursiveFactorial recursiveObject = new RecursiveFactorial();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		long number = sc.nextLong();
		recursiveObject.factorial(number);
	}
}
