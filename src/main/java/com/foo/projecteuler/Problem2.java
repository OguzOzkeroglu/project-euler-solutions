package com.foo.projecteuler;

/**
 * 
 * <h2>Even Fibonacci numbers</h2>
 * 
 * <p>Each new term in the Fibonacci sequence is generated by adding the previous two terms. 
 * By starting with 1 and 2, the first 10 terms will be:
 * <p>1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...</p>
 * <p>By considering the terms in the Fibonacci sequence whose values do not exceed four million,
 * find the sum of the even-valued terms.</p>
 * 
 * @author Oguz Ozkeroglu
 * Created on 2019.10.11
 * @see <a href="https://projecteuler.net/problem=2">Even Fibonacci numbers</a>
 */

public class Problem2 implements EulerProblem {

	public static void main(String[] args) {
		System.out.println(new Problem2().getResult());
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
