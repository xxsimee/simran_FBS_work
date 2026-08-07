typedef struct Product
{
	int id;
	char name[20];
	double price;
	int quantity;
}Product;

void storeProduct(Product* pdt,int size)
{
	for(int i=0;i<size;i++)
	{
		scanf("%d",&pdt[i].id);
		scanf("%s",pdt[i].name);
		scanf("%lf",&pdt[i].price);
		scanf("%d",&pdt[i].quantity);
	}
}

void displayProduct(Product* pdt,int size)
{
	for(int i=0;i<size;i++)
	{
		printf("\n%d  %s  %.2lf %d\n",pdt[i].id,pdt[i].name,pdt[i].price,pdt[i].quantity);
	}
}
void main()
{
	Product pdt[3];
	
	printf("Enter Product details: id, Name, price,Quantity\n ");
	storeProduct(pdt,3);
	
	printf("\nProduct details are :");
	displayProduct(pdt,3);
	
}