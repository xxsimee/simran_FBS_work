char* stringcpy(char* ,char*,int );
void main()
{
	//char sour[]="firstbitsolution";
	char sour[20];
	printf("enter the string :");
	scanf("%s",sour);
	char dest[20];
	int n;
	printf("enter number of character copied");
	scanf("%d",&n);
	stringcpy(dest,sour,n);
}
char* stringcpy(char* dest,char* sour, int n)
{
	int i=0;
	while(sour[i]!='\0' && i<n)
	{
		dest[i]=sour[i];
		i++;
	}
	dest[i]='\0';
	printf(" copied string is %s",dest);
	return dest;
}