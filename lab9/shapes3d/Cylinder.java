package shapes3d;

import shapes2d.Circle;

public class Cylinder extends Circle{

	int height;
	
	public Cylinder(int radius,int height) {
		super(radius);
		
		this.height=height;
	}
	
	public double area() {
		return (super.area()*2)+ (2*Math.PI*radius*height);
	}
	
	public double volume() {
		return super.area() * height;
	
	}


	public String toString() {
		return "Cylinder [height=" + height + ", radius=" + radius + "]";
	}
	

}
