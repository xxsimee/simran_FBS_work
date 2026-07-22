void strong(int*);
void main()
{
	int n;
	printf("enter number");
	scanf("%d",&n);
	strong(&n);
}
void strong(int* n)
{
	int org=*n;
	int sum=0;
	while(*n>0)
	{
		int digit=*n%10;
		int fact=1;
		int i =1;
		while(i<=digit)
		{
			fact=fact*i;
			i++;
		}
		sum=sum+fact;
		*n=*n/10;
	}
	printf("%d",org);
	if(sum==org)
		printf(" strong number");
	else
		printf(" not strong");
} 