package ru.geekbrains.java.lesson5;

public class Person {
	private String full_name;
	private String position;
	private String email;
	private String phone_number;
	private int salary;
	private int age;

	public Person(String full_name,
					String position,
					String email,
					String phone_number,
					int salary,
					int age) {
		this.full_name = full_name;
		this.position = position;
		this.email = email;
		this.phone_number = phone_number;
		this.salary = salary;
		this.age = age;
	}

	public int getAge() {
		return this.age;
	}

	public String toString() {
		String result;
		result =
			full_name + " " +
			position + " " +
			email + " " +
			phone_number + " " +
			String.valueOf(salary) + " " +
			String.valueOf(age);
		return result;
	}

	public String toPrettyString() {
		String result;
		result =
			"Full name: " + full_name + "\n" +
			"Position: " + position + "\n" +
			"Email: " + email + "\n" +
			"Phone number: " + phone_number + " \n" +
			"Salary: " + String.valueOf(salary) + "\n" +
			"Age: " + String.valueOf(age) + "\n";
		return result;
	}
}
