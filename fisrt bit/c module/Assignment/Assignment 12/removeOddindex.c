void RemoveOddIndex(char* str)
{
	char str2[20];
	int j=0;
	for(int i=0;str[i]!='\0';i++)
	{
		if(i%2==0)
		{
			str2[j]=str[i];
			j++;
		}
	}
	str2[j]='\0';
	printf("after removing odd  index :%s",str2);
}
void main()
{
	char str[20];
	int n;
	printf("\n enter the string:");
	scanf("%s",str);
	
	RemoveOddIndex(str);
	 //printf("string after removing odd index: %s",str);
	
}