int primeNumber(int n);
void main()
{
	int n;
	printf("enter the number");
	scanf("%d",&n);
	int prime=primeNumber(n);
	if(prime=1)
	printf("  %d is prime",n);
	else
	printf(" %d is not prime",n);
}
int primeNumber(int n)
{
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
	return 1;
	}
	else
	{
		return 0;
	}
}