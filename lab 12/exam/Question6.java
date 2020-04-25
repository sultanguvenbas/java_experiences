package exam;

public class Question6 {

	int num;

	public Question6(int num) {
		this.num = ++num;
	}

	public static void main(String[] args) {
		int num1 = 4;
		int num2 = num1;
		Question6 qA = new Question6(num1);
		Question6 qB = qA;
		qB.num = qA.num + qA.num;
		String str = "Hello";
		qB = foo(qB, --num2, ++num1, str);
		System.out.println(num1 + ", " + num2 + ", " + qA.num + ", " + qB.num + ", " + str);
	}

	public static Question6 foo(Question6 q, int num1, int num2, String str) {
		str = "Hola";
		q.num = 20 + ++num1 + num2--;
		q = new Question6(num2);
		return q;
	}

}
