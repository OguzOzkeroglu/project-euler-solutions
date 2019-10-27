package com.foo.projecteuler;

/**
 * <h2>Sum square difference</h2>
 * 
 * <p>The sum of the squares of the first ten natural numbers is,
 * <center>1^2 + 2^2 + ... + 10^2 = 385</center>
 * The square of the sum of the first ten natural numbers is,
 * <center>(1 + 2 + ... + 10)^2 = 55^2 = 3025</center>
 * Hence the difference between the sum of the squares of the first ten natural numbers<br />
 * and the square of the sum is 3025 − 385 = 2640.<br />
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.</p>
 * 
 * @author Oguz Ozkeroglu
 * Created on 2019.10.27
 * @see <a href="https://projecteuler.net/problem=6">Sum square difference</a>
 */

public class Problem6 implements EulerProblem {
	public static void main(String[] args) {
		System.out.println(new Problem6().getResult());
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
