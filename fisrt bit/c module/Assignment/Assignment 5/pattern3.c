void main()
{
	for(int row=5; row>=1 ; row--)
	{
		for(int k=5; k>=row;k--)
     	{
     		printf(" ");
		 }
		for(int col=1; col<=row; col++)
		{
			printf("* ");	
     	}
     	printf("\n");
	} 
}