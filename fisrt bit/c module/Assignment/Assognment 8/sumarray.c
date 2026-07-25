void main()
{
	int arr[5];
	printf("enter the element");
    for(int i=0;i<5;i++)
    	scanf("%d",&arr[i]);
    printf("Array is : ");
    for(int i=0;i<5;i++)
    	printf("%d ",arr[i]);
    //sum of number of element in array
    int sum=0;
    for(int i=0;i<5;i++)
    {
    	sum=sum+arr[i];
	}
    printf("sum of all element in array is %d",sum);
}