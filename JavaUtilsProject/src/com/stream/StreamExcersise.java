package com.stream;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

import jdk7.Person;

public class StreamExcersise {
	public static void main(String[] args) {
		
		List<Person> streamList = Arrays.asList(new Person("DINESH", 18, "TAMIL NADU", "TAMIZHINI", LocalDate.parse("2020-02-06")), new Person("TAMIL", 20, "INDIA", "MANI", LocalDate.parse("2020-02-11")),
				new Person("KARIKALAN", 22, "MADURAI", "CHOLAN", LocalDate.parse("2020-02-16")));
		
		
		actionList(streamList);
	//	streamLogics(streamList);
		Comparator<Person> age = (o, o1)->o.getAge().compareTo(o1.getAge());
		Comparator<Person> name = (o, o1)->o.getName().compareTo(o1.getName());


		System.out.println("Current date----"+LocalDate.now());
		LocalDate local = LocalDate.parse("1986-11-03");
		Period p1 = Period.between(local, LocalDate.now());
		//System.out.println("DINESH'S AGE--->"+p1.getYears());
		System.out.println(streamList);
		
		
		streamList.stream().sorted(age).peek(p->System.err.println("Peek record in loop---->"+p.getLastName()))
		.filter(p ->p.getAge()==18)
		.forEach(p->System.out.println(p));
	}

	private static void actionList(List<Person> streamList) {
		
		
		Comparator<Person> age = (o, o1)->o.getAge().compareTo(o1.getAge());
	}

}
