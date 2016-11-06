package string;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reversStr("abcdefg"));
		
	}

	public static String reverse(String s) {

		String reversedString = "";
		for (int i = s.length(); i > 0; i--) {
			reversedString += s.charAt(i - 1);
		}

		return reversedString;
	}

	public static String reversStr(String str) {
		String result = "";
		for (int i = str.length() -1; i >= 0; i--) {
			result += str.charAt(i);
		}

		return result;

	}

}
