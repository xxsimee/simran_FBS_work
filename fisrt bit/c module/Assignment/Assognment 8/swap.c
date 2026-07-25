void main()
{
	int arr[]={10,22,43,54,2,5}; 
	for(int i=0;i<6/2;i++)
	{
		int temp=arr[i];
		arr[i]=arr[6-1-i];
		arr[6-1-i]=temp;
	}
	for(int i=0;i<6;i++)
		printf("%d ",arr[i]);
}