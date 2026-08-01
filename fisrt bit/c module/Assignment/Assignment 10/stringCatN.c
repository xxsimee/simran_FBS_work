void main()
{
	char str[20];
	printf("enter the string:");
	scanf("%s",str);
	char str2[20];
	strncat(str2,str,2);
	printf("aftr adding string is %s",str2);
}