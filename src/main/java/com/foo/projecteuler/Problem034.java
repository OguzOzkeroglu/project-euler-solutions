package com.foo.projecteuler;

import java.util.stream.IntStream;

/**
 * Digit factorials
 * 
 * @author Oguz Ozkeroglu
 * Created on 2022.06.09
 * @see <a href="https://projecteuler.net/problem=34">Digit factorials</a>
 *
 */

public class Problem034 implements EulerProblem {

	public static void main(String[] args) {
		System.out.println(new Problem034().getResult());
	}

	@Override
	public Long getResult() {
		int result = IntStream.range(3, 100_000)
				.filter(num -> num == sumOfTheDigitsFactorial(num))
				.sum();

		return (long) result;
	}

	private int sumOfTheDigitsFactorial(int number) {
		int sum = String.valueOf(number).chars()
				.map(Character::getNumericValue)
				.map(this::factorial)
				.sum();

		return sum;
	}

	private int factorial(int number) {
		return IntStream.rangeClosed(1, number)
				.reduce(1, (x, y) -> x * y);
	}
}
