package shapes;

public class Square extends Shape{
	
	double side;
	
	public Square(int side) {
		this.side=side;
		
	}
	public double area() {
		return side * side;
	}

}
