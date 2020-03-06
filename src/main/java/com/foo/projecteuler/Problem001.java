package com.foo.projecteuler;

/**
 * Multiples of 3 and 5
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
