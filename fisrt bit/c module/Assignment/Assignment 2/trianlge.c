void main()
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