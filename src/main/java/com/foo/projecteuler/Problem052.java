package com.foo.projecteuler;

import java.util.Arrays;

/**
 * Permuted multiples
 * 
 * @author Oguz Ozkeroglu
 * Created on 2022.06.13
 * @see <a href="https://projecteuler.net/problem=52">Permuted multiples</a>
 *
 */

public class Problem052 implements EulerProblem {

	public static void main(String[] args) {
		System.out.println(new Problem052().getResult());
	}

	@Override
	public Long getResult() {
		long result = 0;
		for (int i = 1; i < Integer.MAX_VALUE; i++) {
			if (isPermuted(i)) {
				result = i;
				break;
			}
		}
		return result;
	}

	private boolean isPermuted(int number) {
		char[] chars = String.valueOf(number).toCharArray();
		Arrays.sort(chars);

		for (int i = 2; i <= 6; i++) {
			char[] charsNext = String.valueOf(number * i).toCharArray();
			Arrays.sort(charsNext);

			if (!Arrays.equals(chars, charsNext)) {
				return false;
			}
		}

		return true;
	}
}
