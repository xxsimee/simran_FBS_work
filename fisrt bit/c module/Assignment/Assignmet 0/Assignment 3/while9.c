void main()
{
	int n=123;
	int org=123;
	int rev=0, sum=0;
	while(n>0)
	{
		int rem=n%10;
		
		rev=rev*10+rem;
			n=n/10;
	}
	sum=sum+rev;
	if(sum==org)
	{
		printf("palidrome");
	}
	else
	{
		printf(" not palidrome");
	}
	
	
}