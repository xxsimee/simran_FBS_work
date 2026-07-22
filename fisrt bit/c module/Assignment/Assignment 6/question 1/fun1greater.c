void greater();
void main()
{
	greater();
}
void greater()
{
	int a=89;
	int b=8;
	int c=56;
	if(a>=b)
	{
		if(a>=c)
		{
			printf("%d is greater",a);
		}
		else
		{
				printf("%d is greater",c);
		}
   }
   else	if(b>=c)
   	{
   			printf("%d is greater",b);
	   }
	   else
	   {
	   		printf("%d is greater",c);
	   }

}