package exam;

public class Cylinder2 extends Circle {

	private double height;

	public Cylinder2(double radius, double height) {
		super(radius);
		this.height = height;
	}

	public double area() {
		return 2 * super.area() + perimeter() * height;
	}

	public double volume() {
		return super.area() * height;
	}

	public String toString() {
		return super.toString() + "height= " + height;
	}

}
