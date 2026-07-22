void main()
{
int user , num;
while(1)
{
	printf("\n Enter the number :");
	scanf("%d",&num);
	printf("\n 1. To check number is even or odd :");
	printf("\n 2. To check number is prime or not :");
	printf("\n 3. To check number is pallindrome or not :");
	printf("\n 4. To check number is positive ,negative or zero :");
	printf("\n 5. To reverse a number :");
	printf("\n 6. To find sum :");
	printf("\n select any one option\n ");
	scanf("%d",&user);
	if(user==1)
	{
		if(num%2==0)
		{
			printf("number is even");
		}
		else
		{
			printf("number is odd");
		}
	}
	if(user==2)
	{
		int i;
		int yes=0;
		for(i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				yes++;
			}
		}
		if(yes==2)
		{
			printf("number is prime ");
		}
		else
		{
			printf("number is not prime");
		}
	}
	if(user==3)
	{
		int temp=num;
		int sum=0;
		int rev;
		while(num>0)
		{
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		sum=sum+ rev;
		if(sum==temp)
			printf("number is pallidrome");
		else
		{
			printf("number is not palidrome");
		}	
	}
	if(user==4)
	{
	   if(num>0)
	   {
	   	printf("number is positive");
	   }
	   if(num<0)
	   {
	   	printf("number is nagtive");
	   }
	   if(num==0)
	   {
	   	printf("number is zero");
	   }
	}
	if(user==5)
	{
		int rev=0;
		while(num>0)
		{
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
	printf("reverse is %d",rev);
	}
	if(user==6)
	{
		int r1,d1;
		int sum=0;
	  	while(num>0)
	  	{
	  	  r1=num%10;
	  	  sum=sum+ r1;
	  	  num=num/10;
		}
	   printf("sum of digit is : %d", sum);	
	}
}	
}