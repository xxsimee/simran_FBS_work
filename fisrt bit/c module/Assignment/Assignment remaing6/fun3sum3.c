int sum();
void main()
{
	int add=sum();
	printf("%d ",add);
}
int sum()
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
		return sum;
}