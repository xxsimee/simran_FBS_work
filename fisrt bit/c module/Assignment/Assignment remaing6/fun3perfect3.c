int  perfectnumber();
void main()
{
	int perfect=perfectnumber();
	if(perfect==1)
	printf("perfect number");
	else
	printf("number is not perfect");
}
int perfectnumber()
{
	int i=1;
	int n;
	printf("Enter the number");
	scanf("%d",&n);
	int sum=0;
	while(i<=n/2)
	{
		if(n%i==0)
		{
			sum=sum+i;
		}
			i++;
	}
	if(sum==n)
	{
		return 1;
	}
	else
	{
		return 0;
	}
			
}