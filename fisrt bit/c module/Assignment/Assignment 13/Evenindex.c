void main()
{
	int n;
	printf("\nenter the size:");
	scanf("%d",&n);
	 int *arr=(int*)malloc(n* sizeof(int));
	
	for(int i=0 ; i<n;i++)
	{
		scanf("%d",&arr[i]);
	}
		printf("Even index elements are:\n");
	for(int i=0;i<n;i=i+2)
	{
		printf("%d ",arr[i]);
	}
	free(arr);
}