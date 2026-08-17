typedef struct Book
{
	int id;
	char bname[20];
	double price;
}Book;

void storeBook(Book* barr,int ci)
{
	for(int i=0;i<ci;i++)
	{
		scanf("%d",&barr[i].id);
		scanf("%s",barr[i].bname);
		scanf("%lf",&barr[i].price);
	}
}

void displayBook(Book* barr, int ci)
{
	for(int i=0;i<ci;i++)
	{
		printf("Book Id:    %d\n",barr[i].id);
		printf("Book Name:  %s\n",barr[i].bname);
		printf("Book Price: %.2lf\n",barr[i].price);
		printf("\n");
	}
}
void main()
{
	Book barr[6];
	
	printf("Enter the book details :\n");
	storeBook(barr,6);
	
	printf("Book Details are :\n");
	displayBook(barr,6);
}