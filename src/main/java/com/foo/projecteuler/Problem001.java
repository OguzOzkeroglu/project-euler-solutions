package com.foo.projecteuler;

/**
 * <h2>Multiples of 3 and 5</h2>
 * 
 * <p>If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. 
 * The sum of these multiples is 23. Find the sum of all the multiples of 3 or 5 below 1000.</p>
 * 
 * @author Oguz Ozkeroglu
 * Created on 2019.10.11
 * @see <a href="https://projecteuler.net/problem=1">Multiples of 3 and 5</a>
 */

public class Problem001 implements EulerProblem {
	
	public static void main(String[] args) {
		System.out.println(new Problem001().getResult());
	}

	@Override
	public Long getResult() {
		long sum = 0;

		for (int i = 3; i < 1000; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}

		return sum;
	}
}
