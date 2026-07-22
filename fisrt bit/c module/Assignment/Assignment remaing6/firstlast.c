void firstlast();
void main()
{
	firstlast();
}
void firstlast()
{
	int n;
	printf("enter number");
	scanf("%d",&n);
int last=0;
int first=0;
last=n%10;
while(n>0)
{
	first=n%10;
	n=n/10;
}
printf("%d %d \n",first, last);
int sum=first+last;
printf("sum of first and last digit is %d", sum);
}