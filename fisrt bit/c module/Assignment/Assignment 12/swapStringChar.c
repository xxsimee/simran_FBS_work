void swapstringChar(char* str)
{
	int i=0;
	while(str[i]!='\0')
	{
		i++;
	}
	
	char temp;
		temp= str[0];
		str[0]= str[i-1];
		str[i-1]=temp;
}

void main()
{
	char str[10];
	printf("\n enter the string :");
	scanf("%s",str);
	swapstringChar(str);
	printf("\n after swaping the fisrt and last character string is %s :", str);
}
