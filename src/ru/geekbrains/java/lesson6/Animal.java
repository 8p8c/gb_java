package ru.geekbrains.java.lesson6;

abstract class Animal {
	private static int count;

	protected Animal() {
		count++;
		System.out.println("Наплодили ещё одно животное, теперь их " + String.valueOf(count)+ ".");
	}

	// Если finalize() deprecated, то как жить-то теперь?
	// protected void finalize() {
	// 	count--;
	// }

	abstract void run(int distance);
	abstract void swim(int distance);
}
