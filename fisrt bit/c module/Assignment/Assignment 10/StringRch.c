void main()
{
	char str[10];
	char ch;
	printf("enter the str :");
	scanf("%s",str);
	printf("number of occurrence");
	scanf(" %c",&ch);
	char* occ=strrchr(str,ch);
	if(occ!=0)
	printf("character found at:%c",*occ);
	else
	printf("not found");
}