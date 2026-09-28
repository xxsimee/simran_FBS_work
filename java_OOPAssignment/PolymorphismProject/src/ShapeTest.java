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

	public String toString() {
		return "\nArea"+this.area;
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
	
	public String toString() {
		return super.toString()+"\nRadius"+this.radius;
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

	public String toString() {
		return super.toString()+"\nBase:"+this.base+"\nHeight:"+this.height;
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

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"\nLength:"+this.length+"\nBreadth: "+this.breadth;
	}
}
class ShapeTest {
	public static void main(String[] args) {
		
		System.out.println("Shape Area :");
		Shape s1=new Shape(00);
		System.out.println(s1);
		System.out.println();
		
		System.out.println("Circle:");
		s1=new Circle(4.3);
		System.out.println(s1);
		System.out.println();
		
		System.out.println("Triangle");
		s1=new Triangle(11,23.5);
		System.out.println(s1);
		System.out.println();
		
		System.out.println("Rectangel");
		s1=new Rectangle(12.5,34);
		System.out.println(s1);
		System.out.println();
	}
}
