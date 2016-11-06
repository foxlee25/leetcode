package string;

import java.util.HashSet;
import java.util.Set;

public class SingleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


	public int singleNumber(int[] A) {

		Set<Integer> s = new HashSet<Integer>();
		for (int i : A) {
			if (!s.add(i)) {
				s.remove(i);
			}
		}
		return s.iterator().next();

	}
	
	
}
