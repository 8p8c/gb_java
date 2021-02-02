package ru.geekbrains.java2.lesson1.obstacle;

import java.util.Random;

public class Obstacle implements Jumpable {

	private final static int MAXIMUM_OBSTACLE_HEIGHT = 10;
	private int height;

	public Obstacle() {
		this.height = new Random().nextInt(MAXIMUM_OBSTACLE_HEIGHT) + 1;
	}

	public void jump() {
	}

	public int get_height() {
		return this.height;
	}
}
