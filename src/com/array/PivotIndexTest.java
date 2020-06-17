package com.array;

public class PivotIndexTest {
	// 思路错误 负数结果有误
	// 无序数组 不适合用双指针解法
	/*
	 * public static int pivotIndex(int[] nums) { if (nums.length == 0) { return -1;
	 * } int i = 0; int j = nums.length - 1; int leftSum = 0; int rightSum = 0;
	 * 
	 * while (i < j) { if (leftSum < rightSum) { leftSum += nums[i++]; continue; }
	 * if (leftSum > rightSum) { rightSum += nums[j--]; continue; } if (leftSum ==
	 * rightSum) { leftSum += nums[i++]; rightSum += nums[j--]; continue; }
	 * 
	 * } if (leftSum == rightSum && i == j) { return i; } else { return -1; } }
	 */

	// 判断中心索引条件
	// 左侧索引如果和右侧相等，即二倍加左侧累加和+中心索引=总和

	public static int pivotIndex(int[] nums) {
		int sumLeft = 0, sum = 0;
		for (int n : nums) {
			sum = sum + n;
		}
		int numsSize = nums.length - 1;
		for (int i = 0; i <= numsSize; i++) {
			if (i == 0) {
				sumLeft = 0;
			} else {
				sumLeft += nums[i - 1];
			}
			// 左侧索引如果和右侧相等，即二倍左侧加中心索引=总和
			if (sumLeft * 2 + nums[i] == sum) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 7, 3, 6, 5, 6 };
		pivotIndex(nums);
	}
}
