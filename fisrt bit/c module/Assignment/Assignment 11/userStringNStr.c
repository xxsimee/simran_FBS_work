void StringStr(char* ,char*,int );
void main()
{
	char str1[20];
	char str2[20];
	printf("enter string 1: ");
	scanf("%s",str1);
	printf("enter string 2: ");
	scanf("%s",str2);
	int n;
	printf("enter the character: ");
	scanf("%d",&n);
	StringStr(str1,str2,n);
}

void StringStr(char* str1, char* str2, int n)
{
    for(int i=0; i<n && str1[i]!='\0'; i++)
    {
        int j=0;

        while(str2[j]!='\0' && (i+j)<n && str1[i+j]==str2[j])
        {
            j++;
        }

        if(str2[j]=='\0')
        {
            printf("Substring found: %s", str2);
            return;
        }
    }

    printf("Substring not found");
}