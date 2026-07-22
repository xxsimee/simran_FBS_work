int strongnumber();
void main()
{
	int number=strongnumber();
	if(number==1)
	printf(" number is strong");
	else
	printf(" number is not strong");
}
int strongnumber()
{
	int n;
	printf("Enter the number");
	scanf("%d",&n);
	int org=n;
	int sum=0;
	while(n>0)
	{
		int digit=n%10;
		int fact=1;
		int i =1;
		while(i<=digit)
		{
			fact=fact*i;
			i++;
		}
		
		sum=sum+fact;
		n=n/10;
		
	}
	printf("%d",org);
	if(sum==org)
		return 1;
	else
		return 0;
} 