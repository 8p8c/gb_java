package ru.geekbrains.java2.lesson1;

import ru.geekbrains.java2.lesson1.obstacle.*;
import ru.geekbrains.java2.lesson1.athlete.*;

public class Main {
	public static void main(String[] args) {
		Course course = new Course(); // Создаем полосу препятствий
		Team team = new Team("TMNT"); // Создаем команду
		course.doIt(team); // Просим команду пройти полосу
		team.showResults(); // Показываем результаты
	}
}
