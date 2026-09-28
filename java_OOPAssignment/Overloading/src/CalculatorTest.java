import java.util.Scanner;
class Calculator{
	void add(int a, int b)
	{
		System.out.println(a+b);
	}
	void add(int a, double b)
	{
		System.out.println(a+b);
	}
	void add(double a, double b)
	{
		System.out.println(a+b);
	}
	void add(double a ,int b)
	{
		System.out.println(a+b);
	}
	void sub(int a,int b)
	{
		System.out.println(a-b);
	}
	void sub(double a,double b)
	{
		System.out.println(a-b);
	}
	void sub(double a, int b)
	{
		System.out.println(a-b);
	}
	void sub(int a,double b)
	{
		System.out.println(a-b);
	}
	void divide(int a,int b)
	{
		System.out.println(a/b);
	}
	void divide(double a,double b)
	{
		System.out.println(a/b);
	}
	void divide(int a,double b)
	{
		System.out.println(a/b);
	}
	void divide(double a,int b)
	{
		System.out.println(a/b);
	}
	void multi(int a,int b)
	{
		System.out.println(a*b);
	}
	void multi(double a,double b)
	{
		System.out.println(a*b);
	}
	void multi(double a,int b)
	{
		System.out.println(a*b);
	}
	void multi(int a, double b)
	{
		System.out.println(a*b);
	}
}

class CalculatorTest {

    public static void main(String[] args) {

        Scanner c = new Scanner(System.in);

        Calculator c1 = new Calculator();

        System.out.print("int value: ");
        int a = c.nextInt();

        System.out.print(" int value: ");
        int b = c.nextInt();
        
        System.out.println("Addition is:");
        c1.add(a, b);
        System.out.println("Substraction is:");
        c1.sub(a, b);
        System.out.println("division is: ");
        c1.divide(a, b);
        System.out.println("Multipilication is :");
        c1.multi(a, b);

        System.out.print("\n double value: ");
        double x = c.nextDouble();

        System.out.print(" double value: ");
        double y = c.nextDouble();

        System.out.println("Addition is:");
        c1.add(x, y);
        System.out.println("Substraction is:");
        c1.sub(x, y);
        System.out.println("division is: ");
        c1.divide(x, y);
        System.out.println("Multipilication is :");
        c1.multi(x, y);

        System.out.print(" int value: ");
        int p = c.nextInt();

        System.out.print(" double value: ");
        double q = c.nextDouble();

        System.out.println("Addition is:");
        c1.add(p, q);
        System.out.println("Substraction is:");
        c1.sub(p, q);
        System.out.println("division is: ");
        c1.divide(p, q);
        System.out.println("Multipilication is :");
        c1.multi(p, q);

        System.out.print(" double value: ");
        double m = c.nextDouble();

        System.out.print(" int value: ");
        int n = c.nextInt();

        System.out.println("Addition is:");
        c1.add(m, n);
        System.out.println("Substraction is:");
        c1.sub(m, n);
        System.out.println("division is: ");
        c1.divide(m, n);
        System.out.println("Multipilication is :");
        c1.multi(m, n);
        
        c.close();
    }
}