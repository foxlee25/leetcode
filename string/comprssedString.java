package string;

public class comprssedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test Case	
		String Str1 = "aaccb";
		System.out.println(comPressedStr(Str1));
	}
	
	public static String comPressedStr(String str){
		
		String myStr = "";
		char last = str.charAt(0);
		int count =1 ;
		for(int i =1 ; i< str.length(); i++){
			if(str.charAt(i) == last){
				count ++ ;
			}else {
				myStr += last + "" + count ;
				last = str.charAt(i);
				count = 1 ;
			}
		}
		
		
		
		
		return myStr + last + count;
		
		
		
	}

}
