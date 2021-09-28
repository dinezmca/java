package jdk7;

import java.time.LocalDate;

/**
 * @author d.bosegandhi-c
 *
 */
public class Person {
	
	private String name;
	private Integer age;
	private String address;
	private String lastName;
	
	private LocalDate date;
	
	public Person(String name, Integer age, String address, String lastName, LocalDate localDate) {
		this.name = name;
		this.age=age;
		this.address=address;
		this.lastName =lastName;
		this.date= localDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String toString() {
		return name + " " + lastName + " " + age + " " + address + " ";
	}
}
