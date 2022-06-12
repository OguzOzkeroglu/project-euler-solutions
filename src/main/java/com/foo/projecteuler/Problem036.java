package com.foo.projecteuler;

import java.util.stream.IntStream;

/**
 * Double-base palindromes
 * 
 * @author Oguz Ozkeroglu
 * Created on 2022.06.12
 * @see <a href="https://projecteuler.net/problem=36">Double-base palindromes</a>
 *
 */

public class Problem036 implements EulerProblem {
	
	public static void main(String[] args) {
		System.out.println(new Problem036().getResult());
	}

	@Override
	public Long getResult() {
		long sum = IntStream.rangeClosed(1, 1_000_000)
				.filter(number -> isPalindrome(Integer.toString(number)))
				.filter(number -> isPalindrome(Integer.toBinaryString(number)))
				.sum();

		return sum;
	}

	public boolean isPalindrome(String str) {
		return str.equals(new StringBuilder(str).reverse().toString());
	}
}
