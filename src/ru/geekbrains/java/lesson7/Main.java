package ru.geekbrains.java.lesson7;

import ru.geekbrains.java.lesson7.cat.Cat;
import ru.geekbrains.java.lesson7.plate.Plate;

public class Main {
	public static void main(String[] args) {
		// Cat names are taken from 'Kid e Cats'
		Cat cats[] = {new Cat("Pudding", 30),
					  new Cat("Cookie", 20),
					  new Cat("Candy", 15),
					  new Cat("Cupcake", 18)};
		Plate plate = new Plate(70);

		int i = 0;
		while (i < cats.length) {
			cats[i].eat(plate);
			i++;
		}

		i = 0;
		while (i < cats.length) {
			cats[i].stuffed();
			i++;
		}

		plate.add(30);

		i = 0;
		while (i < cats.length) {
			cats[i].eat(plate);
			i++;
		}

		i = 0;
		while (i < cats.length) {
			cats[i].stuffed();
			i++;
		}
	}
}
