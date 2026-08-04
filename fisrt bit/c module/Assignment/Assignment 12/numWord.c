int  numWord(char* str)
{
	int n=1;
	for(int i=0;str[i]!='\0';i++)
	{
		if(str[i]==' ')
			n++;
	}
	return n;
}

void main()
{
	char str[10];
	printf("\nenter the string:");
	//scanf("%s",str);
	gets(str);//fget(str,100,stdin); str string jisme input  100 max charact stbin input 
   int result=	numWord(str);
   printf("number of words in string are %d ",result);
}