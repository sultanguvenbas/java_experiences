package shapes3d;

public class Test3dShapes {
	
	public static void main(String[] args) {
		
		Cylinder cyl=new Cylinder(5	, 10);
		
		double area = cyl.area();
		
		System.out.println(area);
		
		Cube cube = new Cube(5);
		
		System.out.println(cube.area());
		System.out.println(cube);
	}

}
