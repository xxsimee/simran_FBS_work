int armstrong(int);
void main()
{
	int n;
	printf("Enter the number ");
	scanf("%d",&n);
	for(int i=1;i<=n;i++)
	{
		if(armstrong(i))
		{
			printf("%d ",i);
		}
	}
}
int armstrong(int n)
{
		int i;
		int temp=n;
		int sum=0;
		while(temp>0)
		{
			int digit= temp%10;
			sum=sum+digit*digit*digit;
			temp=temp/10;
		}
		if(sum==n)
			return n;
		else
		 return 0;		
}