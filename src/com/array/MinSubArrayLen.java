package com.array;

/**
 * 长度最小的子数组
 * 
 * @author wangguanghui
 *
 */
public class MinSubArrayLen {
	public static int minSubArrayLen(int s, int[] nums) {
		int len = nums.length;
		int i = 0;
		int j = 0;
		int sum = 0;
		int min = Integer.MAX_VALUE;
		while (i < len) {
			if (sum >= s) {
				min = Math.min(min, i - j);
				sum -= nums[j];
				j++;
			} else {
				sum += nums[i];
				i++;
			}
		}
		while (sum >= s && j < len) {
			min = Math.min(min, i - j);
			sum -= nums[j];
			j++;
		}
		if (min > len) {
			return 0;
		}
		return min;
	}

	public static void main(String[] args) {
		int[] nums = { 2, 3, 1, 2, 4, 3 };
		minSubArrayLen(7, nums);
	}
}
