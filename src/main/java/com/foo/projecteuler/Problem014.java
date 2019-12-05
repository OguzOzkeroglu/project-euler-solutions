package com.foo.projecteuler;

/**
 * <h2>Longest Collatz sequence</h2>
 * 
 * <p>The following iterative sequence is defined for the set of positive integers:
 * <center>n → n/2 (n is even) </br> n → 3n + 1 (n is odd)</center>
 * Using the rule above and starting with 13, we generate the following sequence:
 * <center>13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1</center>
 * It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. 
 * Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.<br />
 * Which starting number, under one million, produces the longest chain?<br />
 * NOTE: Once the chain starts the terms are allowed to go above one million.</p>
 * 
 * @author Oguz Ozkeroglu
 * Created on 2019.12.05
 * @see <a href="https://projecteuler.net/problem=14">Longest Collatz sequence</a>
 */

public class Problem014 implements EulerProblem {
	static final int number = 1_000_000;

	public static void main(String[] args) {
		System.out.println(new Problem014().getResult());
	}

	/**
	 * There is no need to calculate for lower values than starter, because we've already calculate them 
	 * 13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
	 * In this case, 10 is lower than 13 so just add 10's value to current counter
	 * It takes only around 30 milliseconds.
	 */

	@Override
	public Long getResult() {
		int[] cache = new int[number];

		int longest = 0;
		long next = 0;
		long result = 0;
		int counter = 0;

		for (int i = 2; i < number; i++) {
			counter = 0;
			next = i;

			while (next != 1 && next >= i) {
				next = next % 2 == 0 ? next / 2 : 3 * next + 1;
				counter++;
			}

			cache[i] = counter + cache[(int) next];

			if (longest < cache[i]) {
				longest = cache[i];
				result = i;
			}
		}

		return result;
	}
}
