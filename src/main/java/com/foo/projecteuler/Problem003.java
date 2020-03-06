package com.foo.projecteuler;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Largest prime factor
 * 
 * @author Oguz Ozkeroglu
 * Created on 2019.10.14
 * @see <a href="https://projecteuler.net/problem=3">Largest prime factor</a>
 */

public class Problem003 implements EulerProblem {
	
	private Set<Integer> primeFactors = new HashSet<>();

	public static void main(String[] args) {
		System.out.println(new Problem003().getResult());
	}

	@Override
	public Long getResult() {
		Long number = 600851475143L;
		double to = Math.sqrt(number);

		for (int i = 2; i <= to; i++) {
			if (number % i == 0) {
				primeFactors.add(i);
				number /= i;
			}
		}
		
		return Long.valueOf(Collections.max(primeFactors));
	}
}
