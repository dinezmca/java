package jdk7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * 1. Create a list from an array of PErson object.
   2. Sort the list y person'last name.
   3. Print All persons
   4. Print all persons with last name starting "S"
   5. Print all persons with first name starting "N"
 * 
 */
public class Jdk7Examples {
	public static void main(String[] args) {

		Person person = new Person("da", 18, "india", "song");
		Person person1 = new Person("sang", 20, "india", "mong");
		Person person2 = new Person("kumka", 22, "india", "hong");
		Person person3 = new Person("nong", 22, "india", "sung");
		List<Person> list = new ArrayList<Person>();
		list.add(person1);
		list.add(person2);
		list.add(person3);
		list.add(person);

		list.stream().filter(p -> p.getLastName().startsWith("s"));
		System.out.println(list.size());
		System.out.println("SORT BY LAST NAME");
		pringSortByLastname(list);
		System.out.println("-----------------");

		System.out.println("LAST NAME STARTS WITH S");
		printLastNameStartwiths(list);
		System.out.println("------------------");
		System.out.println("FISRT NAME STARTS WITH N");
		printfisrtNameStartwithn(list);
		System.out.println("------------------");

		printCondtionbased(list, new FindBy() {

			@Override
			public boolean findByString(Person refer) {
				// TODO Auto-generated method stub
				return refer.getLastName().startsWith("n");
			}
		});
		printCondtionbased(list, new FindBy() {

			@Override
			public boolean findByString(Person refer) {
				// TODO Auto-generated method stub
				return refer.getName().startsWith("s");
			}
		});
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

	private static void printLastNameStartwiths(List<Person> list) {
		for (Person p : list) {
			if (p.getLastName().startsWith("s"))
				System.out.println("Name---" + p.getName() + "----Age---" + p.getAge() + "----Address--"
						+ p.getAddress() + "---Lats Name---" + p.getLastName());

		}

	}

	private static void pringSortByLastname(List<Person> list) {
		Collections.sort(list, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}
		});
		printCondtionbased(list, new FindBy() {

			@Override
			public boolean findByString(Person refer) {
				return true;
			}
		});
	}

}
