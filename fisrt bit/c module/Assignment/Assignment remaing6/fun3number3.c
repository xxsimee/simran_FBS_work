int number();
void main()
{
	int num=number();
	printf("%d",num);
}
int number()
{
	int n;
	printf("enter the number");
	scanf("%d",&n);
	while(n<=10)
	{
		return n;
		n++;
	}
}