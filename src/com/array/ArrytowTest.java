package com.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ArrytowTest {
	public static int[] retainAll(int[] arry1, int[] arry2) {
		ArrayList<Integer> list = new ArrayList<>();
		int i = 0;
		int j = 0;
		while (i < arry1.length && j < arry2.length) {
			if (arry1[i] > arry2[j]) {
				j++;
			} else if (arry1[i] < arry2[j]) {
				i++;
			} else {
				list.add(arry1[i]);
				i++;
				j++;
			}

		}
		int[] ret = new int[list.size()];
		for (int k = 0; k < list.size(); k++) {
			ret[k] = list.get(k);
		}
		return ret;
	}

	public static char find(char[] chars1, char[] chars2) {
		boolean noSame = true;
		Set<Character> set = new HashSet<>();
		for (int i = 0; i < chars2.length; i++) {
			set.add(chars2[i]);
		}
		for (int j = 0; j < chars1.length; j++) {
			if (!set.contains(chars1[j])) {
				return chars1[j];
			}

		}
		return 0;
	}

	public void dearTread() {
		final Object obj1 = new Object();
		final Object obj2 = new Object();
		new Thread(new Runnable() {

			@Override
			public void run() {
				synchronized (obj1) {
					try {
						Thread.sleep(10);
						synchronized (obj2) {
							// do
						}

					} catch (Exception e) {

						e.printStackTrace();
					}
				}

			}
		}).run();

		new Thread(new Runnable() {

			@Override
			public void run() {
				synchronized (obj2) {
					try {
						Thread.sleep(10);
						synchronized (obj1) {
							// do
						}

					} catch (Exception e) {

						e.printStackTrace();
					}
				}

			}
		}).run();
	}
}
