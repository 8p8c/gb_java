package ru.geekbrains.java2.lesson1.athlete;

import ru.geekbrains.java2.lesson1.obstacle.*;

public class Athlete implements CanJump, CanRun {
	protected String name;
	private int height;
	private boolean is_running;

	public Athlete(String name, int height) {
		this.name = name;
		this.height = height;
		this.is_running = true;
	}

	public String get_name() {
		return this.name;
	}

	public void jump(Jumpable j) {
		if (this.height >= j.get_height()) {
			System.out.println(this.name + " jumped over " + j.get_height() + " meter obstacle.");
		}
		else {
			System.out.println(this.name + " could not jump over " + j.get_height() + " meter obstacle.");
			this.stop_running();
		}
	}

	public boolean is_running() {
		return this.is_running;
	}

	public void start_running() {
		this.is_running = true;
	}

	public void stop_running() {
		this.is_running = false;
	}
}
