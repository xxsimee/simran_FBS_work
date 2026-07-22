void fact(int n);
void main()
{
	int n;
	printf("enter the number");
	scanf("%d",&n);
	fact(n);
}
void fact(int n)
{
	int i=1 ;
	while(n>1)
	{
		i=i*n;
		n--;
	}
		printf("%d",i);
}