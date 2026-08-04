int  palidromString(char* str)
{
	int len=strlen(str);
	for(int i=0;i<len/2;i++)
	{
		if(str[i] != str[len-i-1])
			return 0;
	}
	return 1;
}

void main()
{
	char str[10];
	printf("enter string:");
	scanf("%s",str);
	int result=palidromString(str);
	if(result == 1)
    printf("Palindrome");
else
    printf("Not Palindrome");
}