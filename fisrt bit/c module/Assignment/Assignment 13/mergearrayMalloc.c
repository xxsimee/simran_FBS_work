void main()
{
	int arr[]={1,3,5,7,9};
	int brr[]={2,8,4,34,23}; 
	int s1=sizeof(arr)/sizeof(int);
	int s2=sizeof(brr)/sizeof(int);
	
	int* crr= (int*) malloc((s1+s2)* sizeof(int));

	for(int i=0;i<s1;i++)
	{
		crr[i]=arr[i];
		//printf("%d ",crr[i]);
	}
	for(int i=0; i<s2;i++)
	{
		crr[s1+i]=brr[i];
	}
	for(int i=0;i<s1+s2 ;i++)
	{
		printf("%d ",crr[i]);
	}
	 free(crr);
}