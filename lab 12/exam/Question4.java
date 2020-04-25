package exam;

public class Question4 {
	
	public static double func(double value) {
		if(value==0)
			return 1;
		return 1+1/func(value-1);
	}

	public static void main(String[] args) {
	

	}

}
