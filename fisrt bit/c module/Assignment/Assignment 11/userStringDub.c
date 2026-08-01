char* mystrDup(char*);
void main()
{
    char str[20];
    printf("enrer the string :");
    scanf("%s",str);
	//char str[]="firstbit";
	 char* copy= mystrDup(str);
	 //printf("orignal string : %s\n",str);
	 printf("dublicate string : %s\n",copy);
	 
}
char* mystrDup(char* str)
{
	char *temp=malloc(strlen(str)+1);
	strcpy(temp,str);
	return temp;
}