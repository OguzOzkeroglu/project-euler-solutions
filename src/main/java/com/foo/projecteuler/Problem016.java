package com.foo.projecteuler;

import java.math.BigDecimal;

/**
 * Power digit sum
 * 
 * @author Oguz Ozkeroglu
 * Created on 2019.10.10
 * @see <a href="https://projecteuler.net/problem=16">Power digit sum</a>
 */

public class Problem016 implements EulerProblem {
	long sum;

	public static void main(String[] args) {
		System.out.println(new Problem016().getResult());
	}

	@Override
	public Long getResult() {
		String result = new BigDecimal(Math.pow(2, 1000)).toString();

		result.chars().forEach(c -> {
			sum += Character.getNumericValue(c);
		});

		return sum;
	}
}
