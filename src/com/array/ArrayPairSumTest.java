package com.array;

/**
 * 数据拆分 给定长度为 2n 的数组, 你的任务是将这些数分成 n 对, 例如 (a1, b1), (a2, b2), ..., (an, bn)
 * ，使得从1 到 n 的 min(ai, bi) 总和最大。
 * 
 * @author wangguanghui
 *
 */
public class ArrayPairSumTest {
	public int arrayPairSum(int[] nums) {

		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			int index = i;
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] < nums[index]) {
					index = j;
				}
			}
			if (index != i) {
				int temp = nums[index];
				nums[index] = nums[i];
				nums[i] = temp;

			}
			if (i % 2 == 0) {
				sum += nums[i];
			}
		}
		return sum;
	}
}
