void sum(int*,int*);
void main()
{//input 1 5 = 1 aur 5 che bich ke sare number ki sum dega
  	int s,e;
	printf("enter the first and last digit");
	scanf("%d%d",&s,&e);
	sum(&s,&e);
}
void sum(int* s,int* e)
{
	int add=0;
	while(*s<=*e)
	{
        add=add+*s;
        
		(*s)++;
	}
	printf("add is %d",add);
}