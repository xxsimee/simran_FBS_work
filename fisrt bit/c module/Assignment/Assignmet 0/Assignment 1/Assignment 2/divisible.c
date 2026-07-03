void main()
{
	int n=25;
	if(n%3==0 && n%5==0)
	{
		printf("divisible by 3 and 5 both");
	}
	else
	{
		if(n%3==0)
		{
			printf("divisible by 3 not by 5");
		}
		else
		{
			if(n%5==0)
			{
				printf("divisible by 5 not by 3");	
			}
			else
			{
			printf("divisible by none");	
			}
		}
	}
}