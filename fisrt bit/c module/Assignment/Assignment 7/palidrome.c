void palidrome(int*);
void main()
{
	int n;
	printf("Enter the number");
	scanf("%d",&n);
	palidrome(&n);
}
void palidrome(int* n)
{
	int org=*n;
	int rev=0;
	while(*n>0)
	{
		int rem=*n%10;
		
		rev=rev*10+rem;
			*n=*n/10;
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