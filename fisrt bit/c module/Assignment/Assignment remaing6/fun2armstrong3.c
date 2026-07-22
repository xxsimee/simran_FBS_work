void armstrongnumber(int);
void main()
{
	int n;
	printf("enter the number");
	scanf("%d",&n);
    armstrongnumber(n);
}
void armstrongnumber(int n)
{
	int input=n;
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
		printf("armstrong");
	else
		printf("Not armstrong");
}