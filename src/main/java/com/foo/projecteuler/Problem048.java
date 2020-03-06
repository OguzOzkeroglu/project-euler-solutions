package com.foo.projecteuler;

import java.math.BigDecimal;

/**
 * Self powers
 * 
 * @author Oguz Ozkeroglu
 * Created on 2019.10.14
 * @see <a href="https://projecteuler.net/problem=48">Self powers</a>
 */

public class Problem048 implements EulerProblem {

	public static void main(String[] args) {
		System.out.println(new Problem048().getResult());
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
