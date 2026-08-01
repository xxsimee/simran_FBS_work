int StringLen(char*);
void main()
{
	char* str[40];
	printf("enter the string :");
	scanf("%s",str);
	
  int len=StringLen(str);
  printf("Length of the string :%d",len);
}

int StringLen(char* str)
{
	int i=0;
	while(str[i]!='\0')
	{
		i++;
	}
	return i;
}