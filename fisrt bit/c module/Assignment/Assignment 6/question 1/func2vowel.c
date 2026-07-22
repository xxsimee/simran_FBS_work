char vowel();
void main()
{
char vol=vowel();
printf("%c",vol);	
}
char vowel()
{
	char c='e';
	//char a , e, i , o ,u;
	if (c== 'a' || c== 'e' || c== 'i'|| c =='o' || c =='u')
	{
		printf("%c is vowel", c);
	}
	else
	{
		printf("%c is not vowel",c);
	}
	return c;
}