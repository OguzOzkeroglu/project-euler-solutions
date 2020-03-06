package com.foo.projecteuler;

/**
 * Summation of primes
 * 
 * @author Oguz Ozkeroglu
 * Created on 2019.10.10
 * @see <a href="https://projecteuler.net/problem=10">Summation of primes</a>
 */

public class Problem010 implements EulerProblem {

	public static void main(String[] args) {
		System.out.println(new Problem010().getResult());
	}

	@Override
	public Long getResult() {
		long sum = 2;
		for (int i = 3; i < 2_000_000; i+=2) {
			if (isPrime(i)) sum += i;
		}

		return sum;
	}
	
	private boolean isPrime(int number) {
		if (number <= 1) return false;
		
		if (number % 2 == 0) return false;

		for (int i = 3; i <= Math.sqrt(number); i+=2) {
			if (number % i == 0) return false;
		}

		return true;
	}
}
