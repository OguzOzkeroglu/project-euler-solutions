package com.foo.projecteuler;

/**
 * Sum square difference
 * 
 * @author Oguz Ozkeroglu
 * Created on 2019.10.27
 * @see <a href="https://projecteuler.net/problem=6">Sum square difference</a>
 */

public class Problem006 implements EulerProblem {
	public static void main(String[] args) {
		System.out.println(new Problem006().getResult());
	}

	@Override
	public Long getResult() {
		int sum = 0;
		int sumOfSquares = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
			sumOfSquares += i * i;
		}
		return (long) (sum * sum - sumOfSquares);
	}
}
