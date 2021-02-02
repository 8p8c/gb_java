package ru.geekbrains.java2.lesson1.obstacle;

import ru.geekbrains.java2.lesson1.athlete.*;

public class Course {
	private final static int OBSTACLES_NUM = 4;

	private Jumpable jumpable[];

	public Course() {
		jumpable = new Jumpable[OBSTACLES_NUM];
		int i = 0;
		while (i < OBSTACLES_NUM) {
			jumpable[i] = new Obstacle();
			i++;
		}
	}
	public void doIt(Team t) {
		System.out.println(t.get_name() + ": ready, steady, go!");
		for (Jumpable j : jumpable) {
			for (Athlete member: t.get_members()) {
				if (member.is_running()) {
					member.jump(j);
				}
			}
			System.out.println();
		}
	}
}
