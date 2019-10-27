package com.foo.projecteuler;

/**
 * <h2>Largest palindrome product</h2>
 * 
 * <p>A palindromic number reads the same both ways. The largest palindrome 
 * made from the product of two 2-digit numbers is 9009 = 91 × 99.<br />
 * Find the largest palindrome made from the product of two 3-digit numbers.</p>
 * 
 * @author Oguz Ozkeroglu
 * Created on 2019.10.27
 * @see <a href="https://projecteuler.net/problem=4">Largest palindrome product</a>
 */

public class Problem004 implements EulerProblem {
	public static void main(String[] args) {
		System.out.println(new Problem004().getResult());
	}

	@Override
	public Long getResult() {
		int largest = 0;
		
		for (int i = 999; i > 100; i--) {
			for (int j = 999; j > 100; j--) {
				if (isPalindrome(i * j)) {
					if (largest < i * j) {
						largest = i * j;
					}
				}
			}
		}
		
		return (long) largest;
	}

	private boolean isPalindrome(int number) {
		StringBuilder sb = new StringBuilder(String.valueOf(number));
		if (sb.toString().equals(sb.reverse().toString())) {
			return true;
		}

		return false;
	}
}
