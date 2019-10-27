package com.foo.projecteuler;

import java.util.HashSet;
import java.util.Set;

/**
 * <h2>Smallest multiple</h2>
 * 
 * <p>2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.<br />
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?</p>
 * 
 * @author Oguz Ozkeroglu
 * Created on 2019.10.25
 * @see <a href="https://projecteuler.net/problem=5">Smallest multiple</a>
 */

public class Problem005 implements EulerProblem {
	
	private Set<Integer> primeFactors = new HashSet<>();
	
	public static void main(String[] args) {
		System.out.println(new Problem005().getResult());
	}

	@Override
	public Long getResult() {
		for (int i = 2; i <= 20; i++) {
			addPrimeFactors(i);
		}
		
		Long result = 1L;
		
		for (Integer integer : primeFactors) {
			result *= integer;
		}
		
		result *= 3; // for 9
		result *= 8; // for 16
		
		return result;
	}

	private void addPrimeFactors(int number) {
		for (int i = 2; i <= number; i++) {
			if (number % i == 0) {
				if (i %4 != 0) {
					primeFactors.add(i);
				}
				
				number /= i;
			}
		}
	}
}
