char* StringRev(char*);
void main()
{
	char str[30];
	printf("enter the string ");
	scanf("%s",str);
	StringRev(str);
	printf("%s",str);
}

char* StringRev(char* str)
{
	int i=0;
	int len =strlen(str);
	while(i<len/2)
	{	
	    char temp=str[i];
		str[i]=str[len-1-i];
		str[len-1-i]=temp;
		i++;
	}
	return str;
}