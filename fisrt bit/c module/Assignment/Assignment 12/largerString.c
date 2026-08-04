char* largerString(char* str1 ,char* str2)
{
	int len1=0;
	while(str1[len1]!='\0')
	{
		len1++;
	}
	int len2=0;
	while(str2[len2]!='\0')
	{
		len2++;
	}
	if(len1>len2)
	{
		return str1;
	}
	else
		return str2;
}

void main()
{
	char str1[10];
	char str2[20];
	printf("enter str1:");
	scanf("%s",str1);
	printf("\nenter str2:");
	scanf("%s",str2);
	
	char* result=largerString(str1,str2);
	printf("larger string %s",result);
	
	
}