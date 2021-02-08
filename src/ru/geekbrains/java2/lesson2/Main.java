package ru.geekbrains.java2.lesson2;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		Object[][] arr = new Object[4][4];
		initArrayRandom(arr);
		arr[1][2] = null;

		System.out.println(summArray(arr));
	}

	public static int summArray(Object[][] arr) {
		try {
			checkArray(arr);
		} catch (MyArraySizeException e) {
			System.out.println(e.getMessage());
			return 0;
		} catch (MyArrayDataException e) {
		}

		int result = 0;
		int i = 0;
		int j = 0;
		while (i < 4) {
			j = 0;
			while (j < 4) {
				try {
					checkArrayCellData(arr, i, j);
					result +=(int)(arr[i][j]);
				} catch (MyArrayDataException e) {
				}
				j++;
			}
			i++;
		}
		return result;
	}

	public static void checkArray(Object[][] arr) throws MyArraySizeException, MyArrayDataException {
		checkArraySize(arr);
		checkArrayData(arr);
	}

	public static void checkArraySize(Object[][] arr) throws MyArraySizeException {
		if (arr.length != 4) {
			throw new MyArraySizeException();
		}

		int i = 0;
		while (i < 4) {
			if (arr[i].length != 4) {
				throw new MyArraySizeException();
			}
			i++;
		}
	}

	public static void checkArrayData(Object[][] arr) throws MyArrayDataException {
		int i = 0;
		int j = 0;
		while (i < 4) {
			j = 0;
			while (j < 4) {
				try {
					checkArrayCellData(arr, i, j);
				} catch (MyArrayDataException e) {
					System.out.println(e.getMessage());
				}
				j++;
			}
			i++;
		}
	}

	public static void checkArrayCellData(Object[][] arr, int i, int j) throws MyArrayDataException {
		int test;
		try {
			test = (int) (arr[i][j]);
		} catch (NullPointerException e) {
			throw new MyArrayDataException(i, j);
		} catch (ClassCastException e) {
			throw new MyArrayDataException(i, j);
		} catch (Exception e) {
			System.out.println("Unknown exception occured.");
			throw e;
		}
	}

	public static void initArrayRandom(Object[][] arr) {
		Random random = new Random();
		int i = 0;
		int j = 0;
		while (i < 4) {
			j = 0;
			while (j < 4) {
				arr[i][j] =  (Object) (random.nextInt(5));
				j++;
			}
			i++;
		}
	}
}
