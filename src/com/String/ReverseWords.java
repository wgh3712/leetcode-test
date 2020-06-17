package com.String;

/**
 * 翻转字符串里的单词 给定一个字符串，逐个翻转字符串中的每个单词。
 * 
 * @author wangguanghui
 *
 */
public class ReverseWords {
	public static String reverseWords(String s) {
		String[] strs = s.split(" ");
		int len = strs.length;
		int i = 0;
		int j = len - 1;
		while (i < j) {
			String temp = strs[j].trim();
			strs[j] = strs[i].trim();
			strs[i] = temp;
			i++;
			j--;
		}
		StringBuilder ret = new StringBuilder();
		for (String str : strs) {
			if (str.equals(""))
				continue;
			ret.append(str.replace(" ", "") + " ");
		}
		return ret.toString().trim();
	}

	public static void main(String[] args) {
		System.out.println(reverseWords("a good   example"));
	}
}
