package com.array;

/**
 * 旋转数组
 * 
 * @author wangguanghui
 *
 */
public class Rotate {
	public static void rotate(int[] nums, int k) {
		int len = nums.length;

		int count = 0;
		for (int i = 0; count < len; i++) {
			int temp = nums[i];
			int index = i;
			do {

				int temp2 = nums[(index + k) % len];
				nums[(index + k) % len] = temp;
				temp = temp2;
				index = (index + k) % len;
				count++;
			} while (index != i);

		}
	}

	public void rotate1(int[] nums, int k) {
		k %= nums.length;
		reverse(nums, 0, nums.length - 1);
		reverse(nums, 0, k - 1);
		reverse(nums, k, nums.length - 1);
	}

	public void reverse(int[] nums, int start, int end) {
		while (start < end) {
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
		rotate(nums, 2);
		for (int num : nums) {
			System.out.println(num);
		}
	}
}
