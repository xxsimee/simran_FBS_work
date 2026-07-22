void number();
void main()
{
	number();
}
void number()
{
	int n;
	printf("enter the number");
	scanf("%d",&n);
	while(n<=10)
	{
		printf("%d ",n);
		n++;
	}
}