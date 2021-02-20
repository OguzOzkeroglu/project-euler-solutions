package com.foo.projecteuler;

import java.math.BigInteger;

/**
 * Large non-Mersenne prime
 * 
 * @author Oguz Ozkeroglu
 * Created on 2021.02.20
 * @see <a href="https://projecteuler.net/problem=97">Large non-Mersenne prime</a>
 */

public class Problem097 implements EulerProblem {

	public static void main(String[] args) {
		System.out.println(new Problem097().getResult());
	}

	@Override
	public Long getResult() {
		BigInteger first = new BigInteger("28433");
		BigInteger second = new BigInteger("2").pow(7830457);
		BigInteger result = first.multiply(second).add(new BigInteger("1"));

		return result.mod(new BigInteger("10000000000")).longValue();
	}
}
