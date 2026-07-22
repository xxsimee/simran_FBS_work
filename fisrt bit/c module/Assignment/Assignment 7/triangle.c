void triangle(int*,int*,int*);
void main()
{
int a,b,c;
printf("Enter a,b and c \n");
scanf("%d%d%d",&a,&b,&c);
 triangle(&a,&b,&c);
	
}
void triangle(int* a, int* b, int* c)
{
	if(*a==*b && *b==*c)
	{
		printf("triangle is equilateral");
	}
	else
	{
		if (*a==*b || *b==*c || *a==*c)
		{
			printf("triangle is isolated");
		}
		else
		{
				printf("triangle is scalene");
		}
	}
	
}