typedef struct Product
{
	int id;
	char name[20];
	double price;
	int quantity;
}Product;

void storeProduct(Product* pdt)
{
		scanf("%d",&pdt->id);
		scanf("%s",pdt->name);
		scanf("%lf",&pdt->price);
		scanf("%d",&pdt->quantity);	
}

void displayProduct(Product* pdt)
{
	{
		printf("\n%d  %s  %.2lf %d\n",pdt->id,pdt->name,pdt->price,pdt->quantity);
	}
}
void main()
{
	Product pdt1, pdt2, pdt3;
	
	printf("Enter Product details1: id, Name, price,Quantity\n ");
	 storeProduct(&pdt1);
	printf("Enter Product details1: id, Name, price,Quantity\n ");
	 storeProduct(&pdt2);
	printf("Enter Product details1: id, Name, price,Quantity\n ");
	 storeProduct(&pdt3);
	
	printf("\nProduct details are :");
	displayProduct(&pdt1);
	displayProduct(&pdt2);
	displayProduct(&pdt3);
	
}