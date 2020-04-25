package exam;

public class Question1 {

	static int triType(int a, int b, int c) {
		if (a > b) {
			a = a + b;
			b = a - b;
			a = a - b;
		}
		if (b > c) {
			b = b + c;
			c = b - c;
			b = b - c;
		}
		if (a + b <= c)
			return 0;
		else if ((a == b) && (b == c))
			return 1;
		else if (a * a + b * b == c * c)
			return 2;
		else if ((a == b) || (b == c) || (a == c))
			return 3;
		return 4;
	}

	public static void main(String args[]) {
		System.out.println(triType(4, 4, 4) + " " + triType(4, 4, 3) + " " + triType(5, 4, 3) + " " + triType(2, 3, 4)
				+ " " + triType(4, 2, 1));
	}

}
