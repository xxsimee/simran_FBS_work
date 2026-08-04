void removeIndex(char* str,int n)
{
	for(int i=n; str[i]!='\0';i++)
	{
		str[i]=str[i+1];
	}
}

void main()
{
	char str[20];
	int n;
	printf("\n enter the string:");
	scanf("%s",str);
	
	printf("\n enter the index want to remove:");
	scanf("%d",&n);
	removeIndex(str,n);
	 printf("string after removing index by user %s",str);
	
}