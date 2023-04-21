abstract class Shape
{
	abstract void calculateArea();
	
}

class Circle extends Shape{
	
	double r;
	

	public Circle(double r) {
		super();
		this.r = r;
	}



	@Override
	void calculateArea() {
		double area = 3.14 *r*r;
		System.out.println("Area of circle : "+area);

		
	}
	
}

class Rectangle extends Shape{
	
	double l ,b;

	public Rectangle(double l, double b) {
		super();
		this.l = l;
		this.b = b;
	}
	
	@Override
	void calculateArea() {
		double area = l*b;
		System.out.println("Area of rectangle :"+area);
	}
	
}

public class Abstract_Lab {

	public static void main(String[] args) {
		
		Circle c = new Circle(5);
		c.calculateArea();
		Rectangle r = new Rectangle(5,8);
		r.calculateArea();
		
	}

}
