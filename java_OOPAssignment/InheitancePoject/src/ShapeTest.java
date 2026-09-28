class Shape{
	double area;

	Shape() {
		this.area = 0;
	}
	
	Shape(double area) {
		this.area = area;
	}

	double getArea() {
		return area;
	}

	void setArea(double area) {
		this.area = area;
	}
	
	void display()
	{
		System.out.println("Area is: "+this.area);
	}
}

class Circle extends Shape{
	double radius;
	
	Circle() {
		super();
		this.radius = 0;
	}
	Circle(double radius) {
		super();
		this.radius = radius;
		this.area=Math.PI *this.radius*this.radius;
	}
	double getRadius() {
		return radius;
	}
	void setRadius(double radius) {
		this.radius = radius;
	}
	
	void display() {
		System.out.println("Radius:"+this.radius);
		super.display();
	}
}

class Triangle extends Shape{
	double base;
	double height;
	
	Triangle() {
		super();
		this.base = 0;
		this.height = 0;
	}

	Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
		this.area=base*height;
	}
	
	
	double getBase() {
		return base;
	}

	void setBase(double base) {
		this.base = base;
	}

	double getHeight() {
		return height;
	}

	void setHeight(double height) {
		this.height = height;
	}

	void display()
	{
		System.out.println("Base: "+this.base);
		System.out.println("Height: "+this.height);
		super.display();
	}
}

class Rectangle extends Shape{
	double length;
	double breadth;
	Rectangle() {
		super();
		this.length = 0;
		this.breadth = 0;
	}
	
	Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
		this.area=this.length*this.length;
	}
	
	double getLength() {
		return length;
	}

	void setLength(double length) {
		this.length = length;
	}

	double getBreadth() {
		return breadth;
	}

	void setBreadth(double breadth) {
		this.breadth = breadth;
	}

	void display() {
		System.out.println("Length: "+this.length);
		System.out.println("Breadth"+this.breadth);
		super.display();
	}
}
class ShapeTest {
	public static void main(String[] args) {
		
		System.out.println("Circle:");
		Circle c1=new Circle(4.3);
		c1.display();
		System.out.println();
		
		System.out.println("Triangle");
		Triangle t1=new Triangle(11,23.5);
		t1.display();
		System.out.println();
		
		System.out.println("Rectangel");
		Rectangle r1=new Rectangle(12.5,34);
		r1.display();
		System.out.println();
	}
}
