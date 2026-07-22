void numberTable();
void main()
{
	numberTable();
}
void numberTable()
{
	int n;
	printf("enter the number");
	scanf("%d",&n);
	int n2=1;
	int n3;
	while(n2<=10)
	{
		n3=n*n2;
		printf("%d ",n3);
		n2++;
	}
}