package com.foo.projecteuler;

/**
 * https://projecteuler.net/problem=10
 * 
 * <h2>Summation of primes</h2>
 * 
 * <p>The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.<br/>
 * Find the sum of all the primes below two million.</p>
 * 
 * @author Oguz Ozkeroglu
 * Created on 2019.10.10
 */

public class Problem10 implements EulerProblem {

	public static void main(String[] args) {
		System.out.println(new Problem10().getResult());
	}

	@Override
	public Long getResult() {
		long sum = 0;
		for (int i = 2; i < 2_000_000; i++) {
			if (isPrime(i)) sum += i;
		}

		return sum;
	}
	
	private boolean isPrime(int number) {
		if (number <= 1) return false;

		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) return false;
		}

		return true;
	}
}
