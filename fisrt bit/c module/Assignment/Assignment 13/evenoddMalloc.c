void main()
{
	int* arr;
	arr=(int*)malloc(5 * sizeof(int));
	printf("enter the element");
    for(int i=0;i<5;i++)
    	scanf("%d",&arr[i]);
    printf("Array is : ");
    for(int i=0;i<5;i++)
    	printf("%d ",arr[i]);
    //find even or odd 
    printf("\neven number : ");
    for(int i=0;i<5;i++)
       {
       	if(arr[i]%2==0)
       		printf("%d ",arr[i]);
       }
	   printf("\nodd number: ");
	   for(int i=0;i<5;i++)
	   {
	   	if(arr[i]%2!=0)
	   		printf(" %d",arr[i]); 
	   }
}