int triangle(int,int,int);
void main()
{
int a,b,c;
printf("Enter a,b and c \n");
scanf("%d%d%d",&a,&b,&c);
 int angle= triangle(a,b,c);
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
int triangle(int a, int b, int c)
{
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