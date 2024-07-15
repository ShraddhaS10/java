package com.gvacharya.primenumber;

public class PrimeNumberOrNot {
	
	public static void main(String[] args) {

		boolean isPrime;
		for(int j = 2;j<100;j++)
		{
			isPrime = true;
			for (int i = 2; (i * i) <= j; i++) {

				if (j % i == 0) {
					isPrime = false;
					break;
				}
			
			}
			
			if(isPrime)
			{
				System.out.println("no is prime no:" + j);
			}
		}
	}
	

}
