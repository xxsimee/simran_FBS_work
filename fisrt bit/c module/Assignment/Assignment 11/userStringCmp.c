void StringCmp(char* ,char*);
void main()
{
	char str[20];
	printf("enter string 1:");
	scanf("%s",str);
	char str1[20];
	printf("enter string 2:");
	scanf("%s",str1);
	StringCmp(str,str1);
	
}
void StringCmp(char* str,char* str1)
{
	int i=0;
	while(str[i]==str1[i] && str[i]!='\0')
	{
		i++;
    }
    if(str[i]==str1[i])	
			printf("same");
		else
			printf("Not same");
}
