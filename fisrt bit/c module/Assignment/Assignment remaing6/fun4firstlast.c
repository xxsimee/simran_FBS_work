int firstlast(int);
void main()
{
	int n;	
	printf("Enter number");
	scanf("%d",&n);	
	int num=firstlast(n);
	printf("sum of first and last digit is %d",num);
	
}
int firstlast(int n)
{
int last=0;
int first=0;
last=n%10;
while(n>0)
{
	first=n%10;
	n=n/10;
}
int sum=first+last;
printf("%d %d \n",first, last);
return sum;
//printf("sum of first and last digit is %d",sum);
}