void main()
{
	char str[10];
	char str1[10];
	printf("enter string1 :");
	scanf("%s",&str);
	printf("enter string2 :");
	scanf("%s",&str1);
    if(strncmp(str,str1,3)==0)
    {
    	printf("same");
	}
	else
	{
		printf("not same");
	}
}