package jdk8;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import jdk7.FindBy;
import jdk7.Jdk7Examples;
import jdk7.Person;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * 1. Create a list from an array of PErson object.
   2. Sort the list y person'last name.
   3. Print All persons
   4. Print all persons with last name starting "S"
   5. Print all persons with first name starting "N"
 * 
 */
public class Jdk8Examples {
	
	static void forEachDemo(List<Person> p)
	{
		p.forEach(i->System.out.println(i.getName().startsWith("d")));
	}

	public static void main(String[] args) { 
		
		SimpleDateFormat sf = new SimpleDateFormat("dd/mm/yy");
		String date = sf.format(new Date());
		
		System.out.println("Simple date --->"+date);
		
		LocalDate local = LocalDate.now();
		
		String dat = local.format(DateTimeFormatter.ofPattern("mm-yy-dd"));
		
		System.out.println(dat);
		

		List<Person> foreach = Arrays.asList(new Person("da", 18, "india", "song", local),
				new Person("sang", 20, "india", "mong", local),
				new Person("nong", 22, "india", "sung",local));
		Jdk8Examples.forEachDemo(foreach);
		Person person = new Person("da", 18, "india", "song",local);
		Person person1 = new Person("sang", 20, "india", "mong", local);
		Person person2 = new Person("kumka", 22, "india", "hong", local);
		Person person3 = new Person("nong", 22, "india", "sung", local);
		List<Person> list = new ArrayList<Person>();
		list.add(person1);
		list.add(person2);
		list.add(person3);
		list.add(person3);
		list.add(person);

		System.out.println("SORT BY LAST NAME");
		
		
		Comparator<Person> per = (p1,p2)->p1.getName().compareTo(p2.getName());
		
		list.stream().sorted(per)
		
		.collect(Collectors.toList());
		
		Collections.sort(list, per);

		
		
		Collections.sort(list, (o1,  o2) -> o1.getLastName().compareTo(o2.getLastName()));
		printCondtionbased(list,  p -> true);		
		
		System.out.println("-----------------");

		System.out.println("LAST NAME STARTS WITH S");
		printLastNameStartwiths(list);
		System.out.println("------------------");
		System.out.println("FISRT NAME STARTS WITH N");
		printfisrtNameStartwithn(list);
		System.out.println("------------------");
		printCondtionbased(list, o1->o1.getLastName().startsWith("n"));
		
		printCondtionbased(list, o1->o1.getName().startsWith("s"));
	}

	private static boolean process(Person p) {
		
		if (p.getName()!=null)
		{
			return true ;
		}
	}

	private static void printCondtionbased(List<Person> list, FindBy obj) {

		for (Person p : list) {
			if (obj.findByString(p)) {
				System.out.println("Name---" + p.getName() + "----Age---" + p.getAge() + "----Address--"
						+ p.getAddress() + "---Lats Name---" + p.getLastName());

			}

		}
	}

	private static void printfisrtNameStartwithn(List<Person> list) {

		for (Person p : list) {
			if (p.getName().startsWith("n"))
				System.out.println("Name---" + p.getName() + "----Age---" + p.getAge() + "----Address--"
						+ p.getAddress() + "---Lats Name---" + p.getLastName());

		}
	}

	public static void printLastNameStartwiths(List<Person> list) {
		
		for (Person p : list) {
			if (p.getLastName().startsWith("s"))
				System.out.println("Name---" + p.getName() + "----Age---" + p.getAge() + "----Address--"
						+ p.getAddress() + "---Lats Name---" + p.getLastName());

		}
	}
	
	
	private  void method2() {
		Person q = new Person(null, 0, null, null);
		q.setAge(3);
				List<Person> abcList = new ArrayList<Person>();
				abcList.add(q);
		Jdk8Examples.printLastNameStartwiths(abcList);
		abcList.forEach(Jdk8Examples::method1);
		//this.method1(q);
	}
	private static void method1(Person p) {
		System.out.println(p.getAge());
	}
}
