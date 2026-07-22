int score(int);
void main()
{
int marks;
printf("Enter the marks");
scanf("%d",&marks);
int sc=score(marks);
	if(sc==1)
		printf("distinction");
	if(sc==2)
		printf("fisrt class");
	if(sc==3)
		printf("second class");
	if(sc==4)
		printf("pass");
	if(sc==5)
		printf("fail");
}

int score(int marks)
{
	
if(marks>=75 )
{
	return 1;
}
else
{
	if(marks>=65 )
		return 2;
	else
	{
		if(marks>=55 )
		return 3;
		else
		{
			if(marks>=40 )
				return 4;
			else
				return 5;
		}
	}
}
}
	
