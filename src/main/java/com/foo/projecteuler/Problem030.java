package com.foo.projecteuler;

import java.util.stream.IntStream;

/**
 * Digit fifth powers
 * 
 * @author Oguz Ozkeroglu
 * Created on 2021.01.21
 * @see <a href="https://projecteuler.net/problem=30">Digit fifth powers</a>
 */

public class Problem030 implements EulerProblem {
	
	public static void main(String[] args) {
		System.out.println(new Problem030().getResult());
	}

	@Override
	public Long getResult() {
		int result = IntStream
				.range(2, 1_000_000)
				.filter(number -> number == getSumOfFifthPowers(number))
				.sum();

		return (long) result;
	}

	private int getSumOfFifthPowers(int number) {
		return Integer.toString(number).chars()
				.map(Character::getNumericValue)
				.map(digit -> (int) (Math.pow(digit, 5)))
				.sum();
	}
}
