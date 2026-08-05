void main()
{
	int n;
	printf("enter index you want:");
	scanf("%d",&n);
	
	int* arr =(int*)malloc(n* sizeof(int));
	
	printf("enter element:");
	for(int i=0;i<n;i++)
		scanf("%d",&arr[i]);

	for(int pass=0; pass<n-1; pass++)
    {
        for(int i=0; i<n-1-pass; i++)
        {
            if(arr[i] > arr[i+1])
            {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
    }
     for(int i=0;i<n;i++)
     {
     	printf("%d ",arr[i]);
	 }
	 free(arr);
}