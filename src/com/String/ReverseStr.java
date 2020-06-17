package com.String;

/**
 * 反转字符串
 * 
 * @author wangguanghui
 *
 */
public class ReverseStr {
	public void reverseString(char[] s) {
		if (s.length < 2) {
			return;
		}
		int i = 0;
		int j = s.length - 1;
		while (i < j) {
			char temp = s[i];
			s[i] = s[j];
			s[j] = temp;
			i++;
			j--;
		}
	}

	/**
	 * 反转字符串中的单词 III 给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
	 * 
	 * @param s
	 * @return
	 */
	public String reverseWords(String s) {
		String[] strs = s.split(" ");
		StringBuilder strbui = new StringBuilder();
		for (String str : strs) {
			for (int i = str.length() - 1; i >= 0; i--) {
				strbui.append(str.charAt(i));
			}
			strbui.append(" ");
		}
		return strbui.substring(0, strbui.length() - 1);
	}
}
