package com.String;

/**
 * 二进制求和
 * 
 * @author wangguanghui
 *
 */
public class AddBinaryTest {
	public String addBinary(String a, String b) {
		String result = "";
		int alen = a.length() - 1;
		int blen = b.length() - 1;
		int sum = 0;
		while (alen >= 0 || blen >= 0) {
			if (alen >= 0 && blen >= 0) {
				sum = sum + Integer.parseInt(a.substring(alen, alen + 1))
						+ Integer.parseInt(b.substring(blen, blen + 1));
				result = String.valueOf(sum % 2) + result;
				sum = sum / 2;
				alen--;
				blen--;
			} else if (alen >= 0 && blen < 0) {
				sum = sum + Integer.parseInt(a.substring(alen, alen + 1));
				result = String.valueOf(sum % 2) + result;
				sum = sum / 2;
				alen--;
			} else if (blen >= 0 && alen < 0) {
				sum = sum + Integer.parseInt(b.substring(blen, blen + 1));
				result = String.valueOf(sum % 2) + result;
				sum = sum / 2;
				blen--;
			}

		}
		if (sum > 0) {
			result = "1" + result;
		}
		return result;
	}
}
