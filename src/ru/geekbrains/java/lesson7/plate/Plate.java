package ru.geekbrains.java.lesson7.plate;

public class Plate {
	// Как лучше объявить константу -- умолчальное значение?
	private static final int default_capacity = 100;
	private int capacity;
	private int volume;

	public Plate() {
		this(default_capacity);
	}

	public Plate(int capacity) {
		this.capacity = capacity;
		this.volume = capacity; // Plates are created full of food by default.
	}

	public int volume() {
		return this.volume;
	}

	public void get_from(int x) {
		if (x > volume) {
			volume = 0;
		}
		else {
			volume = volume - x;
		}
	}

	public void add(int x) {
		if (x + volume > capacity) {
			volume = capacity;
		}
		else {
			volume = volume + x;
		}
	}
}
