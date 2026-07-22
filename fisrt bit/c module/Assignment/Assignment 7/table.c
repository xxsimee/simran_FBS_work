void table(int*);
void main()
{
	int n;
	printf("enter number ");
	scanf("%d",&n);
	table(&n);
}
void table(int* n)
{
	int n2=1;
	while(n2<=10)
	{
		int n3=*n*n2;
		printf("%d ",n3);
		n2++;
	}
}