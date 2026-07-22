void main()
{
	int n=145;
	int org=145;
	int rev=0;
	while(n>0)
	{
		int rem=n%10;
		
		rev=rev*10+rem;
			n=n/10;
	}
	if(rev==org)
	{
		printf("palidrome");
	}
	else
	{
		printf(" not palidrome");
	}
}