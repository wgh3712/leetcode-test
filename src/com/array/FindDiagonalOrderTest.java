package com.array;

/**
 * 对角线遍历
 * 
 * 
 * 
 * @author wangguanghui
 *
 */
public class FindDiagonalOrderTest {
	public static int[] findDiagonalOrder(int[][] matrix) {
		if (matrix.length == 0 || matrix[0].length == 0) {
			return new int[0];
		}
		int m = 0, n = 0;
		int height = matrix.length;
		int weight = matrix[0].length;
		// true ：向右上方移动 (-1,1) false: 向左下方移动(1,-1)
		boolean flag = true;
		int[] newmatrix = new int[height * weight];
		for (int i = 0; i < newmatrix.length; i++) {
			newmatrix[i] = matrix[m][n];
			if (flag) {
				m -= 1;
				n += 1;
				if (n > weight - 1) {
					flag = false;
					m += 2;
					n -= 1;
				} else if (m < 0 && n <= weight - 1) {
					flag = false;
					m += 1;
				}
			} else {
				m += 1;
				n -= 1;
				if (m > height - 1) {
					flag = true;
					m -= 1;
					n += 2;
				} else if (m <= height - 1 && n < 0) {
					flag = true;
					n += 1;
				}
			}

		}
		return newmatrix;
	}

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[] newmat = findDiagonalOrder(matrix);
	}
}
