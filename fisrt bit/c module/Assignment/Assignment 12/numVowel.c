int numVowel(char* str)
{
	int n=0;
	for(int i=0;str[i]!='\0' ;i++)
	{
		if(str[i]=='a' || str[i]=='e' || str[i]=='i' || str[i]=='o' || str[i]=='u')
		{
			n++;
		}
	}
	return n;
}

void main()
{
	char str[10];
	printf("\nenter the string:");
	scanf("%s",str);
   int result=	numVowel(str);;
   printf("number of vowels in string are %d ",result);
}