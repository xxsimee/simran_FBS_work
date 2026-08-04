void replace(char* str)
{
	for(int i=0;str[i]!='\0'; i++)
	{
		if(str[i]=='a')
		{
			str[i]='$';
		}
	}
	
}
 
void main()
{
	char str[10];
	printf("\nenter the string :");
	scanf("%s",str);
	
	replace(str);
	printf("%s",str);
}