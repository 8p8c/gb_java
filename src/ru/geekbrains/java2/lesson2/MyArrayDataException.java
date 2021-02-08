package ru.geekbrains.java2.lesson2;

public class MyArrayDataException extends Exception {
	private int i;
	private int j;

	public MyArrayDataException(int i, int j) {
		this.i = i;
		this.j = j;
	}

	public String getMessage() {
		return "Array cell [" + this.i + "][" + this.j + "] contains corrupted data.";
	}
}
