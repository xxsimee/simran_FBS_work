void main()
{
	int* arr;
	arr= (int*)malloc(5* sizeof(int));
	printf("enter the element");
    for(int i=0;i<5;i++)
    	scanf("%d",&arr[i]);
    printf("Array is : ");
    for(int i=0;i<5;i++)
    	printf("%d ",arr[i]);
    //find prime element 
    printf("\nPrime number: ");
   for(int i=0 ; i<5 ;i++)
	{
	int	yes=0;
	if(arr[i]<=1)
		continue;
	    for(int j=1; j<=arr[i];j++)
	        {
	    	      if(arr[i]%j==0)
		        {
		            yes++;	
		        }
	       }
	   if(yes==2)
	        {
		      printf("%d ",arr[i]);
	        }
	}
	free(arr);
}