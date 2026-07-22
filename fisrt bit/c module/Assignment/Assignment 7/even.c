void even(int*);
void main()
{
	int i ;
	printf("enter number");
	scanf("%d",&i);
	even(&i);
}

void even(int* i)
{
	if (*i%2==0)
	{
		printf("number is even %d ",*i);
	}
	else
	{
		printf("number is odd");
	}
}