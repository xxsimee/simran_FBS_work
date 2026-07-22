int triangle();
void main()
{
	 int angle= triangle();
	 if(angle==1)
	 {
	 	printf("Equilateral");
	 }
	 if(angle==2)
	 {
	 	printf("Isolated");
	 }
	 if(angle==3)
	 {
	 	printf("Sealene");
	 }
	
}
int triangle()
{
	int a=10;
	int b=20;
	int c=10;
	if(a==b && b==c)
	{
		return 1;
	}
	else
	{
		if (a==b || b==c || a==c)
		{
			return 2;
		}
		else
		{
			return 3;
		}
	}
	
}