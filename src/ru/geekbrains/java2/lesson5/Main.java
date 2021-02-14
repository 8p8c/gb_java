package ru.geekbrains.java2.lesson5;

public class Main {
		static final int size = 10000000;
		static final int h = size / 2;

	public static void main(String[] args) {
		float[] arr = new float[size];

		/* Filling array with ones. */
		int i = 0;
		while (i < Main.size) {
			arr[i] = 1;
			i++;
		}

		compute_singlethreaded(arr);
		compute_multithreaded(arr);
	}

	public static void compute_singlethreaded(float[] array) {
		long time_before_computation;
		long time_after_computation;

		int i = 0;
		time_before_computation = System.currentTimeMillis();
		while (i < Main.size) {
			array[i] = (float)(array[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));;
			i++;
		}
		time_after_computation = System.currentTimeMillis();

		System.out.println("Singlethreaded computation takes " +
						   String.valueOf(time_after_computation - time_before_computation) +
						   " ms.");
	}

	public static void compute_multithreaded(float[] array) {
		long time_before_computation;
		long time_after_computation;
		float[] a1 = new float[size/2];
		float[] a2 = new float[size/2];

		Runner[] runners = new Runner[2];
		Thread[] threads = new Thread[2];

		runners[0] = new Runner(a1, Main.size/2);
		runners[1] = new Runner(a2, Main.size/2);
		threads[0] = new Thread(runners[0]);
		threads[1] = new Thread(runners[1]);

		time_before_computation = System.currentTimeMillis();
		System.arraycopy(array, 0, a1, 0, h);
		System.arraycopy(array, h, a2, 0, h);
		try {
				threads[0].start();
				threads[1].start();
				threads[0].join();
				threads[1].join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.arraycopy(a1, 0, array, 0, h);
		System.arraycopy(a2, 0, array, h, h);
		time_after_computation = System.currentTimeMillis();

		System.out.println("Computation in 2 threads takes " +
						   String.valueOf(time_after_computation - time_before_computation) +
						   " ms.");
	}
}
