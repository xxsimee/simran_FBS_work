void numberTable(int);
void main()
{
	int n;
	printf("enter the number");
	scanf("%d",&n);
	numberTable(n);
}
void numberTable(int n)
{
	int n2=1;
	int n3;
	while(n2<=10)
	{
		n3=n*n2;
		printf("%d ",n3);
		n2++;
	}
}