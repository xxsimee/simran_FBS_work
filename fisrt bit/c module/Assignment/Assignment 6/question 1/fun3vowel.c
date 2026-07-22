void vowel(char);
void main()
{
 char ch;
 printf("enter the character");
 scanf("%c",&ch);
	vowel(ch);
}
void vowel(char ch)
{
	if (ch== 'a' || ch== 'e' || ch== 'i'|| ch=='o' || ch =='u')
	{
		printf("%c is vowel", ch);
	}
	else
	{
		printf("%c is not vowel",ch);
	}
}