void primeNumber();
void main()
{
	primeNumber();
}
void primeNumber()
{
	int n;
	printf("enter the number");
	scanf("%d",&n);
	int i=1;
	int yes=0;
	while(i<=n)
	{
		if(n%i==0)
		{
			yes++;
		}
		i++;
	}
	if(yes==2)
	{
		printf("%d is prime ",n);
	}
	else
	{
		printf("%d is not prime ",n);
	}
}