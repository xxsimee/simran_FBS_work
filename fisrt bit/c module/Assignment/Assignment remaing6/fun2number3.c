void number(int);
void main()
{
	int n;
	printf("enter the number");
	scanf("%d",&n);
	number(n);
}
void number(int n)
{
	while(n<=10)
	{
		printf("%d ",n);
		n++;
	}
}