void age(int);
void main()
{
	int ag=16;
	age(ag);
}
void age(int ag)
{
	if(ag<12)
	{
		printf("child");
	}
	else
	{
		if(ag>=12 && ag<=19)
		{
			printf("teenager");
		}
		else
		{
			if(ag>=20 && ag<=59)
			{
				printf("adult");
			}
			else
			{
				printf("senior");
			}
		}
	}
}