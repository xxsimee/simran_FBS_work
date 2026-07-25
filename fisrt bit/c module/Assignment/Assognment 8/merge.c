void main()
{
	int arr[]={1,3,5,7,9};
	int brr[]={2,8,4,34,23}; 
	int crr[20];
	for(int i=0;i<5;i++)
	{
		crr[i]=arr[i];
		//printf("%d ",crr[i]);
	}
	for(int i=0; i<5;i++)
	{
		crr[5+i]=brr[i];
	}
	for(int i=0;i<10;i++)
	{
		printf("%d ",crr[i]);
	}
	
}