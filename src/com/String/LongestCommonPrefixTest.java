package com.String;

/**
 * 最长公共前缀
 * 
 * @author wangguanghui
 *
 */
public class LongestCommonPrefixTest {
	public String longestCommonPrefix(String[] strs) {
		if (strs.length == 0) {
			return "";
		}
		int minLen = Integer.MAX_VALUE;
		for (String str : strs) {
			minLen = Math.min(minLen, str.length());
		}
		String temp = strs[0].substring(0, minLen);
		for (int i = 1; i < strs.length; i++) {
			while (!strs[i].startsWith(temp)) {
				temp = temp.substring(0, temp.length() - 1);
				if (temp.length() == 0) {
					return "";
				}
			}
		}
		return temp;
	}
}
