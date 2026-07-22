void strong(int);
void main()
{
	int no;
	printf("Enter Number :");
	scanf("%d",&no);
	strong(no);
}
void strong(int no)
{
	int digit;
	int num=1;
	for(int i=1; i<=no; i++)
	{
		int sum=0;
		int temp=i;
		while(temp>0)
		{
			 digit=temp%10;
			 int fact=1;
			 int k=1;
			 for(k=1; k<=digit ; k++)
			 {
			 	fact=fact*k;
			 }
			 sum=sum+fact;
			 	temp=temp/10;
	}
			
		if(sum==i)
			printf("%d \n",i);
	}
}