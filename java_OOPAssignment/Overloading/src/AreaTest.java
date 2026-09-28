class Shape{
	double area;
	
	void calculateArea(Triangle t1)
	{
		area=0.5*t1.base*t1.height;
		System.out.println("Area of Triangle is: "+area);
	}
	void calculateArea(Rectangle r1)
	{
		area=r1.length*r1.breadth;
		System.out.println("Area of Rectangle is: "+area);
	}
	void calculateArea(Circle c1)
	{
		area=3.14*c1.radius*c1.radius;
		System.out.println("Area of Circle is: "+area);
	}
}
class Triangle{
	double base;
	double height;
	Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}
	
}
class Rectangle{
	double length;
	double breadth;
	Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	
}
class Circle{
	double radius;

	Circle(double radius) {
		super();
		this.radius = radius;
	}
	
}
class AreaTest {

	public static void main(String[] args) {
		Shape s1=new Shape();
		
		Triangle t1=new Triangle(23.4,33);
		s1.calculateArea(t1);
		
		Rectangle r1=new Rectangle(33.12,12.4);
		s1.calculateArea(r1);
		
		Circle c1=new Circle(23.1);
		s1.calculateArea(c1);

	}

}
