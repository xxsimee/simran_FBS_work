void oprator(int* ,int* ,char*);
void main()
{
	int a,b;
	char ch;
	printf("enter number ");
   scanf("%d %d",&a,&b);

   printf("enter char ");
   scanf(" %c",&ch);
	oprator(&a,&b,&ch);
}
void oprator(int* a, int* b, char* ch)
{
	int res;
	if (*ch== '+')
	{
		res = *a + *b;
		printf("result %d",res);
	}
	else
	{
		if (*ch== '*')
		{
			res=*a * *b;
			//printf("result %d",res);
		}
		else
		{
			if(*ch== '-')
			{
				res=*a - *b;
			//	printf("result %d",res);
			}
			else
			{
				if(*ch== '/')
				{
					res=*a / *b;
				//	printf("result %d",res);
				}
				else
				{
					res=*a % *b;
				//	printf("result %d",res);
				}
			}
		}
	}
	printf("result %d",res);
}
