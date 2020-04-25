package exam;

public class Cylinder {
	
	private Circle c;
	private Rectangle r;
	
	public Cylinder(double radius,double height) {
		c = new Circle(radius);
		r = new Rectangle(c.perimeter(), height);
	}
	public double area() {
		return 2*c.area()+r.area();
	}
	public double volume() {
		return c.area()*r.getLength();
	}

}
