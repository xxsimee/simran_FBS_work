void palidrome();
void main()
{
	palidrome();
}
void palidrome()
{
	int n ;
	printf("enter the number");
	scanf("%d",&n);
	int org=n;
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