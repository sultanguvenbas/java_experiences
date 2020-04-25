package shapes2d;

public class Test2dShapes {

	public static void main(String[] args) {
		
		Circle c= new Circle(5);
		
		System.out.println(c.area());
		
		String str2= c.toString();
		System.out.println(str2);
		
		Square s= new Square(5);
		
		System.out.println(s.area());
		
		String str=s.toString();
		
		System.out.println(str);
		
	}

}
