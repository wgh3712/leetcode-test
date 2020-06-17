package com.array;

public class BinarySearchTest {

	public static void main(String[] args) {
		// int[] a = { 1, 4, 6, 8, 8, 8, 8, 8, 12, 13, 14 };
		// System.out.println(bsearch4(a, 10));
		int[] a = { 5, 1, 2, 3, 4 };
		int index = RotateArraySearch_2(a, 5, 1);
		System.out.println(index);

	}

	// 普通二分查找
	private static int bsearch(int[] a, int value) {
		int low = 0;
		int high = a.length - 1;
		while (low <= high) {
			int mid = low + ((high - low) >> 1);
			if (a[mid] == value) {
				return mid;
			} else if (a[mid] > value) {
				high = mid - 1;
			} else if (a[mid] < value) {
				low = mid + 1;
			}
		}
		return -1;
	}

	// 变型二分查找 （有重复数据，查找第一个等于目标值的下标）
	private static int bsearch1(int[] a, int value) {
		int low = 0;
		int high = a.length - 1;
		while (low <= high) {
			int mid = low + ((high - low) >> 1);
			if (a[mid] == value) {
				if (mid == 0 || a[mid - 1] != value)
					return mid;
				else
					high = mid - 1;
			} else if (a[mid] > value) {
				high = mid - 1;
			} else if (a[mid] < value) {
				low = mid + 1;
			}
		}
		return -1;
	}

	// 变型二分查找 （有重复数据，查找最后一个等于目标值的下标）
	private static int bsearch2(int[] a, int value) {
		int low = 0;
		int n = a.length - 1;
		int high = a.length - 1;
		while (low <= high) {
			int mid = low + ((high - low) >> 1);
			if (a[mid] == value) {
				if (mid == n || a[mid + 1] != value)
					return mid;
				else
					low = mid + 1;
			} else if (a[mid] > value) {
				high = mid - 1;
			} else if (a[mid] < value) {
				low = mid + 1;
			}
		}
		return -1;
	}

	// 变型二分查找 （有重复数据，查找第一个大于等于目标值的下标）
	private static int bsearch3(int[] a, int value) {
		int low = 0;
		int n = a.length - 1;
		int high = a.length - 1;
		while (low <= high) {
			int mid = low + ((high - low) >> 1);
			if (a[mid] >= value) {
				if (mid == 0 || a[mid - 1] < value)
					return mid;
				else
					high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return -1;
	}

	// 变型二分查找 （有重复数据，查找最后一个小于等于目标值的下标）
	private static int bsearch4(int[] a, int value) {
		int low = 0;
		int n = a.length - 1;
		int high = a.length - 1;
		while (low <= high) {
			int mid = low + ((high - low) >> 1);
			if (a[mid] <= value) {
				if (mid == n || a[mid + 1] > value)
					return mid;
				else
					low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}

	static int RotateArraySearch_2(int A[], int len, int target) {
		int left = 0;
		int right = len - 1;
		while (left <= right) {
			int mid = left + ((right - left) >> 1);
			if (A[mid] == target)
				return mid;
			else if (target > A[mid]) {
				if (A[mid] > A[left] || target <= A[right])
					left = mid + 1;
				else
					right = mid - 1;
			} else {
				if (A[mid] < A[right] || target >= A[left])
					right = mid - 1;
				else
					left = mid + 1;
			}
		}
		return -1;
	}
}
