void main()
{
int last=0;
int first=0;
int n=12345;
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