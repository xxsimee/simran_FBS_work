void main()
{
	char str1[20];
	char str2[20];
	printf("enter string 1: ");
	scanf("%s",str1);
	printf("enter string 2: ");
	scanf("%s",str2);
	char* str=strstr(str1,str2);
	if(str!=0)
	{
		printf("substring found %s", str2);
	}
	else
	{
		printf("Substring not found");
	}
}