package JavaTask;
interface Shapes{
	double getArea();
	
}
class Rectangle implements Shapes{
	double length,breath;
	public Rectangle(double l,double b) {
		this.length=l;
		this.breath=b;
		//Area of Rectangle=length * breath

	}

	@Override
	public double getArea() {
	
		return length*breath;
		
	}
	
}
class Circle implements Shapes{
	double radius;
	public Circle(double r) {
		this.radius=r;
		//Area of Circle=pi*r^2
		
	}

	@Override
	public double getArea() {
		return Math.PI * radius* radius;
		
	}
	
}
class Triangle implements Shapes{
	double base,height;
	public Triangle(double b,double h) {
		this.base=b;
		this.height=h;
		//Area of Triangle=1/2 * base*height
	}

	@Override
	public double getArea() {
		return 0.5*base*height;
		
	}
	
}

public class ShapeInterface {
	

	public static void main(String[] args) {
		Rectangle R=new Rectangle(10,9);
		Circle C=new Circle(5);
		Triangle T=new Triangle(8,6);
		System.out.println("Area of Rectangle: "+R.getArea());
		System.out.println("Area of Circle: "+C.getArea());
		System.out.println("Area of Triangle: "+T.getArea());

	}

}
