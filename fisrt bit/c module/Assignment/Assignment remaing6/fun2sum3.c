void sum(int,int);
void main()
{
	int s ,e;
	printf("enter the number");
	scanf("%d%d",&s,&e);
	sum(s,e);
}
void sum(int s, int e)
{
	int sum=0;
	while(s<=e)
	{
        sum=sum+s;
        
		s++;
	}
		printf("sum is %d ",sum);
}