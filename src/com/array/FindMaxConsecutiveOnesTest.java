package com.array;

/**
 * 最大连续1的个数 给定一个二进制数组， 计算其中最大连续1的个数
 * 
 * @author wangguanghui
 *
 */
public class FindMaxConsecutiveOnesTest {
	public int findMaxConsecutiveOnes(int[] nums) {
		int maxLen = 0;
		int nowLen = 0;
		int i = 0;
		while (i < nums.length) {
			while (i < nums.length && nums[i] == 1) {
				nowLen += 1;
				i++;
			}
			maxLen = Math.max(maxLen, nowLen);
			if (i < nums.length && nums[i] != 1) {
				nowLen = 0;
				i++;
			}
		}

		return maxLen;
	}
}
