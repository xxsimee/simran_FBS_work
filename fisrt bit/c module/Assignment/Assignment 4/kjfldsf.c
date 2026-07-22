int isPrime();
void main()
{
	if(isPrime())
		printf("no is prime");
	else
		printf("no is not prime");
}

int isPrime()
{
	int no;
	printf("Enter a number");
	scanf("%d",&no);
	
	for(int i=2;i<no;i++)
	{
		if(no%i==0)
			return 0;
	}
	
	return 1;
}