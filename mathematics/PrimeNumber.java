package mathematics;

import java.util.Iterator;

// Program to return if a number is prime or not
// Idea is to run a loop till the square root of a number
public class PrimeNumber {
	
	
	public boolean isPrime(int num) {
		
		for (int i = 2; i*i <=num; i++) {
			
			if(num%i==0) {
				return false;
			}
			
		}
		return true;
	}
	
	public static void main(String[] args) {
		PrimeNumber pn= new PrimeNumber();
		System.out.println(pn.isPrime(15));
	}
	
	

}
