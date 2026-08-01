void StringStr(char* ,char* );
void main()
{
	char str1[20];
	char str2[20];
	printf("enter string 1: ");
	scanf("%s",str1);
	printf("enter string 2: ");
	scanf("%s",str2);
	StringStr(str1,str2);
}
void StringStr(char* str1,char* str2)
{
	for(int i=0;str1[i]!='\0';i++)
	{
		int j=0;
		while(str2[j]!='\0' && str1[i+j]==str2[j])
		{
			j++;
		}
		//str1[i+j]==str2[j];
		if(str2[j]== '\0')
		{
			printf("substring found :%s",str2);
			return;
		}
    }    
}