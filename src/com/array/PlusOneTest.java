package com.array;

public class PlusOneTest {
	public int[] plusOne(int[] digits) {
		int plus = 1;
		for (int i = digits.length - 1; i >= 0; i--) {
			plus = (digits[i] + 1) / 10;
			digits[i] = (digits[i] + plus) % 10;
		}
		if (plus > 0) {
			int[] newdig = new int[digits.length + 1];
			newdig[0] = plus;
			System.arraycopy(digits, 0, newdig, 1, digits.length);
			return newdig;
		}
		return digits;
	}
}
