package com.String;

/**
 * 实现 strStr() 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle
 * 字符串出现的第一个位置 (从0开始)。如果不存在，则返回 -1。
 * 
 * @author wangguanghui
 *
 */
public class Strindexof {
	public int strStr(String haystack, String needle) {
		if (needle.length() == 0) {
			return 0;
		}

		int space = needle.length();
		for (int i = 0; i <= haystack.length() - space; i++) {
			if (haystack.substring(i, i + space).equals(needle)) {
				return i;
			}
		}
		return -1;
	}
}
