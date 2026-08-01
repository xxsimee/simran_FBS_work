void main()
{
	char str[20];
	printf("enter the string : ");
	scanf("%s",str);
	char* upper= strupr(str);
	printf("%s",upper);
	
}