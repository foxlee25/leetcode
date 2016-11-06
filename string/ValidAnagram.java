package string;

/*
 *  	anagram : 顺序颠倒
 *   
 * */
public class ValidAnagram {
	public static void main(String args[]) {

		String str = "abcd";
		String str2 = "abcd";

		System.out.println(checkAnagram(str, str2) + " ");

	}

	static boolean checkAnagram(String a, String b) {
		int[] alphabet = new int[26];
		if (a.length() != b.length()) {
			return false;
		} else {
			for (int i = 0; i < a.length(); i++) {
				alphabet[a.charAt(i) - 'a']++;
			}
			for (int i = 0; i < b.length(); i++) {
				alphabet[b.charAt(i) - 'a']--;
			}
			for (int i : alphabet) {
				if (alphabet[i] != 0) {
					return false;
				} else
					return true;
			}

		}

		return false;
	}

}
