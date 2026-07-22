void leaf(int*);
void main()
{
	int year;
	printf("enter the year");
	scanf("%d",&year);
	leaf(&year);
}

void leaf(int* year)
{
	if (*year%4==0)
	{
		printf("is leaf year");
	}
	else
	{
		printf("not leaf year");
	}
}