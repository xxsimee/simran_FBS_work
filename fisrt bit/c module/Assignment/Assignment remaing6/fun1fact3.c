void fact();
void main()
{
	fact();
}
void fact()
{
	int n;
	int i=1 ;
	printf("enter the number");
	scanf("%d",&n);
	while(n>1)
	{
		i=i*n;
		n--;
	}
		printf("%d",i);
}