int  perfectnumber(int);
void main()
{
	int n;
	printf("Enter the number");
	scanf("%d",&n);
	int perfect=perfectnumber(n);
	if(perfect==1)
	printf("%d perfect number",n);
	else
	printf("%d number is not perfect",n);
}
int perfectnumber(int n)
{
	int i=1;
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