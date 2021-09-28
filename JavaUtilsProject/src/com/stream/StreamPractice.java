package com.stream;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import jdk7.Person;

public class StreamPractice {
	public static void main(String[] args) {
		List<Person> streamList = Arrays.asList(
				new Person("BOSE", 55, "CHENNAI", "GANDHI", LocalDate.parse("2020-02-19")),
				new Person("DINESH", 33, "KARAIKUDI", "KUMAR", LocalDate.parse("2020-02-19")),
				new Person("KANIMOZHI", 36, "CHENNAI", "POONKUNDRAN", LocalDate.parse("2020-02-19")),
				new Person("SAKKARAVARTHI", 30, "CHENNAI", "MITHUN", LocalDate.parse("2020-02-19"))
				);
		
		System.out.println("---------Pre List---------- ");
		streamList.forEach(p->System.out.println("\n" +p));
		Comparator<Person> actionForAge = (o1,o2)-> o1.getAge().compareTo(o2.getAge());
		streamList.stream().sorted();
		
		streamList.forEach(p->System.out.println("\n" +p));
	}
}
