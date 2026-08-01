char* StringCat(char*,char*,char*,int);
void main()
{
	//char str1[]="firstbit";
	//char str2[]="solution";
	char str1[20];
	char str2[20];
	int n;
	printf("enter string 1 :");
	scanf("%s",str1);
	printf("enter string 2:  ");
	scanf("%s",str2);
	printf("enter the number of character :");
	scanf("%d",&n);
	char cat[50];
	StringCat(str1,str2,cat,n);
	printf("after adding the string is :%s",cat);
}
char* StringCat(char* str1, char* str2,char* cat,int n)
{
	int i=0;
	int j=0;
	while(str1[i]!='\0')
	{
		cat[i]=str1[i];
		i++;
	}
	cat[i]='\0';
	while(str2[j]!='\0' && j<n)
	    {
	    	
	   		cat[i]=str2[j];
	    	i++;
			j++;
		}
		
			cat[i]='\0';
	return cat ;

}