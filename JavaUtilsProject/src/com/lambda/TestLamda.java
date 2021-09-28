package com.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TestLamda {
	public static void main(String[] args) {
		//System.out.println();
		abc(System.out::println);
		
		List<Integer> integers = Arrays.asList(1,12,433,5);
        
		Optional<Integer> max = integers.stream().reduce( Math::max ); 
		 	
		max.ifPresent(value -> System.out.println(value)); 
		
		
		List<String> strings = Arrays
		        .asList("how", "to", "do", "in", "java", "dot", "com");
		
		 Comparator<String> co = (s1, s2) -> s1.compareTo(s2);
		 
		List<String> sorted = strings
		        .stream()
		        .sorted(co)
		        .collect(Collectors.toList());
		 
		System.out.println(sorted);
		 
		List<String> sortedAlt = strings
		        .stream()
		        .sorted(String::compareTo)
		        .collect(Collectors.toList());
		 
		System.out.println(sortedAlt);
	}

	private static void abc(Sample object) {
		object.test("123456");
	}

}

interface Sample {
	
	void test(String b);
}


