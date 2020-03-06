package com.foo.projecteuler;

import java.math.BigDecimal;

/**
 * Factorial digit sum
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
