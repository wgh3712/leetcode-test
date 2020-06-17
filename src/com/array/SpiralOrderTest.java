package com.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 螺旋矩阵
 * 
 * @author wangguanghui 给定一个包含 m x n 个元素的矩阵（m 行, n 列），请按照顺时针螺旋顺序，返回矩阵中的所有元素。 示例
 *         1: 输入: [ [ 1, 2, 3 ], [ 4, 5, 6 ], [ 7, 8, 9 ] ] 输出:
 *         [1,2,3,6,9,8,7,4,5]
 *
 *
 *
 *
 *
 *
 *
 *
 */
public class SpiralOrderTest {
	public static List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> list = new ArrayList<>();
		Set<Integer> set = new HashSet<>();
		if (matrix.length == 0 || matrix[0].length == 0) {
			return list;
		}
		// 路径方向 0 右移 1: 下移 2 左移 3下移
		int way = 0;
		int row = matrix[0].length;
		int col = matrix.length;
		int m = 0, n = 0;
		for (int i = 0; i < col * row; i++) {
			list.add(matrix[m][n]);
			set.add(matrix[m][n]);
			switch (way) {
			case 0:
				if (n + 1 < row && !set.contains(matrix[m][n + 1])) {
					n++;
				} else {
					m++;
					way = (way + 1) % 4;
				}
				break;
			case 1:
				if (m + 1 < col && !set.contains(matrix[m + 1][n])) {
					m++;
				} else {
					n--;
					way = (way + 1) % 4;
				}

				break;
			case 2:
				if (n - 1 >= 0 && !set.contains(matrix[m][n - 1])) {
					n--;
				} else {
					m--;
					way = (way + 1) % 4;
				}
				break;
			case 3:
				if (m - 1 >= 0 && !set.contains(matrix[m - 1][n])) {
					m--;
				} else {
					n++;
					way = (way + 1) % 4;
				}
				break;

			default:
				break;
			}

		}

		return list;
	}

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
		spiralOrder(matrix);
	}
}
