void main()
{
	int n=3;
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