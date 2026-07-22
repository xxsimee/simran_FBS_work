void leaf();
void main()
{
	leaf();
}

void leaf()
{
	int year;
	printf("enter the year");
	scanf("%d",&year);
	if (year%4==0)
	{
		printf("is leaf year");
	}
	else
	{
		printf("not leaf year");
	}
}