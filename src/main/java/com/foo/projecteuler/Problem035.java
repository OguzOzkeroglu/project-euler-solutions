package com.foo.projecteuler;

import java.util.Arrays;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Circular primes
 * 
 * @author Oguz Ozkeroglu
 * Created on 2022.06.11
 * @see <a href="https://projecteuler.net/problem=35">Circular primes</a>
 *
 */

public class Problem035 implements EulerProblem {
	
	public static void main(String[] args) {
		System.out.println(new Problem035().getResult());
	}

	@Override
	public Long getResult() {
		Supplier<Stream<String>> supplier = () -> Arrays.asList("0", "2", "4", "6", "8", "5").stream();
		
		int size = IntStream.rangeClosed(2, 1_000_000)
		.mapToObj(String::valueOf)
		.filter(str -> supplier.get().noneMatch(str::contains))
		.filter(number -> isPrime(Integer.valueOf(number)))
		.map(number -> {
			int count = 0;
			for (int i = 0; i < number.length(); i++) {
				String rotated = number.substring(i) + number.substring(0, i);
				if (isPrime(Integer.valueOf(rotated))) {
					count++;
				}
			}
			
			return count == number.length() ? number : null;
		})
		.collect(Collectors.toSet())
		.size();
		
		return (long) (size + 1); // +2 for the number 2 & 5 and -1 for null
	}
	
	private boolean isPrime(int number) {
		if (number % 2 == 0) return false;

		for (int i = 3; i <= Math.sqrt(number); i += 2) {
			if (number % i == 0) return false;
		}

		return true;
	}
}
