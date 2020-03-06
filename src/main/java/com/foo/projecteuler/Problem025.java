package com.foo.projecteuler;

import java.math.BigDecimal;

/**
 * 1000-digit Fibonacci number
 * 
 * @author Oguz Ozkeroglu Created on 2020.03.06
 * @see <a href="https://projecteuler.net/problem=25">1000-digit Fibonacci number</a>
 */

public class Problem025 implements EulerProblem {
	public static void main(String[] args) {
		System.out.println(new Problem025().getResult());
	}

	@Override
	public Long getResult() {
		int i = 1000;

		while (fibonacci(i).toString().length() < 1000) {
			i++;
		}

		return (long) i + 1;
	}

	// Iterative because of memory issues
	private BigDecimal fibonacci(int number) {
		if (number == 0 || number == 1) return new BigDecimal(1);
		
		BigDecimal first = new BigDecimal(1);
		BigDecimal second = new BigDecimal(1);
		BigDecimal nTh = new BigDecimal(2);

		for (int i = 2; i <= number; i++) {
			nTh = first.add(second);
			first = second;
			second = nTh;
		}

		return nTh;
	}

}
