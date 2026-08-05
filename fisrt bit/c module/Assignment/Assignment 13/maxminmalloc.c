void main()
{
	int n;
	printf("\nenter the size:");
	scanf("%d",&n);
	 int *arr=(int*)malloc(n* sizeof(int));
	for(int i=0;i<n;i++)
	{
		scanf("%d",&arr[i]);
	}
	for(int i=0;i<n;i++)
	{
		printf("%d ",arr[i]);
	}
	int max=arr[0];//putting the value of arr from 0th index
	for(int i=0;i<n;i++)
	{
		if(arr[i]>max)
			max=arr[i];
	}
	printf("\nmaximum number is %d",max);
	for(int i=0;i<n;i++)
	{
		if(arr[i]<max)
			max=arr[i];
	}
	printf("\nminimum number is %d",max);
	
}