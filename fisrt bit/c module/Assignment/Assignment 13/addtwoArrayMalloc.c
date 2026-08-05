void main()
{
	int arr[]={9,3,2,2,9,6,1,7,4,9,9,1,4,4,4,9,0,4};
	int brr[]={9,3,7,3,0,5,4,3,2,1,9,1};
	
	int s1=sizeof(arr)/sizeof(int);
	int s2=sizeof(brr)/sizeof(int);
	
	int min= s1<s2? s1 :s2;
	int max= s1>s2? s1 :s2;
	
	int* crr= (int*) malloc(max* sizeof(int));
	for(int i=0;i<min;i++)
	{
		crr[i]=arr[i]+brr[i];
	}
	for(int i=min;i<max;i++)
	{
		crr[i]=brr[i];
	}
	for(int i=0;i<max;i++)
	{
		printf("%d ",crr[i]);
	}
	free(crr);
}