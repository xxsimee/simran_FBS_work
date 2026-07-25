void main()
{
	int arr[]={12,1,5,7,22};

	for(int i=0;i<5;i++)
	{
		if(arr[i]>arr[i+1])
		{
			int temp=arr[i];
			arr[i]= arr[i+1];
			arr[i+1]=temp;
		}
	}
     for(int i=0;i<5;i++)
     {
     	printf("%d ",arr[i]);
	 }
}