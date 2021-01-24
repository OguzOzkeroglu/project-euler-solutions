package com.foo.projecteuler;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.IntStream;

/**
 * Square digit chains
 * 
 * @author Oguz Ozkeroglu
 * Created on 2021.01.24
 * @see <a href="https://projecteuler.net/problem=92">Square digit chains</a>
 */

public class Problem092 implements EulerProblem {
	Set<List<Integer>> has89 = new HashSet<>();
	long count = 0L;
	
	public static void main(String[] args) {
		System.out.println(new Problem092().getResult());
	}

	@Override
	public Long getResult() {
		IntStream.rangeClosed(1, 10_000_000).forEach(number -> {
			has89.add(getChainList(number));
		});

		return count + 1; // +1 for 89
	}
	
	
	private List<Integer> getChainList(int number) {
		List<Integer> chain = new ArrayList<>();
		
		chain.add(number);
		
		while (!(number == 1 || number == 89)) {
			number = getSumOfDigitSquares(number);
			chain.add(number);
			
			if (numberExistsInChain(number)) {
				count ++;
				return null;
			}
			
			if (number == 89) {
				count ++;
				return chain;
			}
		}
		
		return null;
	}

	private boolean numberExistsInChain(int number) {
		return has89.stream()
				.filter(Objects::nonNull)
				.filter(list -> list.contains(number))
				.findAny()
				.isPresent();
	}

	private int getSumOfDigitSquares(int number) {
		String s = Integer.toString(number);

		return s.chars()
				.map(c -> Character.getNumericValue(c))
				.map(digit -> digit * digit)
				.sum();
	}
}
