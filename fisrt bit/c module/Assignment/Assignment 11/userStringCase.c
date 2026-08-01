char* StringCase(char*, char*);
void main()
{
	char str1[10];
	printf("enter the string1 :");
	scanf("%s",str1);
	char str2[20];
	printf("enter the string2 :");
	scanf("%s",str2);
	char* chr= StringCase(str1,str2);
	if(chr==0)
		printf("same");
	else
		printf("not same");
}

char* StringCase(char* str1, char*str2)
{
	int i=0;
	while(str1[i]!='0' && str2[i]!='\0')
	{
		char chr1= str1[i];
		char chr2=  str2[i];
		
		if(chr1>='A' && chr1<='Z')
			chr1=chr1+32;
		if(chr2>='A' && chr2<='Z')
			chr2=chr2+32;
		if(chr1!=chr2)
		{
			return str1[i]-str2[i];
		}
		i++;
	}
}