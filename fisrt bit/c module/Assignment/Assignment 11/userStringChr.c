char* StringChr(char*,char);
void main()
{
	char str[10];
	printf("enter the string: ");
	scanf("%s",str);
	char n;
	printf("number of character:");
	scanf(" %c",&n);
	char* chr=StringChr(str,n);
	if(chr!=0)
		printf("character found :%s",chr);
	else
	    printf("character not found");
}
char* StringChr(char* str,char n)
{
	 for(int i=0;str[i]!='\0';i++)
	 {
	 	if(str[i]==n)
	 		return &str[i];
	 }
	 
}