int palidrome();
void main()
{
	int num=palidrome();
	if(num==1)
	printf("number is palidrome");
	else
	printf("number is not palidrome");
}
int palidrome()
{
	int n;
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
		return 1;
	}
	else
	{
		return 0;
	}
}