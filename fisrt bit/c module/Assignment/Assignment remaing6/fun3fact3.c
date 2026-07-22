int fact();
void main()
{
	int num=fact();
	printf("%d",num);
}
int fact()
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
		return i;
}