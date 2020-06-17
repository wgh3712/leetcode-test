package com.array;

public class TowSumTest {
	public int[] twoSum(int[] numbers, int target) {
		int[] index = new int[2];
		int i = 0;
		int j = numbers.length - 1;
		while (i < j) {
			if (numbers[i] + numbers[j] == target) {
				index[0] = i;
				index[1] = j;
				return index;
			}
			if (numbers[i] + numbers[j] < target) {
				i++;
			}
			if (numbers[i] + numbers[j] > target) {
				j--;
			}
		}
		return index;
	}
}
