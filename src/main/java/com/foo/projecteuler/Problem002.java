package com.foo.projecteuler;

/**
 * Even Fibonacci numbers
 * 
 * @author Oguz Ozkeroglu
 * Created on 2019.10.11
 * @see <a href="https://projecteuler.net/problem=2">Even Fibonacci numbers</a>
 */

public class Problem002 implements EulerProblem {

	public static void main(String[] args) {
		System.out.println(new Problem002().getResult());
	}

	@Override
	public Long getResult() {
		long sum = 0;
		int i = 0;
		while (fibonacci(++i) < 4_000_000) {
			if (fibonacci(i) % 2 == 0) sum += fibonacci(i);
		}

		return sum;
	}

	private int fibonacci(int n) {
		if (n <= 2) return n;
		return fibonacci(n - 2) + fibonacci(n - 1);
	}
}
