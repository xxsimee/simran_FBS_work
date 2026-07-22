void score(int*);
void main()
{
int marks;
printf("Enter the marks");
scanf("%d",&marks);
score(&marks);
}
void score(int* marks)
{
if(*marks>=75 )
{
	printf("distinction");
}
else
{
	if(*marks>=65 )
	{
		printf("fisrt class");
	}
	else
	{
		if(*marks>=55 )
		{
			printf("second class");
			
		}
		else
		{
			if(*marks>=40 )
			{
				printf("pass");
			}
			else
			{
				printf("fail");
			}
		}
	}
}
}
	
