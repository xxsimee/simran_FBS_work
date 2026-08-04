void replaceSpace(char* str)
{
	for(int i=0;str[i]!='\0'; i++)
	{
		if(str[i]==' ')
		{
			str[i]='$';
		}
	}
}

void main()
{
	char str[10];
	printf("\nenter the string :");
	gets(str);
	//scanf("%[^\n]",str);
	
	replaceSpace(str);
	printf("%s",str);
}