int* alternet(int*);
void main()
{
	int arr[]={43,5,23,7,9,8,42};
	alternet(arr);
}
int* alternet(int* arr)
{
	for(int i=0;i<7;i=i+2)
		printf("%d ",arr[i]);
}