class Test{
	void add(int a, int b)
	{
		System.out.println("void add(int a, int b)");
	}
	void add(int a)
	{
		System.out.println("void add(int a)");
		System.out.println(a);
	}
	void add(int a, double b)
	{
		System.out.println("void add(int a, double b)");
		System.out.println("addition is "+a+b);
	}
	void add(double a, double b)
	{
		System.out.println("void add(double a, double b)");
		System.out.println(a+b);
	}
	void add(double a ,int b)
	{
		System.out.println("void add(double a ,int b)");
		System.out.println(a+b);
	}
	void sub(int a,int b)
	{
		System.out.println(a-b);
	}
	void div(int a,int b)
	{
		System.out.println(a/b);
	}
}


class TestOverloading {

	public static void main(String[] args) {
		Test c1=new Test();
		c1.add(10.5,10);
		

	}

}
