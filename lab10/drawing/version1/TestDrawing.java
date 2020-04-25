package drawing.version1;

import shapes.Circle;
import shapes.Rectangle;
import shapes.Square;

public class TestDrawing {

	public static void main(String[] args) {
		
		Drawing drawing = new Drawing();
		
		Circle c = new Circle(5);
		Object obj =(Object)c;   //up casting
		c.area();
		obj.toString();
		obj = "Hello";    //çalısırken hata verir
		if (obj instanceof Circle) //burda kontrol ediyoruz
			((Circle)obj).area();  //down casting
		
		drawing.addCircle(new Circle(5));
		drawing.addCircle(new Circle(10));
		
		drawing.addRectangle(new Rectangle(5,6));
		drawing.addSquare(new Square(5));

		System.out.println("Total area = " + drawing.calculateTotalArea());
	}

}
