package com.foo.projecteuler;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * <h2>Largest prime factor</h2>
 * 
 * <p>The prime factors of 13195 are 5, 7, 13 and 29.<br />
 * What is the largest prime factor of the number 600851475143 ?</p>
 * 
 * @author Oguz Ozkeroglu
 * Created on 2019.10.14
 * @see <a href="https://projecteuler.net/problem=3">Largest prime factor</a>
 */

public class Problem3 implements EulerProblem {
	
	private Set<Integer> primeFactors = new HashSet<>();

	public static void main(String[] args) {
		System.out.println(new Problem3().getResult());
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
