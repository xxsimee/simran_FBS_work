void main()
{
	char str[20];
	printf("enter the string :");
	scanf("%s",str);
	char cha[20];
	printf("enter the char :");
	scanf("%s",cha);
	char* ptr= strpbrk(str,cha);
	if(ptr !=0)
		printf("%c",*ptr);
	else
		printf("not found");

	
}