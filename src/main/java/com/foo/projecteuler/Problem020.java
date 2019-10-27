package com.foo.projecteuler;

import java.math.BigDecimal;

/**
 * <h2>Factorial digit sum</h2>
 * 
 * <p>n! means n × (n − 1) × ... × 3 × 2 × 1<br />
 *
 * For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,<br />
 * and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.<br />
 *
 * Find the sum of the digits in the number 100!</p>
 * 
 * @author Oguz Ozkeroglu
 * Created on 2019.10.11
 * @see <a href="https://projecteuler.net/problem=20">Factorial digit sum</a>
 */

public class Problem020 implements EulerProblem {
	long sum;

	public static void main(String[] args) {
		System.out.println(new Problem020().getResult());
	}

	@Override
	public Long getResult() {
		String result = factorial(100).toString();

		result.chars().forEach(c -> {
			sum += Character.getNumericValue(c);
		});

		return sum;
	}

	private BigDecimal factorial(int number) {
		if (number <= 2) return new BigDecimal(number);
		return new BigDecimal(number).multiply(factorial(number - 1));
	}
}
