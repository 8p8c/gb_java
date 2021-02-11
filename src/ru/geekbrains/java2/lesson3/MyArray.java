package ru.geekbrains.java2.lesson3;

import java.util.Random;

class MyArray {
	private String[] array;
	private static final int ARRAY_SIZE = 20;
	private static final String[] numbers = {
		"one",
		"two",
		"three",
		"four",
		"five"};

	MyArray() {
		this.array = new String[ARRAY_SIZE];

		int i = 0;
		Random random = new Random();
		while (i < ARRAY_SIZE) {
			this.array[i] = numbers[random.nextInt(5)];
			i++;
		}
	}

	public String[] get() {
		return array;
	}

	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append(this.array[0]);
		int i = 1;
		while (i < ARRAY_SIZE) {
			result.append(" ");
			result.append(this.array[i]);
			i++;
		}
		return result.toString();
	}
}
