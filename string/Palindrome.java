package string;

import java.util.HashMap;
import java.util.Map;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TestCase
		String Str1 = "aba";
		 String  Str2 = "aab";
		
		System.out.println(palindromeCheck1(Str1));
		System.out.println(palindromeCheck2(Str2));
	}

	private static boolean palindromeCheck1(String str) {
		/*
		 * use string reverse method ;
		 */
		StringBuffer sb1 = new StringBuffer(str);
		System.out.println(sb1.reverse());
		if (sb1.reverse().toString().equals(str)) {
			return true;
		} else {

			return false;
		}
	}

	private static boolean palindromeCheck2(String s) {
		StringBuffer abc = new StringBuffer("aab");
		System.out.println(abc.reverse());
		        Map<Character, Integer> map = new HashMap<Character, Integer>();
		        // 统计每个字符的个数
		        for(int i = 0; i < s.length(); i++){
		            char c = s.charAt(i);
		            Integer cnt = map.get(c);
		            if(cnt == null){
		                cnt = new Integer(0);
		            }
		            map.put(c, ++cnt);
		        }
		        // 判断是否只有不大于一个的奇数次字符
		        boolean hasOdd = false;
		        for(Character c : map.keySet()){
		            if(map.get(c) % 2 == 1){
		                if(!hasOdd){
		                    hasOdd = true;
		                } else {
		                    return false;
		                }
		            }
		        }
		        return true;

	}

}
