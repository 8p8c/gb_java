package ru.geekbrains.java.lesson6;

public class Cat extends Animal {
	private static int count;
	private String name;

	protected Cat(String name) {
		count++;
		this.name = name;
		System.out.println("Это кот. Котов теперь " + String.valueOf(count)+ ".");
	}

	public void run(int distance) {
		if (distance > 200) {
			System.out.println(name + " не стал бежать " + String.valueOf(distance) + " м.");
		}
		else {
			System.out.println(name + " пробежал " + String.valueOf(distance) + " м.");
		}
	}

	public void swim(int distance) {
		System.out.println(name + " отказался лезть в воду.");
	}

}
