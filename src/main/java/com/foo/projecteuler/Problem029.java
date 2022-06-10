package com.foo.projecteuler;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

/**
 * Distinct powers
 * 
 * @author Oguz Ozkeroglu
 * Created on 2022.06.10
 * @see <a href="https://projecteuler.net/problem=29">Distinct powers</a>
 *
 */

public class Problem029 implements EulerProblem {

	public static void main(String[] args) {
		System.out.println(new Problem029().getResult());
	}
	
	@Override
	public Long getResult() {
		Set<BigDecimal> distinctPowers = new HashSet<>();

		IntStream.rangeClosed(2, 100)
			.forEach(a -> {
				IntStream.rangeClosed(2, 100)
					.forEach(b -> distinctPowers.add(new BigDecimal(a).pow(b)));
		});
		
		return (long) distinctPowers.size();
	}
}
