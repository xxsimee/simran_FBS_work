void evenodd(int*,int);
void main()
{
	int arr[5];
	int size=sizeof(arr)/sizeof(arr[0]);
	evenodd(arr,size);
}
void evenodd(int* arr,int size)
{
	printf("enter the element");
    for(int i=0;i<size;i++)
    	scanf("%d",&arr[i]);
    printf("Array is : ");
    for(int i=0;i<size;i++)
    	printf("%d ",arr[i]);
    //find even or odd 
    printf("\neven number : ");
    for(int i=0;i<size;i++)
       {
       	if(arr[i]%2==0)
       		printf("%d ",arr[i]);
       }
	   printf("\nodd number: ");
	   for(int i=0;i<size;i++)
	   {
	   	if(arr[i]%2!=0)
	   		printf(" %d",arr[i]); 
	   }
}