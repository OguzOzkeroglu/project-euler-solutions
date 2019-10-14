package com.foo.projecteuler;

import java.math.BigDecimal;

/**
 * <h2>Self powers</h2>
 * 
 * <p>The series, 1^1 + 2^2 + 3^3 + ... + 10^10 = 10405071317.<br />
 * Find the last ten digits of the series, 1^1 + 2^2 + 3^3 + ... + 1000^1000.
 * </p>
 * 
 * @author Oguz Ozkeroglu
 * Created on 2019.10.14
 * @see <a href="https://projecteuler.net/problem=48">Self powers</a>
 */

public class Problem48 implements EulerProblem {

	public static void main(String[] args) {
		System.out.println(new Problem48().getResult());
	}

	@Override
	public Long getResult() {
		BigDecimal result = new BigDecimal(0);

		for (int i = 1; i <= 1_000; i++) {
			result = result.add(new BigDecimal(i).pow(i));
		}

		String strResult = result.toString();
		strResult = strResult.substring(strResult.length() - 10);

		return Long.valueOf(strResult);
	}
}
