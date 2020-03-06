package com.foo.projecteuler;

/**
 * Special Pythagorean triplet
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
