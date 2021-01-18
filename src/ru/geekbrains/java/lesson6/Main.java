package ru.geekbrains.java.lesson6;

public class Main {
	public static void main(String[] args) {
		Cat cat = new Cat("Барсик");
		Dog dog = new Dog("Барбос");
		System.out.println("После этой строчки видно, что счётчики котов, собак и животных инкрементируются отдельно.");
		System.out.println("Ну что, котятки, поплаваем.");
		System.out.println("Котейка, плыви 3 м.");
		cat.swim(3);
		System.out.println("Пёс, кот не смог. Твоя очередь.");
		dog.swim(3);
	}
}
