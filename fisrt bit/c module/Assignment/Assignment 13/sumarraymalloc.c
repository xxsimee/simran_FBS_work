void main()
{
	int n;
	printf("\nenter the size:");
	scanf("%d",&n);
	 int *arr=(int*)malloc(n* sizeof(int));
	printf("enter the element");
    for(int i=0;i<n;i++)
    	scanf("%d",&arr[i]);
    printf("Array is : ");
    for(int i=0;i<n;i++)
    	printf("%d ",arr[i]);
    //sum of number of element in array
    int sum=0;
    for(int i=0;i<n;i++)
    {
    	sum=sum+arr[i];
	}
    printf("\nsum of all element in array is %d",sum);
}