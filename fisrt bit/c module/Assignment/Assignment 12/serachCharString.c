int serachChar(char* str,char ch)
{
	 for(int i=0; str[i]!='\0';i++)
	 {
	 	if(str[i]==ch)
	 	{
	 		return i;
		}
	 }
	 return -1;
}
void main()
{
	char str[20];
	printf("\nenter string 1:");
	scanf("%s",str);
	char ch;
	printf("\nEnter the character you want to search: ");
	scanf(" %c",&ch);
	
	int result= serachChar( str, ch);
	if(result!=-1)
	{
		printf("found at index %d",result);
	}
	else
	{
		printf("not found");
	}
}