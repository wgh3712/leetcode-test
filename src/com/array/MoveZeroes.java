package com.array;

/**
 * 移动零 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * 
 * @author wangguanghui
 *
 */
// 快慢指针解法
public class MoveZeroes {
	public void moveZeroes(int[] nums) {
		int i = 0;
		for (int j = 0; j < nums.length; j++) {
			if (nums[j] != 0) {
				nums[i] = nums[j];
				i++;
			}
		}
		for (; i < nums.length; i++) {
			nums[i] = 0;
		}

	}
}
