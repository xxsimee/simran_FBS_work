void main()
{
	
	char str1[]="firstbit";
	char str2[30];
	printf("enter the string : ");
	scanf("%s",str1);
	
	memcpy(str2,str1,strlen(str1)+1);
	printf("copy string is %s",str2);
	
}