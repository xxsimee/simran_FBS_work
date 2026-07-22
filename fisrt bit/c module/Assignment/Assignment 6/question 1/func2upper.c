char upper();
void main()
{
	char ch =upper();
	printf(" \n return character is %c",ch);
}
char upper()
{
	char cha='A';
	if (cha>='A' && cha<='Z')
	{
		printf("upper case");	
	}
	else
	{
		printf("lower case");
	}
	return cha;
}