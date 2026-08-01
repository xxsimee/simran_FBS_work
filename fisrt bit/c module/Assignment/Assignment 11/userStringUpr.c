char* StringUpr(char*);
void main()
{
	char str[20];
	printf("enter the string : ");
	scanf("%s",str);
	char* upper= StringUpr(str);
	printf("string in uppercase is %s",upper);
}

char* StringUpr(char* str)
{
	int i=0;
	while(str[i]!='\0')
	{
			str[i]=str[i]-32;// -('a' -'A');
				i++;
	}
	return str;
	
}