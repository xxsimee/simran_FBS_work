void triangle();
void main()
{
	triangle();
}
void triangle()
{
	int a=10;
	int b=10;
	int c=10;
	if(a==b && b==c)
	{
		printf("triangle is equilateral");
	}
	else
	{
		if (a==b || b==c || a==c)
		{
			printf("triangle is isolated");
		}
		else
		{
				printf("triangle is sealene");
		}
	}
	
}