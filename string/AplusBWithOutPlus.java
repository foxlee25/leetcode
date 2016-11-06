package string;

public class AplusBWithOutPlus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println(" === >" +addMethod(0, 5));
	}

	public static int addMethod(int x, int y) {
		if (y == 0)
			return x;
		else
			return addMethod(x ^ y, (x & y) << 1);
	}

}
