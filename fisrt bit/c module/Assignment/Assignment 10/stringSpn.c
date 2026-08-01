void main()
{
   // strspn: staring ke hi count karta hai!!
	 char str1[10];
	char str2[10];
	printf("enter the str1 :");
		scanf("%s",str1);
	printf("enter the str2 :");
	scanf("%s",str2);
	int chN=strspn(str1,str2);
	printf("%d",chN);
	return 0;
	
}