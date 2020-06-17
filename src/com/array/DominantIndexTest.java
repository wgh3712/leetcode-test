package com.array;

/**
 * 在一个给定的数组nums中，总是存在一个最大元素 。 查找数组中的最大元素是否至少是数组中每个其他数字的两倍。
 * 如果是，则返回最大元素的索引，否则返回-1。
 * 
 * @author wangguanghui
 *
 */
public class DominantIndexTest {
	public int dominantIndex(int[] nums) {
		int max = nums[0];
		// 最大数是否满足大于其它的两倍
		boolean flag = true;
		// 下标
		int index = 0;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] > max) {
				if (nums[i] >= 2 * max) {
					flag = true;
				} else {
					flag = false;
				}
				max = nums[i];
				index = i;
			} else {
				if (max >= 2 * nums[i] && flag) {
					flag = true;
				} else {
					flag = false;
				}
			}
		}
		if (flag) {
			return index;
		} else {
			return -1;
		}
	}
}
