package drawing.version3;

import shapes.Circle;
import shapes.Square;
import shapes.Rectangle;

public class TestDrawing {

	public static void main(String[] args) {
		
		//Shape shape = new Shape();
		
		Drawing drawing = new Drawing();
		
		drawing.addShape(new Circle(5));
		drawing.addShape(new Rectangle(5,8));
		drawing.addShape(new Square(5));

		System.out.println("Total area = " + drawing.calculateTotalArea());
	}

}
