void main()
{
	//char str[]="fisrtbitsolution";
	char str[20];
	printf("enter the string:");
	scanf("%s",str);
	char str2[20];
	strncpy(str2,str,2);
	printf("aftr coping  string is %s",str2);
}