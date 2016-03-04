package org.cloudwick.factorial;

public class SimpleFactorial {
	
	public static long factorial(long n){
		if(n == 0)
			return 1;
		else
			return n*factorial(n-1);
	}
	
	public static void main(String []args){
		long fact=1;
		for(long n = 1 ; n <= 20; n++){
			fact = factorial(n);
			
			System.out.println(n + "! = " + fact);
		}
		
	}
}
