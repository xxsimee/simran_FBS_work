void main()
{
	char str[10];
	printf("enter the string: ");
	scanf("%s",str);
	char n;
	printf("number of character");
	scanf(" %c",&n);
	char*chr= strchr(str,n);
    if(chr!=0)
    	printf("character found : %s",chr);
    else
    	printf("character is not found");
	
}