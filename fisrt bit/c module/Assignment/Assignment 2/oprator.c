void main()
{
	int a =16;
	int b=18;
	int op = '-';
	int res;
	if (op== '+')
	{
		res = a+b;
		printf("result %d",res);
	}
	else
	{
		if (op== '*')
		{
			res=a*b;
			printf("result %d",res);
		}
		else
		{
			if(op== '-')
			{
				res=a-b;
				printf("result %d",res);
			}
			else
			{
				if(op== '/')
				{
					res=1/b;
					printf("result %d",res);
				}
				else
				{
					res=a%b;
					printf("result %d",res);
				}
			}
		}
	}
	
}