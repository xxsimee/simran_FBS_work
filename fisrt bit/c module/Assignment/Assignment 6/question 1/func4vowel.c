char vowel(char);
void main()
{
	char ch='a';
	char vol= vowel(ch);
	printf("vowel is %c",vol);
}
char vowel(char ch)
{
	if (ch== 'a' || ch== 'e' || ch== 'i'|| ch=='o' || ch =='u')
	{
		return ch;
	//	printf("%c is vowel", ch);
	}
	return ch;
}