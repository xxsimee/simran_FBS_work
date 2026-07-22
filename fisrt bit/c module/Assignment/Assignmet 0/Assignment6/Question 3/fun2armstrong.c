void armstrong(int);
void main()
{
	int n;
	printf("Enter the number ");
	scanf("%d",&n);
	armstrong(n);
}
void armstrong(int n)
{
	for(int i=1; i<=n; i++)
	{
		int temp=i;
		int sum=0;
		while(temp>0)
		{
			int digit= temp%10;
			sum=sum+digit*digit*digit;
			temp=temp/10;
		}
		if(sum==i)
			printf("%d ",i);		
	}
}