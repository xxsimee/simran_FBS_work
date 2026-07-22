void perfectnumber(int);
void main()
{
	int n;
	printf("Enter the number");
	scanf("%d",&n);
	perfectnumber(n);
}
void perfectnumber(int n)
{
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
		printf("%d is perfect number ",n);
	}
	else
	{
		printf("%d is not perfect number ",n);
	}
			
}