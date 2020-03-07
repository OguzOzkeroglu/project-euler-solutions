package com.foo.projecteuler;

/**
 * Highly divisible triangular number
 * 
 * @author Oguz Ozkeroglu
 * Created on 2020.03.07
 * @see <a href="https://projecteuler.net/problem=12">Highly divisible triangular number</a>
 */

public class Problem012 implements EulerProblem {
	public static void main(String[] args) {
		System.out.println(new Problem012().getResult());
	}

	@Override
	public Long getResult() {
		
		int i = 1;
		
		while (getFactorsCount(getNthTriangularNumber(i)) <= 500) {
			i++;
		}
		
		return (long) getNthTriangularNumber(i);
	}
	
	/**
	 * there's no need to create loop
	 * @see <a href="https://en.wikipedia.org/wiki/Triangular_number#Formula">Triangular number | Formula
	 */
	private int getNthTriangularNumber(int n) {
		return n * (n + 1) / 2;
	}
	
	/**
	 * there's no need to go till the end
	 * just go to sqrt of number and multiply by 2
	 */
	private int getFactorsCount(final int number) {
		int counter = 0;
		
		double to = Math.sqrt(number);

		for (int i = 1; i <= to; i++) {
			if (number % i == 0) {
				counter++;
			}
		}

		return counter * 2;
	}

}
