package exam;

public class Rectangle {
	private double length;
	private double width;
	
   public Rectangle(double w,double l) {
	   length = l;
	   width = w;
	   
   }
   public double area() {
	   return length*width;
   }
   public double perimeter() {
	   return 2*(length+width);
   }
   public void setLength(double length) {
	   this.length=length;
   }
   public void setWidth(double width) {
	   this.width=width;
   }
   public double getLength() {
	   return length;
   }
   public double getWidth() {
	   return width;
   }
} 