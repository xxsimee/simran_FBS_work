void StringCmp(char* ,char*,int );
void main()
{
	char str[20];
	printf("enter string 1:");
	scanf("%s",str);
	char str1[20];
	printf("enter string 2:");
	scanf("%s",str1);
	int n;
	printf("enter the number of character");
	scanf("%d",&n);
	StringCmp(str,str1,n);
	
}
void StringCmp(char* str,char* str1,int n)
{
	int i=0;
	while(str[i]==str1[i] && str[i]!='\0' && i<n)
	{
		i++;
    }
    if(i==n || str[i]==str1[i])	
			printf("same");
		else
			printf("Not same");
}
