typedef struct Sale
{
	char name[5];
	int quantity;
	double price;
}Sale;

void additemSale(Sale* sarr,int* ci,Sale item)
{
	if(*ci==5)
	{
		printf("Array fulled");
		return ;
	}
	sarr[*ci]=item;
	(*ci)++;
}
void storeSale(Sale* sarr,int ci)
{
	for(int i=0; i<ci;i++)
	{
		scanf("%s",sarr[i].name);
		scanf("%d",&sarr[i].quantity);
		scanf("%lf",&sarr[i].price);
	}
}

void displaySale(Sale* sarr, int ci)
{
	for(int i=0; i<ci;i++)
	{
		printf("Name:      %s\n",sarr[i].name);
		printf("Quantity:  %d\n",sarr[i].quantity);
		printf("Price:     %lf\n",sarr[i].price);
		printf("\n");
	}
}

void main()
{
	Sale sarr[5];
	int ci=4;
	printf("Enter sale product: name, quantity,price\n");
	storeSale(sarr,ci);
	
	printf("Product Deatils are:\n");
	displaySale(sarr,ci);
	
	
	Sale item;
	printf("Add item :\n");
	scanf("%s%d%lf",item.name,&item.quantity,&item.price);
	additemSale(sarr,&ci,item);
	
	printf("\nProduct Deatils are after adding :\n");
	displaySale(sarr,ci);
	
	
	
}