void sum();
void main()
{
	sum();
}
void sum()
{
	int s ,e;
	printf("enter the number");
	scanf("%d%d",&s,&e);
	int sum=0;
	while(s<=e)
	{
        sum=sum+s;
        
		s++;
	}
		printf("sum is %d ",sum);
}