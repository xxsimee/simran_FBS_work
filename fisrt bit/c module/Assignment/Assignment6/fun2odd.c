void odd(int n);
void main()
{
	int n ;
	printf("enter the the range :");
	scanf("%d",&n);
	odd(n);
}
void odd(int n)
{
	int yes=0;
	int i=1;
	for(int i=1 ; i<=n ;i++)
	{
		yes=0;
	    for(int j=1; j<=i;j++)
	        {
	    	      if(i%j==0)
		        {
		            yes++;	
		        }
	       }
	   if(yes==2)
	        {
		      printf("%d ",i);
	        }
	}
}