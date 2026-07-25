int search(int*);
void main()
{
	int arr[5];
int result=	search(arr);
	if(result==-1)
		printf("number is not found ");
	else
		printf("number is found at %d",result);
}
int search(int* arr)
{
	printf("enter the number");
	for(int i=0;i<5;i++)
		scanf("%d",&arr[i]);
	printf("array is :");
	for(int i=0;i<5;i++)
		printf("%d ",arr[i]);
	//search element
	int ele;
	int flag=-1;
	printf("\nwhich element you want to search");
	scanf("%d",&ele);
	for(int i=0;i<5;i++)
	{
		if(arr[i]==ele)
		{
			//flag=i;
			return i;
			break;
		}
	}
	return -1;
}