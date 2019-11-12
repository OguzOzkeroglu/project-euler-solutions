package com.foo.projecteuler;

/**
 * <h2>Special Pythagorean triplet</h2>
 * 
 * <p>A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 * <center>a^2+ b^2 = c^2</center>
 * For example, 3^2 + 4^2 = 9 + 16 = 25 = 52.<br />
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.</p>
 * 
 * @author Oguz Ozkeroglu
 * Created on 2019.11.12
 * @see <a href="https://projecteuler.net/problem=1">Special Pythagorean triplet</a>
 */

public class Problem009 implements EulerProblem {

	public static void main(String[] args) {
		System.out.println(new Problem009().getResult());
	}

	@Override
	public Long getResult() {
		for (int a = 1; a < 500; a++) {
			for (int b = a + 1; b < 500; b++) {
				int squared = a * a + b * b;
				double c = Math.pow(squared, 0.5);

				if (a + b + c == 1000) {
					return (long) (a * b * c);
				}
			}
		}
		return -1L;
	}
}
