package ru.geekbrains.java2.lesson3;

import java.util.TreeMap;
import java.util.Iterator;;

public class Main {
	public static void main(String[] args) {
		MyArray arr = new MyArray();
		System.out.println(arr.toString());

		count_words(arr.get()).forEach((word, count) -> System.out.println(word + ": " + count.toString()));

		System.out.println();

		PhoneBook pb = new PhoneBook();
		pb.add("Samedov", "123-32-23");
		pb.add("Ivanov", "+7-912-23-23");
		pb.add("Smirnov", "8-800-912-23-23");
		pb.add("Smirnov", "8-495-932-29-23");
		pb.add("Smirnov", "+7-977-987-70-20");
		pb.add("Golovanov", "8-922-28-23");
		pb.get("samedov");
		pb.get("erohin");
		pb.get("smirnov");
	}

	public static TreeMap<String, Integer> count_words (String[] arr) {
		TreeMap<String, Integer> result = new TreeMap<>(/*I should pass Comparator here that puts One before Five*/);
		for (String word : arr) {
			if (result.containsKey(word)) {
				result.put(word, result.get(word) + 1);
			}
			else {
				result.put(word, 1);
			}
		}
		return result;
	}
}
