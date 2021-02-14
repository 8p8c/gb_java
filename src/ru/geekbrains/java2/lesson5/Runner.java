package ru.geekbrains.java2.lesson5;

public class Runner implements Runnable {
	private final float[] arr;
	private final int size;

	public Runner(float[] arr, int size) {
		this.arr = arr;
		this.size = size;
	}

	public void run() {
		int i = 0;
		while (i < size) {
			arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
			i++;
		}
	}
}
