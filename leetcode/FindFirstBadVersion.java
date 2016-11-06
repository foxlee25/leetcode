package leetcode;

//The code base version is an integer and start from 1 to n. One day, someone commit a bad version in the code case, so it caused itself and the following versions are all failed in the unit tests.

//You can determine whether a version is bad by the following interface: 

public class FindFirstBadVersion {

	public static void main() {

	}

	public int findFirstBadVersion(int n) {
		if (n == 1) {
			return 1;
		}
		int left = 1;
		int right = n;
		int mid;
		while (left < right) {
			// find the mid number of n ;
			mid = left + (right - left) / 2;
			// check this mid is badversion or not ,if it is go to left side
			// then set mid to right ;
			if (isBadVersion(mid)) {
				right = mid;
			} else {
				left = mid + 1;
			}

		}

		return right;
	}

	private boolean isBadVersion(int mid) {
		// TODO Auto-generated method stub
		//fake method 
		return false;
	}

}
