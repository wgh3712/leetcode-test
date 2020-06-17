package com.array;

public class SortTest {

	public static void main(String[] args) {
		int[] arry = { 6, 19, 3, 6, 20, 7, 8, 1, 6 };
		/*
		 * quickSort(arry); for (int i : arry) { System.out.println(i); }
		 */
		int k = getk(arry, 0, arry.length - 1, 2);
		System.out.println(k);
	}

	// 冒泡排序
	private static void mpSort(int[] arry) {
		int n = arry.length;
		if (n <= 1)
			return;
		for (int i = 0; i < n; i++) {
			// 中断标志，冒泡排序当有一轮没有交换，则此时数组已经有序，
			// 不需要后续的比较交换，即可退出排序
			boolean flag = false;
			for (int j = 0; j < n - i - 1; j++) {
				if (arry[j] > arry[j + 1]) {
					int temp = arry[j];
					arry[j] = arry[j + 1];
					arry[j + 1] = temp;
					flag = true;
				}
			}
			if (!flag) {
				break;
			}
		}

	}

	// 插入排序
	private static void insertSort(int[] a) {
		int n = a.length;
		if (n <= 1)
			return;
		for (int i = 1; i < n; i++) {
			int value = a[i];
			int j = i - 1;
			while (j >= 0 && value < a[j]) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = value;
		}
	}

	// 选择排序 最好和最坏情况 时间复杂度都为O（n*n） 不稳定排序
	private static void chooseSort(int[] a) {
		int n = a.length;
		if (n <= 1)
			return;
		for (int i = 0; i < n; i++) {
			int min = a[i];
			int index = i;
			for (int j = i + 1; j < n; j++) {
				if (min > a[j]) {
					min = a[j];
					index = j;
				}
			}
			a[index] = a[i];
			a[i] = min;
		}
	}

	// 归并排序 时间复杂度为O(nlogn) 空间复杂度为O(n) 非原地排序算法
	private static void mergeSort(int[] a) {
		mergeSort(a, 0, a.length - 1);
	}

	private static void mergeSort(int[] a, int low, int hight) {
		if (low >= hight) {
			return;
		}
		int mid = (low + hight) / 2;
		mergeSort(a, low, mid);
		mergeSort(a, mid + 1, hight);
		merge(a, low, mid, hight);
	}

	private static void merge(int[] a, int low, int mid, int hight) {
		int[] temp = new int[hight - low + 1];
		int i = low;
		int j = mid + 1;
		int k = 0;
		while (i <= mid && j <= hight) {
			if (a[i] <= a[j]) {
				temp[k++] = a[i++];
			} else {
				temp[k++] = a[j++];
			}
		}
		if (i <= mid) {
			while (i <= mid) {
				temp[k++] = a[i++];
			}
		}
		if (j <= hight) {
			while (j <= hight) {
				temp[k++] = a[j++];
			}
		}
		for (int n : temp) {
			a[low++] = n;
		}
	}

	// 快速排序 时间复杂度O(nlogn)，最坏情况O(n*n) (分区不均匀，每次分出一个) 空间复杂度O(1) 原地排序算法，非稳定排序算法
	private static void quickSort(int[] a) {
		quictSort(a, 0, a.length - 1);
	}

	private static void quictSort(int[] a, int low, int hight) {
		if (low >= hight)
			return;
		int partition = partition(a, low, hight);
		quictSort(a, low, partition - 1);
		quictSort(a, partition + 1, hight);
	}

	// 变型 快排取第k大元素
	private static int getk(int[] a, int low, int hight, int k) {

		int partition = partition(a, low, hight);
		if (partition == k - 1)
			return a[partition];
		if (partition > k - 1) {
			return getk(a, low, partition - 1, k);
		} else {

			return getk(a, partition + 1, hight, k);
		}

	}

	private static int partition(int[] a, int low, int hight) {
		int i = low;
		int j = hight;
		int temp = a[low];
		while (i < j) {
			while (i < j && temp <= a[j]) {
				j--;
			}
			if (i < j) {
				a[i] = a[j];
			}
			while (i < j && temp >= a[i]) {
				i++;
			}
			if (i < j) {
				a[j] = a[i];
			}
		}
		a[i] = temp;
		return i;
	}
}
