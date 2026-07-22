int sum(int,int);
void main()
{
	int s ,e;
	printf("enter the number");
	scanf("%d%d",&s,&e);
	int add=sum(s,e);
	printf("%d ",add);
}
int sum(int s, int e)
{
	int sum=0;
	while(s<=e)
	{
        sum=sum+s;
        
		s++;
	}
		return sum;
}