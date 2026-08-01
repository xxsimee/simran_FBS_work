void main()
{
	char str[20];
	printf("enter string 1:");
	scanf("%s",str);
	char str1[20];
	printf("enter string 2:");
	scanf("%s",str1);
    if(strcmp(str,str1)==0)
    {
    	printf("same");
	}
	else
	{
		printf("not same");
	}
}