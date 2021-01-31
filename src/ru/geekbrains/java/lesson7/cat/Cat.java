package ru.geekbrains.java.lesson7.cat;

import ru.geekbrains.java.lesson7.plate.Plate;

public class Cat{
	private String name;
	private int stomach_capacity;
	private boolean is_stuffed;
	private static final int default_stomach_capacity = 20;

	public Cat(String name) {
		this(name, default_stomach_capacity);
	}

	public Cat(String name, int stomach_capacity) {
		this.name = name;
		this.is_stuffed = false;
		this.stomach_capacity = stomach_capacity;
	}

	public void eat(Plate p) {
		if (this.is_stuffed) {
			meow("Meh");
		}
		else {
			if (p.volume() < this.stomach_capacity) {
				meow("MOAR");
			}
			else {
				p.get_from(this.stomach_capacity);
				this.is_stuffed = true;
				meow("Om-nom-nom");
			}
		}
	}

	public void stuffed() {
		if (this.is_stuffed) {
			meow("Pur-r-r");
		}
		else {
			meow("Mew-mew-mew");
		}
	}

	private void meow(String s) {
		// Я понимаю, что это не лучшее использование StringBuilder,
		// просто хотел закрепить в памяти его использование.
		StringBuilder sb = new StringBuilder(this.name);
		sb.append(": ");
		sb.append(s);
		System.out.println(sb.toString());
	}
}
