package org.cloudwick.factorial;

import java.util.Scanner;

public class FactorialExperiment {
	public long factorial(long n){
		if(n == 0)
			return 1;
		else
			return n+factorial(n-1);
	}
	
	public static void main(String[] args) {
		FactorialExperiment recursiveObject = new FactorialExperiment();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		long number = sc.nextLong();
		System.out.println(recursiveObject.factorial(number));
	}
}
