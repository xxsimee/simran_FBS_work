void main()
{
	int n=145;
	int  org=145;
	int sum=0;
	while(n>0)
	{
		int digit=n%10;
		int fact=1;
		int i =1;
		while(i<=digit)
		{
			fact=fact*i;
			i++;
		}
		
		sum=sum+fact;
		n=n/10;
		
	}
	printf("%d",sum);
	if(sum==org)
	{
		printf("strong number");
	}
	else
	{
		printf("not strong");
	}
}