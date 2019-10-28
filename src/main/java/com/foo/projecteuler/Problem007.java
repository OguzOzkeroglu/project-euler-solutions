package com.foo.projecteuler;

/**
 * <h2>10001st prime</h2>
 * 
 * <p>By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.<br />
 * What is the 10 001st prime number?</p>
 * 
 * @author Oguz Ozkeroglu
 * Created on 2019.10.28
 * @see <a href="https://projecteuler.net/problem=7">10001st prime</a>
 */

public class Problem007 implements EulerProblem {

	public static void main(String[] args) {
		System.out.println(new Problem007().getResult());
	}

	@Override
	public Long getResult() {
		int i = 3;       // skip 2
		int counter = 1; // for 2
		int result = -1;

		while (counter < 10_001) {
			if (isPrime(i++)) {
				counter++;
				result = i - 1;
			}
		}

		return (long) result;
	}

	private boolean isPrime(int number) {
		if (number % 2 == 0) return false;

		for (int i = 3; i <= Math.sqrt(number); i += 2) {
			if (number % i == 0) return false;
		}

		return true;
	}
}
