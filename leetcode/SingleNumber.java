package leetcode;
/*
 * Given 2*n + 1 numbers, every numbers occurs twice except one, find it.
 * 
 * 3	^ (bitwise XOR)
Binary XOR Operator copies the bit if it is set in one operand but not both.
 * */
public class SingleNumber {
	public static void main(String args[]) {
//		int[] A = { 1, 1, 3, 4, 3, 1 };
		int[] B = { 1, 2, 2, 1, 3, 4, 3 };
		System.out.println(" => " + singleNumber3(B));
	}

	public static int singleNumber(int[] A) {
		int result = 0;

		for (int i = 0; i < A.length; i++) {
			result = result ^ A[i];
		}

		return result;

	}

	public static int singleNumber2(int[] A) {
		int result = 0;
		for (int i = 0; i < A.length; i++) {
			result = result ^ A[i];
		}
		return result;
	}

	public static int singleNumber3(int[] A) {
		if (A.length == 0) {
			return 0;
		}

		int n = A[0];
		for (int i = 1; i < A.length; i++) {
			n = n ^ A[i];
		}

		return n;
	}
}
