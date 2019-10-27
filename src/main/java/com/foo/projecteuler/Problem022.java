package com.foo.projecteuler;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

/**
 * <h2>Names scores</h2>
 * 
 * <p>Using names.txt (right click and 'Save Link/Target As...'), a 46K text file 
 * containing over five-thousand first names, begin by sorting it into alphabetical order.
 * Then working out the alphabetical value for each name, multiply this value by 
 * its alphabetical position in the list to obtain a name score.</p>
 * <p>For example, when the list is sorted into alphabetical order,
 * COLIN, which is worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the list.
 * So, COLIN would obtain a score of 938 × 53 = 49714.</p>
 * <p>What is the total of all the name scores in the file?</p>
 * 
 * @author Oguz Ozkeroglu
 * Created on 2019.10.11
 * @see <a href="https://projecteuler.net/problem=22">Names scores</a>
 */

public class Problem022 implements EulerProblem {
	private Map<String, Integer> alphabet = new HashMap<>();
	private List<String> list = null;
	
	public static void main(String[] args) {
		System.out.println(new Problem022().getResult());
	}

	@Override
	public Long getResult() {
		initializeMap();
		
		String fileName = "p022_names.txt";

		String content = null;
		try {
			content = new String(Files.readAllBytes(Paths.get(fileName)));
		} catch (IOException e) {
			e.printStackTrace();
		}

		list = Arrays.asList(content.split(","));
		
		list.sort((e1, e2) -> e1.compareTo(e2));

		Long sum = IntStream.range(0, list.size())
				.mapToLong(i -> getScore(i+1, list.get(i).replaceAll("\"", "")))
				.sum();
		
		return sum;
	}
	
	private Long getScore(int index, final String str) {
		long sum = str.chars()
				.mapToObj(c -> String.valueOf((char) c))
				.mapToInt(c -> alphabet.get(c))
				.sum();

		return sum * index;
	}
	
	private void initializeMap() {
		alphabet.put("A", 1);
		alphabet.put("B", 2);
		alphabet.put("C", 3);
		alphabet.put("D", 4);
		alphabet.put("E", 5);
		alphabet.put("F", 6);
		alphabet.put("G", 7);
		alphabet.put("H", 8);
		alphabet.put("I", 9);
		alphabet.put("J", 10);
		alphabet.put("K", 11);
		alphabet.put("L", 12);
		alphabet.put("M", 13);
		alphabet.put("N", 14);
		alphabet.put("O", 15);
		alphabet.put("P", 16);
		alphabet.put("Q", 17);
		alphabet.put("R", 18);
		alphabet.put("S", 19);
		alphabet.put("T", 20);
		alphabet.put("U", 21);
		alphabet.put("V", 22);
		alphabet.put("W", 23);
		alphabet.put("X", 24);
		alphabet.put("Y", 25);
		alphabet.put("Z", 26);
	}
}
