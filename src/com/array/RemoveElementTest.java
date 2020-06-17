package com.array;

/**
 * 移除元素
 * 
 * @author wangguanghui
 *
 */
public class RemoveElementTest {
	public static int removeElement(int[] nums, int val) {
		int i = 0;
		int j = nums.length - 1;
		if (nums.length == 0) {
			return 0;
		}
		while (i < j) {
			while (nums[i] != val && i < j) {
				i++;
			}
			while (nums[j] == val && i < j) {
				j--;
			}
			if (i < j) {
				int temp = nums[j];
				nums[j] = nums[i];
				nums[i] = temp;
			}
		}
		if (nums[i] == val) {
			return i;
		} else {
			return i + 1;
		}
	}

	/**
	 * 删除排序数组中的重复项(要求：空间复杂度O(1))
	 * 
	 * @param nums
	 * @return
	 */
	public static int removeDuplicates(int[] nums) {
		int j = nums.length;
		for (int i = 0; i < j; i++) {
			int k = i + 1;
			while (k < j) {
				if (nums[k] == nums[i]) {
					while (nums[i] == nums[j - 1] && j > k) {
						j--;
					}
					if (nums[j - 1] != nums[k]) {
						nums[k] = nums[j - 1];
					}
				}
				k++;
			}
		}
		return j;
	}

	/**
	 * 快慢指针解法 数组有序
	 * 
	 * @param nums
	 * @return
	 */
	public static int removeDuplicates1(int[] nums) {
		int i = 0;
		for (int j = 1; j < nums.length; j++) {
			if (nums[i] != nums[j]) {
				i++;
				nums[i] = nums[j];
			}

		}
		return i + 1;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 1, 2 };
		System.out.println(removeDuplicates(nums));
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i] + ",");
		}

	}
}
