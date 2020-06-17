package com.array;

import java.util.ArrayList;
import java.util.List;

/**
 * 杨辉三角
 * 
 * @author wangguanghui
 *
 */
public class GenerateTest {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		for (int i = 0; i < numRows; i++) {
			List<Integer> sublist = new ArrayList<>();
			list.add(sublist);
			for (int j = 0; j <= i; j++) {
				if (j == 0 || j == i) {
					sublist.add(1);
				} else {
					int num = list.get(i - 1).get(j - 1) + list.get(i - 1).get(j);
					sublist.add(num);
				}
			}
		}
		return list;
	}

	// "static void main" must be defined in a public class.
	public static void main(String[] args) {
		String s1 = "Hello World";
		// 1. concatenate
		s1 += "!";
		System.out.println(s1);
		// 2. find
		System.out.println("The position of first 'o' is: " + s1.indexOf('o'));
		System.out.println("The position of last 'o' is: " + s1.lastIndexOf('o'));
		// 3. get substring
		System.out.println(s1.substring(6, 11));
	}
}
