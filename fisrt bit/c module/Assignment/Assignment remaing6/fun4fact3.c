int fact(int);
void main()
{
	int n;
	int i=1 ;
	printf("enter the number");
	scanf("%d",&n);
	int num=fact(n);
	printf("%d",num);
}
int fact(int n)
{
	int i=1;
	while(n>1)
	{
		i=i*n;
		n--;
	}
		return i;
}