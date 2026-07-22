int armstrongnumber();
void main()
{
   int armstrong=armstrongnumber();
   if(armstrong==1)
   printf("armstrong");
   else
   printf("Not armstrong");
}
int armstrongnumber()
{
	int n;
	printf("enter the number");
	scanf("%d",&n);
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
		return 1;
	else
		return 0;
}