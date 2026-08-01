char* stringcpy(char* ,char* );
void main()
{
	//char sour[]="firstbitsolution";
	char sour[20];
	printf("enter the string :");
	scanf("%s",sour);
	char dest[20];
	stringcpy(dest,sour);
}
char* stringcpy(char* dest,char* sour)
{
	int i=0;
	while(sour[i]!='\0')
	{
		dest[i]=sour[i];
		i++;
	}
	dest[i]='\0';
	printf(" copied string is %s",dest);
	return dest;
}