package leetcode;

public class LongestCommString {
/*
 * 暴力解法  复杂度： n2
 * 
 * */
	public static void main(String args[]) {

		System.out.println("暴力解法");
		System.out.println(longestCommString("abcde", "babc"));

	}

	public static int longestCommString(String strA, String strB) {
		int strLength = -1;

		int lenA = strA.length();
		int lenB = strB.length();

		if (strA.length() == 0 || strB.length() == 0) {
			return 0;

		}

		for (int i = 0; i < lenA; i++) {
			for (int j = 0; j < lenB; j++) {
				int m = i;
				int n = j;
				int subLongest = 0;
				while (m < lenA && n < lenB) {

					if (strA.charAt(m) == strB.charAt(n)) {
						m++;
						n++;
						subLongest += 1;
					} else {
						break;
					}

				}
				strLength = Math.max(strLength, subLongest);
			}
		}

		return strLength;
		
	}
}
