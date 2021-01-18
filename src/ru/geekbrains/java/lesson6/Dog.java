package ru.geekbrains.java.lesson6;

public class Dog extends Animal {
	private static int count;
	private String name;

	protected Dog(String name) {
		count++;
		this.name = name;
		System.out.println("Это пёс. Псов теперь " + String.valueOf(count)+ ".");
	}

	public void run(int distance) {
		if (distance > 500) {
			System.out.println(name + " бежал, но не смог пробежать " + String.valueOf(distance) + " м.");
		}
		else {
			System.out.println(name + " пробежал " + String.valueOf(distance) + " м.");
		}
	}

	public void swim(int distance) {
		if (distance > 10) {
			System.out.println(name + " поплыл, но вернулся.");
		}
		else {
			System.out.println(name + " проплыл " + String.valueOf(distance) + " м.");
		}
	}
}
