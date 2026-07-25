void  MaxMin(int* , int);
void main()
{
	int arr[5];
	int size=sizeof(arr)/sizeof(arr[0]);
	MaxMin(arr,size);
}
void MaxMin(int* arr, int size)
{
	printf("enter the element");
	for(int i=0;i<size;i++)
	{
		scanf("%d",&arr[i]);
	}
	for(int i=0;i<size;i++)
	{
		printf("%d ",arr[i]);
	}
	int max=arr[0];//putting the value of arr from 0th index
	for(int i=0;i<size;i++)
	{
		if(arr[i]>max)
			max=arr[i];
	}
	printf("\nmaximum number is %d",max);
	int min=arr[0];
	for(int i=0;i<size;i++)
	{
		if(arr[i]<min)
			max=arr[i];
	}
	printf("\nminimum number is %d",min);
	
} 