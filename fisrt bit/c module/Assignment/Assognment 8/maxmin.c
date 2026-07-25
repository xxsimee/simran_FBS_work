void main()
{
	int arr[5];
	printf("enter the element");
	for(int i=0;i<5;i++)
	{
		scanf("%d",&arr[i]);
	}
	for(int i=0;i<5;i++)
	{
		printf("%d ",arr[i]);
	}
	int max=arr[0];//putting the value of arr from 0th index
	for(int i=0;i<5;i++)
	{
		if(arr[i]>max)
			max=arr[i];
	}
	printf("\nmaximum number is %d",max);
	for(int i=0;i<5;i++)
	{
		if(arr[i]<max)
			max=arr[i];
	}
	printf("\nminimum number is %d",max);
	
}