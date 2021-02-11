package ru.geekbrains.java2.lesson3;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

class PhoneBook {
	private HashMap<Person, String> book;

	PhoneBook() {
		this.book = new HashMap<>();
	}

	public void add(String name, String phone_number) {
		this.book.put(new Person(name), phone_number);
	}

	public List<String> get(String query) {
		LinkedList<String> list = new LinkedList<>();

		this.book.forEach((person, phone_number) -> {
				if (person.name().toLowerCase().equals(query.toLowerCase())) {
					list.add(phone_number);
				}
			});
		return list;
	}
}
