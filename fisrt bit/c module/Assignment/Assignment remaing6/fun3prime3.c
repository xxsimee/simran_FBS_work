int primeNumber();
void main()
{
	int prime=primeNumber();
	if(prime=1)
	printf("   prime");
	else
	printf(" not prime");
}
int primeNumber()
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
	return 1;
	}
	else
	{
		return 0;
	}
}