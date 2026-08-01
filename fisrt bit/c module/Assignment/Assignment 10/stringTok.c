#include<stdio.h>
void main()
{
	char str[30];
	printf("enter the string:");
	scanf("%s ",str);//[^\n]
	char* str2= strtok(str," ");
	while(str2 != NULL)
	{
		printf("%s\n",str2);
		str2=strtok(NULL," ");
	}
	 //strtok(str2,str);

    //printf("aftr adding string is %s",str2);
}