void main()
{
	int n=648;
	int input=153;
	int sum=0;
	int digit,sdigit;
	while(n>0)
	{
		digit=n%10;
		sdigit= digit*digit*digit;
		sum=sum+sdigit;
		n=n/10;
	}
	if(sum==input)
		{
		printf("armstrong");
	}
	else
	{
		printf("Not armstrong");
	}
}