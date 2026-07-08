void main()
{
	int n=4;
	int i=1;
	int sum=0;
	while(i<=n/2)
	{
		if(n%i==0)
		{
			sum=sum+i;
		}
			i++;
	}
	if(sum==n)
	{
		printf("%d is perfect number ",sum);
	}
	else
	{
		printf("%d is not perfect number ",sum);
	}
			
}